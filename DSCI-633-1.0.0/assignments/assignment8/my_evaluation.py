import numpy as np
from collections import Counter

class my_evaluation:
    # Binary class or multi-class classification evaluation
    # Each data point can only belong to one class

    def __init__(self, predictions, actuals, pred_proba=None):
        # inputs:
        # predictions: list of predicted classes
        # actuals: list of ground truth
        # pred_proba: pd.DataFrame of prediction probability of belonging to each class
        self.predictions = np.array(predictions)
        self.actuals = np.array(actuals)
        self.pred_proba = pred_proba

        if type(self.pred_proba)!=type(None):
            self.classes_ = list(self.pred_proba.keys())
        else:
            self.classes_ = list(set(list(self.predictions)+list(self.actuals)))
        self.confusion_matrix = None

    def confusion(self):
        # compute confusion matrix for each class in self.classes_
        # self.confusion_matrix = {self.classes_[i]: {"TP":tp, "TN": tn, "FP": fp, "FN": fn}}
        # no return variables
        # write your own code below
        tp = 0
        fp = 0
        tn = 0
        fn = 0
        correct = self.predictions == self.actuals
        wrong = self.predictions != self.actuals
        self.acc = float(Counter(correct)[True])/len(correct)
        self.confusion_matrix = {}
        for label in self.classes_:
            for i in range(len(self.actuals)):
                if self.actuals[i] == label and self.predictions[i] == label:
                    tp += 1
            for i in range(len(self.actuals)):
                if self.actuals[i] != label and self.predictions[i] == label:
                    fp += 1
            for i in range(len(self.actuals)):
                if self.actuals[i] == label and self.predictions[i] != label:
                    tn += 1
            for i in range(len(self.actuals)):
                if self.actuals[i] != label and self.predictions[i] != label:
                    fn += 1
            self.confusion_matrix[label] = {"TP":tp, "TN": tn, "FP": fp, "FN": fn}
        return

    def accuracy(self):
        if self.confusion_matrix==None:
            self.confusion()
        return self.acc

    def precision(self, target=None, average = "macro"):
        # compute precision
        # target: target class (str). If not None, then return precision of target class
        # average: {"macro", "micro", "weighted"}. If target==None, return average precision
        # output: prec = float
        # note: be careful for divided by 0

        if self.confusion_matrix==None:
            self.confusion()
        if target in self.classes_:
            tp = self.confusion_matrix[target]["TP"]
            fp = self.confusion_matrix[target]["FP"]
            if tp+fp == 0:
                prec = 0
            else:
                prec = float(tp) / (tp + fp)
        else:
            if average == "micro":
                prec = self.accuracy()
            else:
                prec = 0
                n = len(self.actuals)
                for label in self.classes_:
                    tp = self.confusion_matrix[label]["TP"]
                    fp = self.confusion_matrix[label]["FP"]
                    if tp + fp == 0:
                        prec_label = 0
                    else:
                        prec_label = float(tp) / (tp + fp)
                    if average == "macro":
                        ratio = 1 / len(self.classes_)
                    elif average == "weighted":
                        ratio = Counter(self.actuals)[label] / float(n)
                    else:
                        raise Exception("Unknown type of average.")
                    prec += prec_label * ratio
        return prec

    def recall(self, target=None, average = "macro"):
        # compute recall
        # target: target class (str). If not None, then return recall of target class
        # average: {"macro", "micro", "weighted"}. If target==None, return average recall
        # output: recall = float
        # note: be careful for divided by 0

        if self.confusion_matrix==None:
            self.confusion()
        if target in self.classes_:
            tp = self.confusion_matrix[target]["TP"]
            fn = self.confusion_matrix[target]["FN"]
            if tp+fn == 0:
                rec = 0
            else:
                rec = float(tp) / (tp + fn)
        else:
            if average == "micro":
                prec = self.accuracy()
            else:
                rec = 0
                n = len(self.actuals)
                for label in self.classes_:
                    tp = self.confusion_matrix[label]["TP"]
                    fn = self.confusion_matrix[label]["FN"]
                    if tp + fn == 0:
                        rec_label = 0
                    else:
                        rec_label = float(tp) / (tp + fn)
                    if average == "macro":
                        ratio = 1 / len(self.classes_)
                    elif average == "weighted":
                        ratio = Counter(self.actuals)[label] / float(n)
                    else:
                        raise Exception("Unknown type of average.")
                    rec += rec_label * ratio
        return rec

    def f1(self, target=None, average = "macro"):
        # compute f1
        # target: target class (str). If not None, then return f1 of target class
        # average: {"macro", "micro", "weighted"}. If target==None, return average f1
        # output: f1 = float

        if self.confusion_matrix == None:
            self.confusion()

        if target in self.classes_:
            Recall = self.recall(target, average)
            Precision= self.precision(target, average)

            if Recall + Precision == 0:
                f1_score = 0
            else:
                f1_score = 2 * ((Precision * Recall)/(Precision + Recall))
        else:
            if average == "micro":
                f1_score = self.accuracy()
            else:
                f1_score = 0
                n = len(self.actuals)
                for label in self.classes_:
                    Recall = self.recall(target, average)
                    Precision = self.precision(target, average)

                    if Recall + Precision == 0:
                        f1_score_label = 0
                    else:
                        f1_score_label = 2 * float((Precision * Recall) / (Precision + Recall))
                    if average == "macro":
                        ratio = 1 / len(self.classes_)
                    elif average == "weighted":
                        ratio = Counter(self.actuals)[label] / float(n)
                    else:
                        raise Exception("Unknown type of average.")
                    f1_score +=  f1_score_label * ratio
        return f1_score

    def auc(self, target):
        # compute AUC of ROC curve for each class
        # return auc = {self.classes_[i]: auc_i}, dict
        if type(self.pred_proba)==type(None):
            return None
        else:
            if target in self.classes_:
                order = np.argsort(self.pred_proba[target])[::-1]
                tp = 0
                fp = 0
                fn = Counter(self.actuals)[target]
                tn = len(self.actuals) - fn
                tpr = 0
                fpr = 0
                auc_target = 0
                for i in order:
                    if self.actuals[i] == target:
                        tp = tp + 1
                        fn = Counter(self.actuals)[target]
                        if fn == 0:
                            tpr=0
                        else:
                            tpr = tp / fn
                    else:
                        fp = fp + 1
                        tn = len(self.actuals) - fn
                        pre_fpr = fpr
                        if tn == 0:
                            fpr = 0
                        else:
                            fpr = fp / (tn)
                        if fpr != pre_fpr:
                            auc_target += (tpr * (fpr - pre_fpr))
            else:
                raise Exception("Unknown target class.")

            return auc_target



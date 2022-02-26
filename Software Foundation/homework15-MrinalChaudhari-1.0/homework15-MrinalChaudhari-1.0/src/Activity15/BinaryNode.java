package Activity15;

public class BinaryNode {
    private int value;
    private BinaryNode left=null;
    private BinaryNode right=null;

    public BinaryNode getLeft() { return left; }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void infixTraversal(Visitor visitor){

        if (left!=null){
            left.infixTraversal(visitor);
        }
        visitor.visit(this);
        if (right!=null){
            right.infixTraversal(visitor);
        }
    }
    public boolean search(int target){
        if(this.value == target){
            return true;
        }else if((left != null) && left.search(target)){
            return true;
        }else if ((right != null) && right.search(target)){
            return true;
        }
        return false;
    }
    public void binaryInsert(int value){
        if(value<this.value){
            if (left==null){
                left=new BinaryNode(value);
            }else {
                left.binaryInsert(value);
            }
        }else if (value>this.value){
            if (right==null){
                if (right==null){  
                    right=new BinaryNode(value);
                }
                else {
                    right.binaryInsert(value);
                }
            }
        }
    }
    public boolean binarySearch(int target){
        if(value==target){
            return true;
        } else if(target<value && left!=null){
            return left.binarySearch(target);
        } else if(target>=value && right!=null) {
            return right.binarySearch(target);
        }
        return false;
    }

    public static void main(String[] args){
        BinaryNode node1=new BinaryNode(1);

        node1.setLeft(new BinaryNode(2));
       // node1.getLeft().setLeft(new BinaryNode(6));
        //node1.getLeft().setLeft(new BinaryNode(10));

        node1.setRight(new BinaryNode(6));
        //node1.getRight().setRight(new BinaryNode(3));
        //node1.getRight().setRight(new BinaryNode(9));


        node1.binaryInsert(2);
        node1.binaryInsert(3);
        node1.binaryInsert(4);
        node1.binaryInsert(5);
        node1.binaryInsert(6);
        node1.binaryInsert(7);
        node1.binaryInsert(8);
        node1.binaryInsert(9);
        node1.binaryInsert(10);
        node1.getLeft().setLeft(new BinaryNode(10));
        node1.getRight().setRight(new BinaryNode(9));


        node1.binarySearch(10);
        node1.search(1);

        StringifyVisitor visitor=new StringifyVisitor();
        node1.infixTraversal(visitor);
        System.out.println(visitor);
    }
}

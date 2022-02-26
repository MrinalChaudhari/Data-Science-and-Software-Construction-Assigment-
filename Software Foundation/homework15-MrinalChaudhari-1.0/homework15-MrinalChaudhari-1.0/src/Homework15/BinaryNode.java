package Homework15;

import java.util.Comparator;
public class BinaryNode<E> {
    private E value;
    private BinaryNode<E> left=null;
    private BinaryNode<E> right=null;
    private Comparator<E> comparator=null;

    public BinaryNode(E value) {
        this.value=value;
    }

    public BinaryNode(E value, Comparator<E> comparator) {
        this.value = value;
        this.comparator=comparator;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinaryNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<E> left) {
        this.left = left;
    }

    public BinaryNode<E> getRight() {
        return right;
    }

    public void setRight(BinaryNode<E> right) {
        this.right = right;
    }

    ////this method used to perform an infix traversal of the binary tree
    public void infixTraversal(Visitor visitor){

        if (left!=null){
            left.infixTraversal(visitor);
        }
        visitor.visit(this);
        if (right!=null){
            right.infixTraversal(visitor);
        }
    }

    //This method is used to serach target value in binary tree. It will return true if the value if found, and false otherwise
    public boolean search(E target){
        if(this.value == target){
            return true;
        }else if((left != null) && left.search(target)){
            return true;
        }else if ((right != null) && right.search(target)){
            return true;
        }
        return false;
    }

    //This method inserts a new value into the correct place in the three
    public void binaryInsert(E value1){
        if (compare(value1,this.value)<0) {
            if (left == null) {
                left = new BinaryNode(value1,comparator);
            } else if(compare(value1,this.value)==0){
                left.binaryInsert(value1);
            }
        } else if (compare(value1,this.value)>0) {
            if (right == null) {
                right = new BinaryNode(value1,comparator);
            } else {
                right.binaryInsert(value1);
            }
        }
    }

    private int compare(E val1, E val2){
        if(this.comparator!=null){
            return comparator.compare(val1,val2);
        }
        else{
            Comparable<E> comp1 = (Comparable<E>)val1;
            Comparable<E> comp2 = (Comparable<E>)val2;
            return comp1.compareTo((E) comp2);
        }
    }

    //This method is used to search target value in the tree
    public boolean binarySearch(E target){
        if(value==target){
            return true;
        } else if((compare(target,value)<0) && left!=null){
            return left.binarySearch(target);
        } else if((compare(target,value)>0) && right!=null) {
            return right.binarySearch(target);
        }
        return false;
    }

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Squirtle", 1);
        Compare Comp= null;
        //root node with first pokemon
        BinaryNode node1 = new BinaryNode(p1,Comp);

        Pokemon p2 = new Pokemon("Fire", 2);
        node1.binaryInsert(p2);

        Pokemon p3 = new Pokemon("Water", 3);
        node1.binaryInsert(p3);

        Pokemon p4 = new Pokemon("Ditto", 4);
        node1.binaryInsert(p4);

        Pokemon p5 = new Pokemon("Normal", 5);
        node1.binaryInsert(p5);

        Pokemon p6 = new Pokemon("Grass", 6);
        node1.binaryInsert(p6);

        Pokemon p7 = new Pokemon("Pikachu", 7);
        node1.binaryInsert(p7);

        Pokemon p8 = new Pokemon("Charmander", 8);
        node1.binaryInsert(p8);

        Pokemon p9 = new Pokemon("Eevee", 9);
        node1.binaryInsert(p9);

        Pokemon p10 = new Pokemon("Snorlax", 10);
        node1.binaryInsert(p10);

        Pokemon p11 = new Pokemon("Fire", 11);
        node1.binaryInsert(p11);

        Pokemon p12 = new Pokemon("Bulbasaur", 12);
        node1.binaryInsert(p12);

        node1.binarySearch(p3);
        node1.search(p4);
        StringifyVisitor visitor = new StringifyVisitor();

        node1.infixTraversal(visitor);
        System.out.println(visitor);
    }
}

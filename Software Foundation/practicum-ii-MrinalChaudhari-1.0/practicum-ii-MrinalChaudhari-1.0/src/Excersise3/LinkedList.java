package Excersise3;

import java.util.Stack;

public class LinkedList {

    Node head=null;
    
    static class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            next = null;
        }
    }
    public void Union(Node head1, Node head2){

        while (head1 != null) {
            push(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (!Present(head, head2.data))
                push(head2.data);
            head2 = head2.next;
        }
    }

    private void push(String data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public boolean Present(Node head, String data){

        while (head != null) {
            if (head.data == data)
                return true;
            head = head.next;
        }
        return false;
    }
    public void Intersection(Node head1, Node head2)
    {
        while (head1 != null) {
            if (Present(head2, head1.data))
                push(head1.data);
            head1 = head1.next;
        }
    }
    public void Difference(Node head1, Node head2){
        while (head1 != null) {
            push(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (!Present(head, head2.data))
                push(head2.data);
            head2 = head2.next;
        }
    }

    public static boolean isPalindrome(Node head)
    {
        boolean ispal = true;
        Stack<String> stack = new Stack<String>();

        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }

        while (head != null) {

            String i = stack.pop();
            if (head.data == i) {
                ispal = true;
            }
            else {
                ispal = false;
                break;
            }
            head = head.next;
        }
        return ispal;
    }

    public void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.push("George");
        list1.push("Jim");
        list1.push("John");
        list1.push("Blake");
        list1.push("Kevin");
        list1.push("George");
        list1.push("Michael");

        list2.push("George");
        list2.push("Katie");
        list2.push("Kevin");
        list2.push("Michelle");
        list2.push("Ryan");

        LinkedList union=new LinkedList();
        LinkedList intersection=new LinkedList();
        LinkedList Diff=new LinkedList();

        union.Union(list1.head, list2.head);
        intersection.Intersection(list1.head,list2.head);
        Diff.Difference(list1.head,list2.head);

        System.out.println("List1");
        list1.printList();
        System.out.println("List2");
        list2.printList();
        System.out.println("Union");
        union.printList();
        System.out.println("Intersection");
        intersection.printList();
        System.out.println("Intersection");
        Diff.printList();


        Node node1= new Node("Ryan");
        boolean val= isPalindrome(node1);
        System.out.println("Pallindrom: " +val);
    }

}

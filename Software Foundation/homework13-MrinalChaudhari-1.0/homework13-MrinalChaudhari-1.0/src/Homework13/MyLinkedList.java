package Homework13;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
	  private Node<E> head, tail;

	  /** Create a default list */
	  public MyLinkedList() {
	  }

	  /** Create a list from an array of objects */
	  public MyLinkedList(E[] objects) {
	    super(objects);
	  }

	  /** Return the head element in the list */
	  public E getFirst() {
		  // COMPLETE THIS METHOD
		  return (E) head;
	  }

	  /** Return the last element in the list */
	  public E getLast() {
		  // COMPLETE THIS METHOD
		  return (E) tail;
	  }

	  /** Add an element to the beginning of the list */
	  public void addFirst(E e) {
		  // COMPLETE THIS METHOD
		  Node <E> newnode= new Node<E>(e);
		  if (head==null && tail==null){
		  	head=newnode;
		  	tail=newnode;
		  }else{
		  	newnode.next=head;
		  	head=newnode;
		  	size++;
		  }
	  }

	  /** Add an element to the end of the list */
	  public void addLast(E e) {
		  // COMPLETE THIS METHOD
		  Node<E> newnode= new Node<E>(e);
		  if(head==null && tail==null){
		  	head=newnode;
		  	tail=newnode;
		  }else {

		  	tail.next=newnode;
		  	tail=tail.next;
		  	size++;
		  }
	  }

	  @Override /** Add a new element at the specified index
	   * in this list. The index of the head element is 0 */
	  public void add(int index, E e) {
		  // COMPLETE THIS METHOD

		 checkIndex(index);
		  if (index==0) {
			  head = new Node(e);
		  }else {
		  	Node <E> current =move(index-1);
		  	Node<E> nextnode=new Node<E>(e);
		  	current.next=nextnode;
		  }
	  }

	  /** Remove the head node and
	   *  return the object that is contained in the removed node.
	   * @return*/
	  public Node<E> removeFirst() {
		  // COMPLETE THIS METHOD
		  if(size==0){
		  	return null;
		  }else {
			  Node<E> temp = head;
			  head = head.next;
			  size--;
			  if (head == null)
				  tail = null;
			  return (Node<E>) temp.element;
		  }
	  }

	  /** Remove the last node and
	   * return the object that is contained in the removed node. */
	  public E removeLast() {
		  // COMPLETE THIS METHOD
		  if(size==0){
		  	return null;
		  }else if (size==1){
		  	Node<E> temp=head;
		  	head=tail=null;
		  	size=0;
		  	return temp.element;
		  }
		  else{
		  	Node<E> current=head;
		  	for(int i=1;i<size-2l;i++){
		  		current=current.next;
		  		Node temp=tail;
		  		tail=current;
		  		tail.next=null;
		  		size--;
		  		return (E) temp.element;
			}
		  }
		  return null;
	  }

	  @Override /** Remove the element at the specified position in this 
	   *  list. Return the element that was removed from the list. */
	  public E remove(int index) {
		  // COMPLETE THIS METHOD
		  if (index<0 || index >=size()) {
			  return null;
		  }
		  else if (index==0){
		  	return (E) removeFirst();
		  }
		  else if (index==size-1){
		  	return (E) removeLast();
		  }
		  else {
		  	Node<E> previous=head;
		  	for(int i=0; i<index;i++){
		  		previous=previous.next;
			}
		  	Node<E> current =previous.next;
		  	previous.next=current.next;
		  	size--;
		  	return (E) current.element;
		  }
	  }

	  @Override /** Override toString() to return elements in the list */
	  public String toString() {
	    StringBuilder result = new StringBuilder("[");

	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      result.append(current.element);
	      current = current.next;
	      if (current != null) {
	        result.append(", "); // Separate two elements with a comma
	      }
	      else {
	        result.append("]"); // Insert the closing ] in the string
	      }
	    }

	    return result.toString();
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    size = 0;
	    head = tail = null;
	  }

	  @Override /** Return true if this list contains the element e */
	  public boolean contains(E e) {
		  // COMPLETE THIS METHOD
		  return indexOf(e) >= 0;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
		  // COMPLETE THIS METHOD
		  Node <E> current=move(index);
		  return current.element;
	  }

	  @Override /** Return the index of the head matching element in 
	   *  this list. Return -1 if no match. */
	  public int indexOf(E e) {
		  // COMPLETE THIS METHOD
		  int index = 0;
		  Node <E> current = head;
		  while (current != null) {
			  if (current.element == e) {
				  return index;
			  }
			  index++;
			  current = current.next;
		  }
		  return -1;
	  }

	  @Override /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
		  // COMPLETE THIS METHOD
		  int index = 0;
		  Node <E> current = tail;
		  while (current != null) {
			  if (current.element == e) {
				  return index;
			  }
			  index++;
			  current = current.next;
		  }
		  return -1;
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
		  // COMPLETE THIS METHOD
		  Node <E> current = move(index);
		  current.element = e;
		  return e;
	  }
	private Node move(int index) {
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new LinkedListIterator();
	  }

	  private void checkIndex(int index) {
	    if (index < 0 || index > size)
	      throw new IndexOutOfBoundsException
	        ("Index: " + index + ", Size: " + size);
	  }
	  
	  private class LinkedListIterator 
	      implements java.util.Iterator<E> {
		  private Node<E> current = head; // Current index

		  @Override
		  public boolean hasNext() {
			  return (current != null);
		  }

		  @Override
		  public E next() {
			  E e = current.element;
			  current = current.next;
			  return e;
		  }
	  }
	  
	  private static class Node<E> {
	    E element;
	    Node<E> next;

	    public Node(E element) {
	      this.element = element;
	    }
	  }
	}

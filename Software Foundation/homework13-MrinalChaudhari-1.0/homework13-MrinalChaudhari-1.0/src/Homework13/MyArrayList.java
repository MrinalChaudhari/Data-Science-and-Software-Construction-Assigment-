package Homework13;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractList<E>
{
	  public static final int INITIAL_CAPACITY = 2;
	  private E[] data = (E[])new Object[INITIAL_CAPACITY];

	  /** Create a default list */
	  public MyArrayList() {
	  }

	  /** Create a list from an array of objects */
	  public MyArrayList(E[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]); // Warning: don�t use super(objects)!
	  }

	  @Override /** Add a new element at the specified index */
	  public void add(int index, E e) 
	  {
	    checkIndex(index);
	    trimToSize();
	    ensureCapacity(); 

	    // Move the elements to the right after the specified index
	    for (int i = size - 1; i >= index; i--)
	      data[i + 1] = data[i];

	    // Insert new element to data[index]
	    data[index] = e;

	    // Increase size by 1
	    size++;
	  }

	  /** Create a new larger array, double the current size + 1 */
	  private void ensureCapacity() {
	    if (size >= data.length) {
			System.out.println("Max Capacity detected! Doubling the size before inserting a new element");
	      E[] newData = (E[])(new Object[size * 2]);
	      System.arraycopy(data, 0, newData, 0, size);
	      data = newData;
	    }
	  }

	  @Override /** Clear the list */
	  public void clear() {
	    // COMPLETE THIS METHOD
		 //clear();
		  size=0;
		  data=null;
	  }

	  @Override /** Return true if this list contains the element */
	  public boolean contains(E e) {
		  // COMPLETE THIS METHOD
		  if(e==data){
		  	return true;
		  }else
		  	return false;
		  //return indexOf(e) >= 0;
	  }

	  @Override /** Return the element at the specified index */
	  public E get(int index) {
		  // COMPLETE THIS METHOD
		  checkIndex(index);
		 return data[index];
	  }

	  private void checkIndex(int index) {
		  // COMPLETE THIS METHOD
		  if (index < 0 || index > size)
			  throw new IndexOutOfBoundsException
					  ("Index: " + index + ", Size: " + size);
	  }
	  
	  @Override /** Return the index of the first matching element 
	   *  in this list. Return -1 if no match. */
	  public int indexOf(E e) {
			  // COMPLETE THIS METHOD
		  if (e == null) {
			  for (int i = 0; i < size; i++)
				  if (data[i]==null)
					  return i;
		  } else {
			  for (int i = 0; i < size; i++)
				  if (e.equals(data[i]))
					  return i;
		  }
		  return -1;
	  }

	  @Override /** Return the index of the last matching element 
	   *  in this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
			  // COMPLETE THIS METHOD
			  if (e == null) {
				  for (int i = size-1; i >= 0; i--)
					  if (data[i]==null)
						  return i;
			  } else {
				  for (int i = size-1; i >= 0; i--)
					  if (e.equals(data[i]))
						  return i;
			  }
			  return -1;
	  }

	  @Override /** Remove the element at the specified position 
	   *  in this list. Shift any subsequent elements to the left.
	   *  Return the element that was removed from the list. */
	  public E remove(int index) {
			  // COMPLETE THIS METHOD
		  checkIndex(index);
		  for (int i=index;i<=size-1;i++){
			  data[i]=data[i+1];
		  }
		  size--;
		  return (E) data;
	  }

	  @Override /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
			  // COMPLETE THIS METHOD
		  checkIndex(index);
		  data[index]=e;
		  return e;
	  }

	@Override
	public String toString() {
		// COMPLETE THIS METHOD
		if (size > 0) {
			String result = "[" + data[0];
			for (int i = 1; i < size; i++) {
				result = result + ", " + data[i];
			}
			result += "]";
			return result;
		} else {
			return "[]";   // empty list
		}
	}

	  /** Trims the capacity to current size */
	  public void trimToSize() {
			  // COMPLETE THIS METHOD
		  int capacity= data.length;
		  if(size < capacity) {
			  data = Arrays.copyOf(data, size);
		  }
	  }

	  @Override /** Override iterator() defined in Iterable */
	  public java.util.Iterator<E> iterator() {
	    return new ArrayListIterator();
	  }
	 
	  private class ArrayListIterator implements java.util.Iterator<E> {
	    private int current = 0; // Current index 

	    @Override
	    public boolean hasNext() {
	      return (current < size);
	    }

	    @Override
	    public E next() {
	      return data[current++];
	    }

	    @Override
	    public void remove() {
	      MyArrayList.this.remove(current);
	    }
	  }
	}

package Lab06.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public class MyArrayList<E> {
        public static final int DEFAULT_CAPACITY = 10;
         private E[] elements;
        private int size;
        public MyArrayList() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
        }
        public MyArrayList(int capacity) {
        this.elements = (E[]) new Object[capacity];
        }
       
        // creates an array of double-size if the array of
       // elements is full
       public void growSize() {
        if(size == elements.length){
            elements=[elements.length*2];

        }
        }
        
        // Returns the number of elements in this list.
        public int size() { 
            return elements.length;
        }
           
        // Returns whether the list is empty.
        public boolean isEmpty() { 
            return size == 0;
        }
       
        // Returns (but does not remove) the element at index i.
        public E get(int i) throws IndexOutOfBoundsException {
        return null;
        }
        
        // Replaces the element at index i with e, and returns the replaced element. ∗/
    
        public E set(int i, E e) throws IndexOutOfBoundsException {
    return null; }
         
    // It is used to append the specified element at the end of a list.
    public boolean add(E e) { 
        if(size == elements.length){
            growSize();
            elements[size++] = e;
        }
        return true;
    }
       
    // Inserts element e to be at index i, shifting all subsequent elements later.
    public void add(int i, E e) throws IndexOutOfBoundsException {
        

    }
       
    // Removes and returns the element at index i,
    //shifting subsequent elements earlier.
    public E remove(int i) throws IndexOutOfBoundsException {
    return null; }
  
    // Then implements other methods as in Java Collection Framework - ArrayList.java
    // It is used to clear all elements in the list.
    public void clear() {
    }
   
     /* It is used to return the index in this list of the
    last occurrence of the specified element, or -1 if the
    list does not contain this element.*/ 
    // public int lastIndexOf(Object o) { 
    //     return -1;
    // }

    public boolean lastIndexOf(E e){
        int result = -1;
        for(int i=0; i<size; i++){
            if(elements[i].equals(e))
            result=i;
        }
        return result;

    }
    
    // It is used to return an array containing all of the
    //elements in this list in the correct order.
    public E[] toArray() {
         return null;
    }
   
    // It is used to return a shallow copy of an ArrayList.
    public MyArrayList<E> clone() {
         return null;
    }
   
    // It returns true if the list contains the specified element
    public boolean contains(E o) {
         return false;
    }
    
    /* It is used to return the index in this list of the
    first occurrence of the specified element, or -1 if the
    List does not contain this element. */
    public int indexOf(E o) {
         return -1;
    }
    
    // It is used to remove the first occurrence of the
   // specified element.
    public boolean remove(E e) { 
        return false;
    }
    
    // It is used to sort the elements of the list on the
    //basis of specified comparator.
    public void sort(Comparator<E> c) {
        Arrays.sort(elements,0,size,c);
    }
}

package com.bridgelabz.implementationusinggenerics;

//Creating a new node class
public class Node <E extends Comparable>{
    //Defining the data and the next pointer
    E data;
    Node<E> next;
    public Node(E data){
        this.data = data;
        this.next = null;
    }
}

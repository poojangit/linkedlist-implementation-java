package com.bridgelabz.basicimplementation;

public class LinkedList {
    // Defining the first node as head
    Node head;

    // method to insert the data first in the list
    public void insertFirst(int data) {
        int[] arr = {10,20,30,40,50};
        head = new Node(data);
        for(int i=0 ; i<arr.length; i++) {
            // if there is no linked list pr if the head is null, then make the head as a new node
            if (head == null) {
                head = new Node(arr[i]);
            } else {
                Node temp;
                temp = new Node(arr[i]);
                temp.next = head;
                head = temp;
            }
        }
    }

    //method to insert the data at the end of the list
    public void insertLast(int data){
       Node tail = head;
    //check if the head is empty or not
       if(head == null){
           head = new Node(data);
       } else {
           // keep on traversing the list until the tail reaches the last node
           while (tail.next != null) {
               // move the tail to the next node
               tail = tail.next;
           }
           // insert the new node at the end of the list
           tail.next = new Node(data);
       }
    }
    // method to print the list
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }
}

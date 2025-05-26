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
    // method to print the list
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }
}

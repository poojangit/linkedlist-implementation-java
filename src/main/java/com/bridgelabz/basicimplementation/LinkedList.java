package com.bridgelabz.basicimplementation;

public class LinkedList {
    // Defining the first node as head
    Node head;

    // method to insert the data first in the list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

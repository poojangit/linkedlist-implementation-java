package com.bridgelabz.basicimplementation;

// Main Linked list operation class
public class MainOperation {
    // main method
    public static void main(String[] args) {
        // creating a new linked list object because the methods in the linked list classes does not belong to the class.
        LinkedList ll = new LinkedList();
        //calling the method with data as a parameters to insert the data at the beginning.
        ll.insertFirst(5);
//        ll.insertFirst(30);
        ll.printList();
    }
}

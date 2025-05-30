package com.bridgelabz.basicimplementation;

// Main Linked list operation class
public class MainOperation {
    // main method
    public static void main(String[] args) {
        // creating a new linked list object because the methods in the linked list classes does not belong to the class.
        LinkedList ll = new LinkedList();
        //calling the method with data as a parameters to insert the data at the end.
        ll.head = ll.createLinkedListUsingRecursionAtTheEnd(new int[]{1,2,3,4,5}, 0, 5);
        //calling the method with data as a parameters to insert the data at the beginning.
        ll.insertFirst(0);
        //ll.insertFirst(30);
        ll.insertLast(6);
        // Create a list using recursion at the beginning
        ll.head = ll.createLinkedListUsingRecursionAtTheBeginning(new int[]{1000, 2000, 3000, 4000, 5000}, 0, 5, null);
        ll.insertAtParticularPosition(100, 2);
        ll.printList();
    }
}

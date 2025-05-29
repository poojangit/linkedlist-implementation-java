package com.bridgelabz.implementationusinggenerics;

import java.util.LinkedList;
public class LinkedListMainClass<E extends Comparable> {
    Node head;

    public static void main(String[] args) {
//        createSimpleLinkedList();
        //create a linked list using generics
        //creating a new linked list object because the methods in the linked list classes does not belong to the class.
        LinkedListMainClass list = new LinkedListMainClass();
        //add data from the head
        list.addFromHead(70);
        list.addFromHead(30);
        list.addFromHead(56);
        //add data from the tail
//        list.addFromTail(56);
//        list.addFromTail(30);
//        list.addFromTail(70);
        //insert data in the middle
//        list.insertInMiddle(30);
        //delete first element
//        list.pop(56);
        //delete last element
//        list.popLast();
        //search the element
//        System.out.println(list.search(30));
        list.insertDataNextToPosition(30, 40);
        System.out.println(list);

    }

    public static void createSimpleLinkedList() {
        LinkedList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }

    //UC2 - implementation
    //method to add the node at the beginning of the list
    public void addFromHead(E data) {
        Node newNode = new Node(data);
        Node temp = head;
        this.head = newNode;
        newNode.next = temp;
    }

    //UC3 - implementation
    //method to add the node at the end of the list
    public boolean addFromTail(E data) {
        //Node object created
        Node newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return true;
    }

    //UC4 - implementation
    // method to insert the node in between the nodes
    public boolean insertInMiddle(E data) {
        // check that if the head is empty or not
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node newNode = new Node(data);
        Node temp = head;
        //traverse the list till the middle
        for (int i = 0; i < this.size() / 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }

    //method to display the size of the list
    public int size() {
        //check if the head is empty or not
        if (head == null) {
            return 0;
        }
        //variable to store the size of the list
        int size = 0;
        Node temp = this.head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return ++size;
    }

    //UC5 - implementation
    // method to delete the first element in the list
    public boolean pop(E data) {
        //check if the head is empty or not
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node temp = head;
        this.head = head.next;
        System.out.println("Deleted " + temp.data);
        return true;
    }

    //UC6 - implementation
    //method to delete the last element in the list
    public boolean popLast() {
        //check if the head is empty or not
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node temp = this.head;
        Node prev = temp;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        System.out.println("Deleted " + temp.data);
        return true;
    }
    //UC7 - implementation
    //method to search the element in the list
    public boolean search(E data) {
        Node temp = head;
        //traverse the list till the element is found
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //UC8 - implementation
    //method to insert the data next to based on the element position
    public boolean insertDataNextToPosition(E positiondata, E data){
        //checking head is empty or not
        if(head == null){
            System.out.println("List is empty");
            return false;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != null){
            if(temp.data.equals(positiondata)){
                newNode.next = temp.next;
                temp.next = newNode;
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Element " + positiondata+ " not found");
        return false;
    }

    //method to print the list
    @Override
    public String toString(){
        Node temp = this.head;
        if(temp == null){
            return "Empty List";
        }
        while(temp.next != null){
            Node node = temp;
            System.out.print(node.data + "--->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        return "";
    }
}

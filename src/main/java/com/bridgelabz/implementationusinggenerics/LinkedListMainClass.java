package com.bridgelabz.implementationusinggenerics;

import java.util.LinkedList;
public class LinkedListMainClass<E extends Comparable> {
    Node head;

    public static void main(String[] args) {
        createSimpleLinkedList();
        //create a linked list using generics
        //creating a new linked list object because the methods in the linked list classes does not belong to the class.
        LinkedListMainClass list = new LinkedListMainClass();
        //add data from the head
        list.addFromHead(70);
//        list.addFromHead(30);
        list.addFromHead(56);
        //add data from the tail
        list.addFromTail(56);
//        list.addFromTail(30);
        list.addFromTail(70);
        //insert data in the middle
        list.insertInMiddle(30);
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
    public boolean insertInMiddle(E data){
        // check that if the head is empty or not
        if(head == null){
            System.out.println("List is empty");
            return false;
        }
        Node newNode = new Node(data);
        Node temp = head;
        //traverse the list till the middle
       for(int i=0; i<this.size()/2; i++){
           temp = temp.next;
       }
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }
    //method to display the size of the list
    public int size(){
        //check if the head is empty or not
        if(head == null) {
            return 0;
        }
        //variable to store the size of the list
        int size = 0;
        Node temp = this.head;
        while(temp.next!= null)
        {
            size++;
            temp = temp.next;
        }
        return ++size;
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

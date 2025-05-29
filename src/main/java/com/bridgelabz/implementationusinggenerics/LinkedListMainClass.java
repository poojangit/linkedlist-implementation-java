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
        list.addFromHead(30);
        list.addFromHead(56);
        //add data from the tail
        list.addFromTail(56);
        list.addFromTail(30);
        list.addFromTail(70);
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

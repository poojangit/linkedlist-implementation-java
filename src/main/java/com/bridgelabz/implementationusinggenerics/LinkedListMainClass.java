package com.bridgelabz.implementationusinggenerics;

import java.util.LinkedList;
public class LinkedListMainClass<E extends Comparable> {
    Node head;
    public static void main(String[] args) {
        createSimpleLinkedList();
        //create a linked list using generics
        //creating a new linked list object because the methods in the linked list classes does not belong to the class.
        LinkedListMainClass list = new LinkedListMainClass();
        list.addFromHead(70);
        list.addFromHead(30);
        list.addFromHead(56);
        System.out.println(list);

    }
    public static void createSimpleLinkedList(){
        LinkedList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }
    //method to add the node at the beginning of the list
    public void addFromHead(E data){
        Node newNode = new Node(data);
        Node temp = head;
        this.head = newNode;
        newNode.next = temp;
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

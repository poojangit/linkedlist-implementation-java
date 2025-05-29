package com.bridgelabz.implementationusinggenerics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListMainClassTest {
    static LinkedListMainClass list;

    //method to execute before all the test cases
    @BeforeAll
    public static void setUp(){
        list = new LinkedListMainClass();
        list.addFromHead(70.90);
        list.addFromHead(30.90);
        list.addFromHead(56.90);
        list.insertDataNextToPosition(30.90, 40.90);
    }
    @Test
    void search() {
        assertTrue(list.search(30.90), "data 30.90 should be found");
    }
    @Test
    void insertDataNextToPosition() {
        assertTrue(list.search(40.90), "data 100.90 should be found");
    }
}
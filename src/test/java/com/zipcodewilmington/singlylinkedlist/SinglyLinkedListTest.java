package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertNotNull(llist);

    }

    @Test
    public void testIsEmpty() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        Assert.assertEquals( true, llist.isEmpty());
    }

    @Test
    public void testAdd1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        Assert.assertEquals( false, llist.isEmpty());

    }
    @Test
    public void testAdd2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert.assertFalse(llist.isEmpty());

    }

    @Test
    public void testToString1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        String expected = "head -> NULL";
        String actual = llist.toString();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testToString2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        String expected = "head -> [x] -> NULL";

        Assert.assertEquals(expected, llist.toString());

    }@Test
    public void testToString3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();

        llist.add(1);
        llist.add(2);
        String expected = "head -> [x] -> [y] -> NULL";


        Assert.assertEquals(expected, llist.toString());

    }


}

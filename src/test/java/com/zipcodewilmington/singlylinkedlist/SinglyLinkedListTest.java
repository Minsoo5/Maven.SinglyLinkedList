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
        String expected = "head -> [1] -> NULL";

        Assert.assertEquals(expected, llist.toString());

    }@Test
    public void testToString3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();

        llist.add(1);
        llist.add(2);
        String expected = "head -> [1] -> [2] -> NULL";


        Assert.assertEquals(expected, llist.toString());

    }
    @Test
    public void testSize0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        Assert.assertEquals( 0, llist.size());

    }
    @Test
    public void testSize1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        Assert.assertEquals( 1, llist.size());

    }
    @Test
    public void testSize2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals( 2, llist.size());
    }

    //Method Find
    @Test
    public void testFind0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        Assert.assertEquals(-1, llist.find(1));
    }
    @Test
    public void testFind1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(1);
        llist.add(2);
        Assert.assertEquals(0, llist.find(1));

    }
    @Test
    public void testFind1a() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        Assert.assertEquals(llist.size() - 1, llist.find(5));

    }
    @Test
    public void testFind2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(1, llist.find(7));

    }
    @Test
    public void testFind3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(9);
        Assert.assertEquals(llist.size() -1, llist.find(9));
        Assert.assertEquals(0, llist.find(5));
        Assert.assertEquals(1, llist.find(7));
        Assert.assertEquals(3, llist.size());
    }

    //Method Contiains
    @Test
    public void testContains0() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        Assert.assertTrue(llist.contains(5));

    }
    @Test
    public void testContains1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(true, llist.contains(5));
        Assert.assertEquals(true, llist.contains(7));

    }
    @Test
    public void testContains2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(false, llist.contains(42));
        Assert.assertEquals(false, llist.contains("Hello"));

    }
    @Test
    public void testGet1() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(5, llist.get(0));


    }
    @Test
    public void testGet2() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.add(1);
        llist.add(94);
        llist.add(22);
        llist.add(7);
        llist.add(84);
        llist.add(733);
        llist.add(3);
        llist.add(30);
        llist.add(64);
        Assert.assertEquals(3, llist.get(8));


    }
    @Test
    public void testGet3() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        Assert.assertEquals(null, llist.get(1));

    }
    @Test (expected = IndexOutOfBoundsException.class)
    public void testGet4() {
        SinglyLinkedList<Integer> llist = new SinglyLinkedList<>();
        llist.add(5);
        llist.add(7);
        llist.get(199);
    }



}

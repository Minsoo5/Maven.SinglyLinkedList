package com.zipcodewilmington.singlylinkedlist;


public class Node<T> {

    private T data;
    private Node<T> next;
    public Node(T data) {
        this(data, null);

        //or
        //this.data = data;
        //this.next = null;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() { return data; }

    //public T getNext() { return next; }
}
package com.bridgelabz;

public class LinkedList<K,V> {
    MyMapNode<K, V> head;
    MyMapNode<K, V> tail;

    public void add(K key, V value) {
        MyMapNode<K, V> newNode = new MyMapNode<K, V>(key, value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void replace(K key, V value) {
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
            }
            temp = temp.next;
        }
    }

    public boolean containsKey(String key) {
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    public int get(String word) {
        MyMapNode<K, V> temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.key.equals(word)) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public MyMapNode<K,V> search(K searchData) {
        MyMapNode<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }


    public void append(MyMapNode<K,V> node ) {

        if(head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public void print(){
        MyMapNode<K,V> temp = head;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

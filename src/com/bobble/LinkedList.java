package com.bobble;

import java.util.Stack;

public class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }

    }
    Node head;
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
       ll.insert(10);
       ll.insert(20);
        ll.insert(30);
       ll.insert(40);
        ll.print();
        ll.reverse();
        ll.print();


    }
    void insert(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            head.next = null;
            return;
        }
      node.next = null;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
return;
    }
    void reverse(){
        Node temp = head;
        Stack<Node> stack = new Stack<>();
        while(temp.next!= null){
            stack.push(temp);
            temp = temp.next;
        }

        head = temp;
        while(!stack.empty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

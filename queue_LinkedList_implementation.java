// implementation of queue using Linkedlist

import java.util.*;
public class Queue{

    private ListNode front;
    private ListNode rear;
    private int length;
    
    public class ListNode{
        private int data;
        private ListNode next;
        
        public  ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    public int length(){
        return length;
    }
    
    public boolean isEmpty(){
        return length==0;
    }
   
   
   // add an element in a queue 
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    
    
    // print the elements
    public void print(){
        if(isEmpty()){
            return;
        }
        
        ListNode curr = front;
        while(curr != null){
            System.out.print(curr.data + " ---> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    
    // remove an element from a queue
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }
    
    
    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        return front.data;
    }
    
    
    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        return rear.data;
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.print();
        
        System.out.println("First element "+queue.first());
        System.out.println("Last element "+queue.last());
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
    }
}

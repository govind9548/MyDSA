

import java.util.*;     // for No such element exception
class singlyLinkedList{
    private listNode head;
    
    private static class listNode{
        private int data;
        private listNode next;
        
        public listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void insertAtBeginning(int val){
        listNode newNode = new listNode(val);
        newNode.next = head;
        head = newNode;
    }
    
    
    public void display(){
        listNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + "--->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    
    
    // get middle node
    public listNode getMiddleNode(){
        if(head==null){
            return null;
        }
        listNode slow = head;
        listNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
    // get nth node from the last of the linkedList
    public listNode nthNodeFromLast(int n){
        if(head == null){
            return null;
        }
        if(n<0){
            throw new IllegalArgumentException("Invalid Value: n = "+ n);
        }
        listNode mainPtr = head;
        listNode refPtr = head;
        int count = 0;
        
        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    
    
    // remove only the continuous duplicates in a linkedlist
    public void removeDuplicate(){
        if(head == null){
            throw new NoSuchElementException("The linked list is empty.");
        }
        listNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
    }
    
    
    //  inserting an element in a "sorted linkedlist"
    public listNode insertInSortedLL(int val){
        listNode newNode = new listNode(val);
        if(head == null){
            return newNode;
        }
        listNode curr = head;
        listNode temp = null;
    
        while(curr!=null && curr.data < newNode.data){
            temp = curr;
            curr = curr.next;
        }
        temp.next = newNode;
        newNode.next = curr;
        return head;
    }
    
    
    // delete/remove a key from SLL
    public void removeElementByKey(int key){
        listNode curr = head;
        listNode temp = null;
        if(curr!=null && curr.data==key){
            head = curr.next;
            return;
        }
        while(curr != null && curr.data!=key){
            temp = curr;
            curr = curr.next;
        }
        if(curr == null) return;
        temp.next = curr.next;
    } 
    
    
    public static void main( String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(5);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(1);
        
        sll.display();
        
        // listNode middleNode = sll.getMiddleNode();
        // System.out.println("middle node is "+middleNode.data);
        
        // System.out.println("nth node from last is "+sll.nthNodeFromLast(3).data);
        
        sll.removeDuplicate();
        sll.display();
        
        sll.insertInSortedLL(8);
        sll.display();
        
        sll.removeElementByKey(15);
        sll.display();
    }
}

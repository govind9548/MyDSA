import java.util.*;
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
    
    
    // detect the cycle/loop in SLL
    public boolean isCycle(){
        listNode fast = head;
        listNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    
    
    
    // method to create a looped LL
    public void createALoopInLinkedList(){
        listNode first = new listNode(1);
        listNode second = new listNode(2);
        listNode third = new listNode(3);
        listNode fourth = new listNode(4);
        listNode fifth = new listNode(5);
        listNode sixth = new listNode(6);
        
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;  // loop/cycle
    }    
    
    
    // flyod's cycle
    // to find the starting node of cycle/loop
    public listNode cycledNode(){
         // Base case: If the list is empty or has only one node, there is no cycle
        if (head == null || head.next == null) {
            return null;
        }

        listNode fast = head;
        listNode slow = head;
        listNode temp = null;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                temp = head;
                
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                // break;
                return temp;    // Return the starting node of the cycle
            }
        }
        // No cycle found
        return null;
    }
    
    // // another way
    // public listNode cycledNode(){
    //     listNode fast = head;
    //     listNode slow = head;
        
    //     while(fast != null && fast.next != null){
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         if(slow == fast){
    //             return getLoopedNode(slow);
    //         }
    //     }
    //     return null;
    // }
    // public listNode getLoopedNode(listNode slow){
    //     listNode temp = head;
    //     while(temp != slow){
    //         temp = temp.next;
    //         slow = slow.next;
    //     }
    //     return temp;
    // }
    
    
    
    
    public static void main( String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(15);
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(5);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(1);
        
        sll.display();
        
        System.out.println(sll.isCycle());
        sll.createALoopInLinkedList();
        System.out.println(sll.isCycle());
        System.out.println(sll.cycledNode().data);
        
    }
}

// Singly LinkedList
class singlyLinkedList{
    private  listNode head;
    // integer type 
    private static class listNode{
        private int data;
        private listNode next;
        
        public listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    // print the linkedlist
    public void display(){
        listNode current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    
    // print the length
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        listNode curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    
    
    // insert at the beginning of linkedlist
    public void insertAtFirst(int value){
        listNode newNode = new listNode(value);
        newNode.next = head;
        head = newNode;
    }
    
    
    // insert at the last of linkedlist
    public void insertAtLast(int value){
        listNode newNode = new listNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        listNode curr = head;
        while(curr.next!=null){
        // while(null != curr.next){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    
    // insert at a given position in linkedlist
    // insert(position,value)    ===> position starts with 1 
    public void insert(int position, int value){
        listNode node = new listNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            listNode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            listNode curr = previous.next;
            previous.next = node;
            node.next = curr;
        }
    }
    
    
    // delete the first node of Linkedlist
    public listNode deleteFirst(){
        if(head == null){
            return null;
        }
        listNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    
    
    // delete the last node of linked list
    public listNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        listNode curr = head;
        listNode prev = null;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return curr;
    }
    
    
    // //delete a node from a given valid position starting from 1
    // // without return statement
    // public void delete(int position){
    //     if(position == 1){
    //         head = head.next;
            
    //     }else{
    //         listNode prev = head;
    //         int count = 1;
    //         while(count < position-1){
    //             prev = prev.next;
    //             count++;
    //         }
    //         listNode curr = prev.next;
    //         prev.next = curr.next;
    //     }
    // }
    
    
     //delete a node from a given position
     // with return statement
    public listNode delete(int position) {
    if (position<=0) {
        // Invalid position
        return null;
    }
    listNode curr = null;
    if (position == 1) {
        curr = head;
        if (head != null) {
            head = head.next;
        }
    } else {
        listNode prev = head;
        int count = 1;
        while (count < position - 1 && prev != null) {
            prev = prev.next;
            count++;
        }
        if (prev == null || prev.next == null) {
            // Position is out of bounds
            return null;
        }
    curr = prev.next;
    prev.next = curr.next;
    }
    return curr;
    }


    // search an element in linkedlist
    public boolean find(int searchKey){
        listNode curr = head;
        if(head == null){
            return false;
        }
        
        while(curr!=null){
            if(curr.data == searchKey){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    //find the middle node of a linkedList
    
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
    
    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
           //create a singly linked list
        // sll.head = new listNode(10);
        // listNode second = new listNode(1);
        // listNode third = new listNode(8);
        // listNode fourth = new listNode(11);
           // // now connect them 
        // sll.head.next=second;   // 10 ---> 1 
        // second.next = third;    // 10 ---> 1 ---> 8
        // third.next = fourth;    // 10 ---> 1 ---> 8 ---> 11 ---> null
        
        // sll.display();
        // System.out.println("length "+sll.length());
        
        sll.insertAtFirst(11);
        sll.insertAtFirst(8);
        sll.insertAtFirst(1);
        sll.display();
        
        sll.insertAtLast(15);
        sll.insertAtLast(17);
        sll.display();
        sll.insert(4,13);
        sll.display();
        
        // System.out.println("first deleted node is " + sll.deleteFirst().data);    // remember 
        // sll.display(); 
        
        // System.out.println("last deleted node is " +sll.deleteLast().data);     
        // sll.display(); 
        
        // sll.delete(3);     
        // sll.display(); 
        // System.out.println("deleted node is " +sll.delete(3).data); 
        // sll.display();
        
        
        System.out.println(sll.find(8));
        System.out.println(sll.find(100));

        
        listNode middleNode = sll.getMiddleNode();
        System.out.println("middle node is "+middleNode.data);
        
        
    }
}

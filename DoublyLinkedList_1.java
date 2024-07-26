
public class DoublyLinkedList{
    
    private ListNode head; 
    private ListNode tail;
    private int length;
    
    public class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        
        public ListNode(int data){
            this.data = data;
        }
    }
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public boolean isEmpty(){
        return length == 0;   // head == null
    }
    
    public int length(){
        return length;
    }
    
    
    
     //insert elements at beginning of doublyLL
     public void insertAtBeginning(int val){
         ListNode newNode = new ListNode(val);
         if(isEmpty()){
             tail = newNode;
         }else{
             head.previous = newNode;
         }
         newNode.next = head;
         head = newNode;
         length++;
     }
    
    
    
    //insert elements at last in doublyLL
    public void insertLast(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        
        newNode.previous = tail;
        tail = newNode;
        length++;
    }
    
    
    
    // display DoublyLL in forword direction
    public void displayForward(){
        if(head == null){
            return;
        }
        
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    
    // display DoublyLL in backward direction
    public void displayBackward(){
        if(tail == null){
            return;
        }
        
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ---> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    
    
    
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(5);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);
        
        dll.displayForward();
        // dll.displayBackward();
        
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(0);
        System.out.println("After adding at start and length is " + dll.length());
        dll.displayForward();
        // dll.displayBackward();
        
    }
}

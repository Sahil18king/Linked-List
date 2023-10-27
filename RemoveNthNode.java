public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next =null;
        }
    }
    public static Node head;  
    public static Node tail;
    public static int size;

    // Add First method 

    public void addFirst(int data){
        Node newNode =new Node(data);
        size++;
        if(head == null) {
            head = tail =newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
  // Add Last wala

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
  
   // Adding value in Linked List

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
  
     // Print Method 
    public void print(){
        if(head == null ){
            System.out.println("null");
            return;
        }
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }
  //find nd remove Nth Node from End 
    public void DeleteNthfromEnd(int n){
        //calculate size ;
        int sz =0 ;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i=1;
        int find = sz - n;
        Node prev = head;
        while(i<find){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;



    }
public static void main(String args[]){
LinkedList ll =new LinkedList();
ll.print();
ll.addFirst(2);
ll.print();
ll.addFirst(1);
ll.print();
  ll.addLast(3);
  ll.print();
  ll.addLast(4);
  ll.print();
  ll.add(2,9);
  ll.print();
 //System.out.println(ll.size);
  ll.DeleteNthfromEnd(3);
  ll.print();
}
}

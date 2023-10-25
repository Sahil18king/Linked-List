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
  // Remove First Method

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE; // infnity value
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last method
  
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
  // method itrSearch

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
  // Recursive Search

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        System.out.println(idx);
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
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
  ll.removeFirst();
  ll.print();
  ll.removeLast();
  ll.print();
  //System.out.println("Index of Given Key : "+ ll.itrSearch(2));
  System.out.println(ll.recSearch(3)+"= idx ");
  
 System.out.println(ll.size +"= Size");
}
}

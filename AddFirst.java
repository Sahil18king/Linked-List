public class AddFirst {
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
 System.out.println(ll.size);
}
}

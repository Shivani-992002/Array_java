
public class LinkedList2{

    public static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public boolean isCyclic(Node head){
        

        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        LinkedList2 ll=new LinkedList2();

          Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println("Is the list cyclic? "+ll.isCyclic(head));
    }
}
// Remove a loop/cycle in a linked list

public class LinkedList3{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void removeCycle(){
        //STEP 1 DETECT CYCLE
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if 
            (slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            System.out.println("Cycle do not exist");
        }

        //Find meeting point

        slow=head;
        Node prev=null;//last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //REMOVE CYCLE
        prev.next=null;
    }

public static  Node head;

    public static void main(String[] args){
        LinkedList3 ll=new LinkedList3 ();

         head =new Node(1);
        Node head1 =new Node(2);
        Node head2 =new Node(3);
        Node head3 =new Node(4);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head2; // Create a cycle

        removeCycle();

        System.out.println("Cycle removed successfully");
    }
}

//merge sort on a linked list
public class LinkedList4{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //Find mid
        Node mid=getMid(head);

        //left and right merge Sort
        Node rightHead=mid.next;
        mid.next=null;
        Node leftHead=head;

        Node newLeft=mergeSort(leftHead);
        Node newRight=mergeSort(rightHead);

        //merge both halves
        return merge(newLeft,newRight);
    }

    public static  Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            }
            return slow;
    }

    public static Node merge(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return dummy.next;
    }

    public void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
            }
            System.out.println("");
    }
    
    public static Node head;

    public static void main(String[] args){
        LinkedList4 ll=new LinkedList4();

        head = new Node(9);
        Node node2 = new Node(6);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        Node node5 = new Node(12);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ll.print(head);  // Print before sorting
        head=mergeSort(head);  // Update the head to the sorted list
        ll.print(head);  // Print after sorting
    }
}
//zIG ZAG LINKED LIST
public class LinkedList5{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void zigZag(){
        //FIND MID
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //REVERSE 2ND HALF
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //ALTTERATE MERGE -->ZIGZAG MERGE
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR= right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static Node head;
    public static void main(String[] args){
        LinkedList5 ll=new LinkedList5();

        head=new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);
        Node head6 = new Node(6);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next=null;

        print(head);
        zigZag();
        print(head);

    }
}
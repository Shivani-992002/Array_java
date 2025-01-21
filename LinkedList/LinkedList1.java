public class LinkedList1{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }



    public int removeLast(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev-->
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        
        int val=prev.next.data;//tail data
        prev.next=null;
        size--;
        return val;
    }


    public static void main(String args[]){
       LinkedList1 ll=new LinkedList1();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addLast(4);
       ll.addLast(5);
    //    ll.add(2,9);

       ll.print();// 1 2 3 4 5
       ll.removeFirst();
       ll.print();//2 3 4 5
       ll.removeLast();
       ll.print();//2 3 4
       System.out.println("size of linked list is : " +ll.size);
    }
}
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


// Search for the key in a linked list  return the position where it is found ,if not found return -1
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;//key not found
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

//reverse linked List (Iterative approach)

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

//find and remove Nth node from end

   public void deleteNthFromEnd(int n){
    //calculate size
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }

    if(n==sz){
        head=head.next;
        sz++;
    }
    if(n==sz){
        head=head.next;//removeFirst
        return;
    }
    //sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
   }


//check if the list is pallindrome or not

    public Node findMid(Node head){ //STEP 1 --> TO FIND MID
        Node slow=head;
        Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }
    return slow;
}

    public boolean checkPallindrome(){
        if(head==null || head.next==null){
            return true;
        }

        Node midNode=findMid(head);//mid node

        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr != null){ //STEP 2 REVERSE THE SECOND HALF (AFTER MID LIST)
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        //STEP 3 COMPARE THE FIRST HALF AND SECOND HALF
        Node right=prev;
        Node left=head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    public static void main(String args[]){
       LinkedList1 ll=new LinkedList1();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addLast(4);
       ll.addLast(5);
    //    ll.add(2,9);

       ll.print();// 3 2 1 4 5 null
    //    ll.removeFirst();
    //    ll.print();//2 1 4 5 null
    //    ll.removeLast();
    //    ll.print();//2 1 4 null

       System.out.println(ll.itrSearch(1));//output-->2
       System.out.println(ll.itrSearch(10));//-1
       System.out.println(ll.recSearch(1));//2
       System.out.println(ll.recSearch(10));//-1

       ll.reverse();
       ll.print();//5 4 1 2 3 null

    //    ll.deleteNthFromEnd(3);
    //    ll.print();//3 2 4 5 null

       System.out.println(ll.checkPallindrome());
       System.out.println("size of linked list is : " +ll.size);
    }
}
import java.util.*;
public class SumNodes{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int lSum=sum(root.left);
        int rSum=sum(root.right);

        return (lSum+rSum)+root.data;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println("Total sum of nodes is  "+sum(root));

    }
}
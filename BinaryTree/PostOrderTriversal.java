import java.util.*;
public class PostOrderTriversal{
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

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        postOrder(root);
    }

}
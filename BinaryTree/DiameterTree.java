import java.util.*;
public class DiameterTree{
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

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lH=height(root.left);
        int rH=height(root.right);

        return Math.max(lH,rH)+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int lHeight=height(root.left);
        int rHeight=height(root.right);

        int lDia=diameter(root.left);
        int rDia=diameter(root.right);

        int selfDia=lHeight+rHeight;

        return Math.max(selfDia,Math.max(lDia,rDia));
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left.left=new Node(8);
        root.left.right.right=new Node(6);
        root.left.right.right.right=new Node(7);
        root.left.left.left.left=new Node(9);

        System.out.print(diameter(root));
    }
}
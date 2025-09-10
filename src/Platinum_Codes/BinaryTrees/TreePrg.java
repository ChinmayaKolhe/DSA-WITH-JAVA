package Platinum_Codes.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class TreePrg {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Inorder Traversal:-");
        Inorder(root);
        System.out.println();
        System.out.println("Preorder Traversal:-");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder Traversal:-");
        Postorder(root);
        System.out.println();
        System.out.println("Level-order Traversal:-");
        LevelOrder(root);
    }
    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"->");
        Inorder(root.right);
    }
    static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        Preorder(root.left);
        Preorder(root.right);
    }
    static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+"->");
    }
    static void LevelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelsize= queue.size();
            for(int i=0;i<levelsize;i++) {
                Node temp = queue.poll();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println();
        }
    }
}

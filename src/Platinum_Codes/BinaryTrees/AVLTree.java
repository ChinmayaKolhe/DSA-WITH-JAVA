package Platinum_Codes.BinaryTrees;

public class AVLTree {
    Node root;
    public static void main(String[] args) {
        AVLTree tree=new AVLTree();
        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,40);
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,25);
        System.out.println("Tree=");
        preorder(tree.root);
    }
    static class Node{
        int key,height;
        Node left,right;
        Node(int data){
            this.key=data;
            left=right=null;
            height=1;
        }
    }
    static Node insert(Node root,int key){
        if(root==null){
            return (new Node(key));
        }
        if(key<root.key){
            root.left=insert(root.left,key);
        }
        else if(key>root.key){
            root.right=insert(root.right,key);
        }
        else{
            return root;
        }
        root.height=1+Math.max(height(root.left),height(root.right));
        int balance=getBalance(root);
        //right rotation
        if(balance>1 && key<root.left.key){
            return rightRotate(root);
        }
        //left rotation
        if(balance<-1 && key>root.right.key){
            return leftRotate(root);
        }
        //left-right rotation
        if(balance>1 && key>root.left.key){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        //right-left rotation
        if(balance<-1 && key<root.right.key){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    static Node rightRotate(Node b){
        Node a=b.left;
        Node temp=a.right;
        a.right=b;
        b.left=temp;
        b.height=1+Math.max(height(b.left),height(b.right));
        a.height=1+Math.max(height(a.left),height(a.right));
        return a;
    }
    static Node leftRotate(Node a){
        Node b=a.right;
        Node temp=b.left;
        b.left=a;
        a.right=temp;
        a.height=1+Math.max(height(a.left),height(a.right));
        b.height=1+Math.max(height(b.left),height(b.right));
        return b;
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    static int getBalance(Node root){
        if(root==null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }
    static void preorder(Node root){
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}

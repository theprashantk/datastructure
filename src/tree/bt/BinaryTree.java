package tree.bt;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;


    public void insert(int data){

        if(null == this.root){
            this.root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(this.root);

        while(!queue.isEmpty()){

            Node node = queue.remove();

            if( null == node.right){
                node.right = new Node(data);
                return;
            }else if( null == node.left){
                node.left = new Node(data);
                return;
            }else{
                queue.add(node.left);
                queue.add(node.right);
            }

        }
    }

    public void populate(int a[]){

        for(int data: a){
            insert(data);
        }
    }

    public void printInorder(Node node){

        if( null == node){
            return;
        }

        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);

    }

    public static void main(String[] args) {

        int a[] = new int[]{1,2,3,4,5,6,7,8};
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(a);
        binaryTree.printInorder(binaryTree.root);
    }

}

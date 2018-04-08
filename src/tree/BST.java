package tree;

public class BST {


    public Node root;



    public Node insert(Node root, Node node){

        if (root == null){
            root = node;
            return node;
        }

        if (node.data < root.data){
            root.left = insert(root.left, node);
        }else {
            root.right = insert(root.right, node);
        }

        return root;
    }

    public Node populateTree(int a[]){

        for (int i = 0; i < a.length; i++){
            Node node = new Node(a[i]);
           root = insert(root, node);
        }
        return root;
    }
    public void inorder(Node node){

        if (node== null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public static void main(String[] args) {

        BST bst = new BST();
        bst.root = bst.populateTree(new int[]{10, 2, 13, 9, 4, 1, 35, 12, 40, 15});
        bst.inorder(bst.root);
    }
}

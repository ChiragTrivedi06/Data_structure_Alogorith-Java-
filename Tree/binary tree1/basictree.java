
// package Tree.binary tree1;
import java.util.*;

public class basictree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;

        public static Node buildtree(int arr[]) {

            idx++;
            if (arr[idx] == -1) {
                return null;

            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildtree(arr);
            newNode.right = buildtree(arr);

            return newNode;

        }

        public static void preorderprint(Node x) {

            if (x == null) {
                // System.out.print(" ") ;
                return;

            }
            System.out.print(x.data + " ");
            preorderprint(x.left);
            preorderprint(x.right);

            return;

        }

        public static void inorderprint(Node x) {

            if (x == null) {
                System.out.print(-1+" ");
                return;

            }

            inorderprint(x.left);

            System.out.print(x.data + " ");
            inorderprint(x.right);

        }

        public static void postorderprint(Node x) {

            if (x == null) {
                return;

            }

            postorderprint(x.left);

            postorderprint(x.right);
            System.out.print(x.data + " ");

        }

       public static void levelordertraversel(Node root) {
            if (root == null) {
                return;

            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            // q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                // if (currNode == null) {
                //     System.out.println();
                //     if (q.isEmpty()) {
                //         break;
                //     } else {
                //         q.add(null);
                //     }
                // } else {
                //     System.out.print(currNode.data + " ");
                //     if (currNode.left != null) {
                //         q.add(currNode.left);
                //     }
                //     if (currNode.right != null) {
                //         q.add(currNode.right);
                //     }
                // }

                // ONE LINE PRINT LIKE 1 2 3 4 5 6
                System.out.print(currNode.data+" ");
               if(currNode.right != null){
                q.add(currNode.right);
                }
                if(currNode.left!=null){
                q.add(currNode.left);
                }
               

            }

        }

        public static int maxdiameter(Node root){

            if(root==null){
                return 0;
            }

            int ld=maxdiameter(root.left);
            int rd = maxdiameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int self =  lh+rh+1;

            return Math.max(ld, Math.max(rd, self));

        }

        // public static void levelorder(Node root){

        // }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int hl=height(root.left);
            int hr = height(root.right);
             
            int height = Math.max(hl,hr)+1;
            return height;

        }
        public static  int count(Node root){
            if(root==null){
                
                return  0;
            }
            int countl=count(root.left);
            int countr = count(root.right);
            
            return root.data+countl+countr;


            
            
        }

    }

    public static void main(String args[]) {
        System.out.println("hello");
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.buildtree(arr);
        // System.out.println(root.right.right.data);
        // tree.preorderprint(root);
        // System.out.println();
        // tree.inorderprint(root);
        // System.out.println();
        // tree.postorderprint(root);
        // System.out.println();
        // tree.levelordertraversel(root);
        // System.out.println();
        // System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.maxdiameter(root));

    }
}

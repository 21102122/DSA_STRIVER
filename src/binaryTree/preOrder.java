package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class preOrder {


    static  class Node {
        int data;
         Node left;
         Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static  class BinaryTree{
         static  int idx= -1;
         public static Node buildTree(int nodes[]){
             idx++;
             if (nodes[idx]== -1){
                 return null;
             }
             Node newNode = new Node(nodes[idx]);
             newNode.left = buildTree(nodes);
             newNode.right = buildTree( nodes);
             return newNode;
         }
    }
    public static  void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public  static  void inOrder (Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static  void levelOrder(Node root){
        if (root == null){
            return;
        }

        Queue<Node > q = new LinkedList<>();
        q.add( root);
        q.add( null);
        while (!q.isEmpty()){
            Node curr = q.remove();
            if (curr == null){
                System.out.println(
                );
//                queue is empty
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }

            }else {
                System.out.print(curr.data+" ");
                if(curr.left!= null){
                    q.add(curr.left);
                }
                if (curr.right!= null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root){
        if (root== null){
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return leftNode + rightNode +1;
    }
    public static int sumOfNodes(Node root){
        if (root == null){
            return  0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return  leftsum+rightsum+root.data;


    }

//    approach 1
    public static int diameterApp1(Node root){
        if (root == null){
            return 0;
        }
        int dim1 = diameterApp1(root.left);
        int dim2 = diameterApp1(root.right);
        int dim3 = height(root.right)+ height(root.left)+1;

        return Math.max(dim3, Math.max(dim1,dim2));
    }
//    approach 2

    static class  TreeInfo{
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameterApp2(Node root){
        if (root== null){
            return  new TreeInfo(0,0);
        }
        TreeInfo leftTI = diameterApp2(root.left);
        TreeInfo rightTI = diameterApp2(root.right);

        int myHeight = Math.max(leftTI.ht, rightTI.ht)+1;
        int diam1 = leftTI.ht+rightTI.ht+1;
        int diam2 = rightTI.diam;
        int diam3 = leftTI.diam;
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));


        return new TreeInfo(myHeight, myDiam);


    }

    public  static int height(Node root){
        if(root== null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
//        countOfNodes(nodes);
//        System.out.println();
//        sumOfNodes(nodes);
        System.out.println(height(root));
        System.out.println();
        System.out.println(diameterApp1(root));
        System.out.println();
        System.out.println(diameterApp2(root).diam);

    }
}

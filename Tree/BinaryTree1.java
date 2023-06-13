import java.util.Scanner;

public class BinaryTree1 {

   static  Scanner sc = null;
     Node root = null;

     static Node createTree(){
        Node root ;
        System.out.println("enter the data");
        int data = sc.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("enter the data for left :"+data);
        root.left = createTree();
        System.out.println("enter the right for "+data);
        root.right= createTree();
        return root;
     }

     static void printInOrder(Node node)
     {
        if(node == null)
         return;

         printInOrder(node.left);
         System.out.println(node.data);
         printInOrder(node.right);
     }
     



    public static void main(String[] args) 
    {
        sc = new Scanner(System.in);
        BinaryTree1 tree = new BinaryTree1();
        tree.root = createTree();
        System.out.println("print inorder");
        printInOrder(tree.root);
    }

}

class Node {
    
    int data;
    Node left;
    Node right;

     Node(int data) {
        this.data = data;

    }

}
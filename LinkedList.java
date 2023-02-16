import java.util.Scanner;

public class   LinkedList
{
    Node head;

    static class Node
    {
         int data ;
         Node next;

    
    Node (int d)
     {
          data = d;
          next = null;
     }
    }

    
    // method to insert the  a new node 
    public  static LinkedList insert (LinkedList list , int data)
    {
        Node new_node = new Node(data);
        // if the linked list is empty then make the new node as head
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            // else travese at the last node
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
         return list;

    }
    public static void  display(LinkedList list)
    {
        Node currentNode  = list.head;
        System.out.print("linked list is .."); 
        while(currentNode != null)
        {
            System.out.print(currentNode.data +" ");
            currentNode = currentNode.next;

        }
        System.out.println("");


    }

    //deletion by key
    public static void  deletionByKey(LinkedList list , int key)
    {
        Node currentNode = list.head;
        Node prevNode=null;
        
        //case-1 element at head itself
        if(currentNode != null && currentNode.data == key )
        {  
            list.head = currentNode.next;

        } 

        while(currentNode != null && currentNode.data != key)
        {
            prevNode = currentNode;
            currentNode = currentNode.next;
            

        }
        if(currentNode!= null)
        { 

            prevNode.next = currentNode.next;
            System.out.println("element found and deleted");

        }
        else
        {
            System.out.println("key not found and not deleted");

        }
    }
    public static int length(LinkedList list)
    {
        int len =  0 ;
        Node currNode  = list.head;
        while(currNode != null)
        {
            len ++;
            currNode = currNode.next;

        }
        return len ;
    }

       public static void deletionByPosition(LinkedList list , int pos)
       {
        Node currentNode = list.head;
        Node prev= null;
        if(pos == 0 && currentNode != null )
        {   list.head =currentNode.next;

        }
        
        
        if(pos>0 && pos < length(list))
        {   
            for(int i = 0 ; i< pos ; i++)
            {
                System.out.println("enter in loop");
                prev = currentNode;
                currentNode = currentNode.next;
            }
            prev.next = currentNode.next;
        }
        
       }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        LinkedList list = new LinkedList();
         insert(list, 0);
         insert(list,1);
         insert(list, 2);
         insert(list, 3);
         insert(list, 4);
         insert(list, 5);
         insert(list, 6);
         display(list);
        //  System.out.println("enter the position for deletion");
         // now take the key from user
        //  deletionByKey(list,sc.nextInt());
        //  display(list);
    System.out.println(" enter the position for element deletition ");
    deletionByPosition(list,sc.nextInt());
    display(list);
    System.out.println("length of list is >>"+ length(list));   
    }

    


}
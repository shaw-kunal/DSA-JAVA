public class DoublyLinkedList 
{
    // head
    Node head;
    static class Node
    {
        int data ;
        Node prev ;
        Node next;
    
    
    // constructor
    Node(int d)
    {
        data = d ;
    }
}

// insertion in doubly linked list
// insertion at front 
// insetion after given position (not required)
// before a   given node
// at the end of list
public static void insertionAtFirst(DoublyLinkedList list ,  int data)
{
    Node curr = list.head;
    Node  newnode = new Node(data);
  if(curr == null)
  {
    list.head = newnode;
    newnode.prev = list.head;
  }
  else 
  {
    newnode.next = curr;
    curr.prev  = newnode;
    list.head.next = newnode;
  }
} 

// display the DLL
public static void printDLL(DoublyLinkedList list)
{
   Node curr = list.head;
   System.out.println("traversal in forward direction");
      while(curr != null)
      {
        System.out.println(curr.data);
        curr= curr.next;
      }


}

// find the length of  DLL

public static int lenghtDLL(DoublyLinkedList list )
{
    int i = 0 ;
    Node curr = list.head;

    while(curr  != null)
    {
        i++;
        curr = curr.next;
    }
    return  i ;
}



// insertion at the end 

public static void insertionAtEnd(DoublyLinkedList list, int data )
{

    Node curr = list.head;
    if(curr == null)
  { insertionAtFirst(list, 0);
   return;}
   while(curr.next == null)
       curr = curr.next;

       Node newnode = new Node(data);
       newnode.prev = curr;
       curr.next  = newnode;

       



   
    
}


public static void main(String[] args)
 {
    DoublyLinkedList list = new DoublyLinkedList();
    insertionAtFirst(list, 2);
    insertionAtFirst(list, 4);
    insertionAtFirst(list, 3);
    printDLL(list);
   System.out.println("legth of list is:  " +lenghtDLL(list)); 
   insertionAtEnd(list, 5);
   insertionAtEnd(list, 6);
   insertionAtEnd(list, 7);
   insertionAtEnd(list, 8);
   printDLL(list);
   System.out.println("legth of list is:  " +lenghtDLL(list)); 



}



    
}



class LinkList 
{

    Node head ;

    static class Node
    {
        int data ;
        Node next ;
        Node(int d )
        {
            data = d ;
            next = null;
        }

    }

    public static  void  insert(LinkList list , int data )
    {
        
        Node new_node = new Node(data );
        if(list.head ==null)
        {
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;

        }
    
    }
    public static void  printList(LinkList list)
    {
        Node curr = list.head;
        System.out.println("linked list");
        // now  traveser the linked list
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;

        }
    }


    //deletion by key
    public static LinkList deleteByKey(LinkList list , int key )
    {  
       Node currNode = list.head;
       Node prevNode = null;
       if(currNode != null && currNode.data == key )   
       {
            list.head = currNode.next;
       }     
       while(currNode != null && currNode.data != key)
       {
           prevNode  =currNode;
           currNode = currNode.next;
       }
       if(currNode != null)
       {
         prevNode.next = currNode.next;
         System.out.println("key found and deleted");


       }
       else 
    
        System.out.println("key not found and deleted");
        return list;
    }


    public static  void deletedByIndex(LinkList list , int index)
    {
        Node currNode = list.head;
        Node prevNode = null;
        if(index== 0  )
        {
            list.head = currNode.next;
        }
        else
        {            
           for(int i = 0 ; i< index  ;i++)
           {
            prevNode = currNode;
            currNode = currNode.next;
           }
           prevNode.next = currNode.next;
           
           System.out.println("element  found and deleted");

        }
        if(index == length(list))
        {
            System.out.println("element not found");
        }



        



    }

    public static  int   length(LinkList list )
    {   int  i ;
        Node currNode  = list.head;
        for( i =0 ; currNode.next != null;i++ )
        {
            currNode = currNode.next;
        }
        return i;
    }
    public static void main(String[] args) 
    {
        
        LinkList list = new LinkList();
        insert(list,1);
        insert(list,2);
        insert(list,3);
        insert(list,4);
        insert(list,5);
        insert(list,6);
        insert(list,8);
        insert(list,9);
        insert(list,10);
        insert(list,11);
        printList(list);
        // delete the element from the list
        deleteByKey(list, 4);
        printList(list);
        // deleted element by index
        deletedByIndex(list ,7);
        printList(list);

        






    }

    
}

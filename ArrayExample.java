public class  ArrayExample
{
    public static void  display(int[] array)
    {
        for(int a : array)
        System.out.print(a);


    }
    public static void insertion(int[] array)
    {
        int len = array.length;
        for(int i = 0 ; i< len ; i++)
        {
            array[i] = i ;

        }
    }
    public static void main(String[] args) 
    { 
        int[] array = new int[8];
        System.out.println("array element before intertion of element"); 
        display(array); 

      System.out.println("  element enter in array");  
      insertion(array);
     System.out.println(" display the elemnt after insertion");  
      display(array);
      System.out.println("element updation ");
      array[5] = 10 ;
      System.out.println("array with updated element");
      display(array);
        
        

        
    }
}
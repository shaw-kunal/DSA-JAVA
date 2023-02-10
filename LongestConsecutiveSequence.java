import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence 
{
    public static void main(String[] args)
     {
         //Read elements and size
         Scanner scanner = new Scanner(System.in);
         int tam = scanner.nextInt();
         int[] a = new int[tam];
 
         for (int i = 0; i < a.length; i++) {
             a[i] = scanner.nextInt();
         }

         System.out.println("first");
         HashMap<Integer, Boolean> map = new HashMap<>();
         for(int a1 : a)
          map.put(a1, true);

          for(int val : a)
          {
            if(map.containsKey(val-1))
            {
                map.put(val,false);
            }
          } 

          System.out.println("first2");
          int maxstartpoint = 0 ;
          int maxlength = 0 ;
          for(int val : a)
          {
            if(map.get(val) == true)
            { 
                int  startpoint = val ;
                int len = 1;
                while(map.containsKey(startpoint +len ))
                {
                  len++ ;
                }
                if(maxlength<len)
                {
                    maxstartpoint = startpoint ;
                    maxlength = len;
                }

            }
          }

          System.out.println("first3");
        //   now print the value
        for(int i = 0 ; i <=  maxlength; i++)
        {
            System.out.print(i+maxstartpoint);


        }




         
        
    }
    
}

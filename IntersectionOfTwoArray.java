import java.util.*;
public class IntersectionOfTwoArray
 {
    public static void main(String[] args) 
    {
        int[] a = {1,2,2,8};
        int[] b = {3, 4,5, 1};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int a1 :a )
        set1.add(a1);
        for(int b1 : b )
        {
            if(set1.contains(b1))
            {
                set2.add(b1);

            }
        }
        Iterator itr = set2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        
    }
    
}

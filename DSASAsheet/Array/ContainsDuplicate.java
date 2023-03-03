import java.util.*;
public class ContainsDuplicate 
{
    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map =new HashMap<>();
      boolean flag = false;
      for(int i = 0 ;i<nums.length ; i++)
      {  int key = nums[i];
        int c =  map.getOrDefault(key, 0);
        map.put(key, ++c);
         if(c>1)
         {flag = true ;
            break;
         }
      } 
      return flag;      
      
    }

    public static void main(String[] args)
     {    int nums[] ={1,1,1,3,3,4,3,2,4,2};
          System.out.println(containsDuplicate(nums));
        
    }
    
}


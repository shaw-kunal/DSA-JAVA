import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWthoutrepeating
 { 
    public static void main(String[] args)
     { 
         Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));

    
     }


     public  static int lengthOfLongestSubstring(String s)
     { int res = 0 ;
        int left = 0 ;
        int right = 0 ;
        HashMap<Character , Integer> map = new HashMap<>();
        while (right < s.length())
        {   System.out.println("kunal");
            char r = s.charAt(right);
            map.put(r,map.getOrDefault(r,0)+1);
            while(map.get(r) >1)
            {
                char l = s.charAt(left);
                map.put(r,map.get(r)-1);
                left++;

            }
            res = Math.max(res, right - left+1);
            right++;

        }
        return res;



    
     }
    
}

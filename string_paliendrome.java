import java.util.*;

/**
 * string_palindrome
 * 
 *  Ref: https://www.programiz.com/c-programming/examples/palindrome-number
 *       https://www.geeksforgeeks.org/c-program-check-given-string-palindrome/ 
 * 
 */

public class string_paliendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        char c[] = A.toCharArray();
        
        //------------
        // 0 1 2 3 4
        // r a d a r
        //------------
        
        int h = c.length - 1, i = 0; // h = 4

        while(h >= i){ // 4 >= 0
            if(c[i++] == c[h--]){ // 1 == 3
                System.out.println("Yes");
                break;
            }
            else{
                System.out.println("No");
                break;
            }
        }
        
        /*

        Second Aproach:
        
        //------------
        // 0 1 2 3 4
        // r a d a r
        //------------

        boolean palindrome = true;

        for(int i = 0; i<A.length()/2;i++)  // 0 < 2
        {
        //                  (0,1)                    (5-1-1,5-0)                              
            if(!A.substring(i,i+1).equals(A.substring(A.length()-i-1,A.length()-i)))
            {
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        */
    }
}
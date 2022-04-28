import java.util.*;

/**
 * string_palindrome
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
        
        int h = c.length - 1, i = 0; // 4

        while(h >= i){
            if(c[i++] == c[h--]){
                System.out.println("Yes");
                break;
            }
            else{
                System.out.println("No");
                break;
            }
        }
    }
}
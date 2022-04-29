import java.util.*;

/* 
 * ||-- String Anagrams --||
 * 
 * Referance: https://examples.yourdictionary.com/anagram-examples.html 
 *            https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 */

public class string_Anagrams {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        /* 
            0 1 2 3 4 5
            l i s t e n
            
            0 1 2 3 4 5
            s i l e n t
        */
        
        int n1 = a.length();
        int n2 = b.length();

        if(n1 != n2)
            return false;

        char[] str1 = a.toCharArray();
        char[] str2 = a.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i < n1; i++)
            if(str1[i] == str2[i])
                return true;

        return true;

        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

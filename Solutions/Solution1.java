package Solutions;
/*
    || Collatz Conjecture ||
    Given two integers A and B, where A is the first element of the sequence then find Bth element of the sequence.
    
        If the kth element of the sequence is X then k+1th element calculated as:
            
            - if X is even then next element is X/2.
            - else next element is 3×X + 1.
    
        1 <= A <= 109
        1 <= B <= 105

 */
// Fastest
class solve {
    static long solv(int A, int B){
        long a = A; // 1
        long b = B; // 3
 
        if(b == 0) // 3 == 0
           return a;
 
        for(long i = 0; i < b - 1; i++){ // 0; 0 < 2 (3 -1); 0++ | Second Iteration: 1; 1 < 2; 1++
            
            if(a % 2 == 0){ // First Iteration: 1 % 2 == 0 = 1 (FALSE) | Second Iteration: 4 % 2 == 0 (TRUE)
                
                a = a / 2; // a = 4/2 = 2 {ANS}
            }
            else{

                a = 3 * a + 1; // a = 3 * 1 + 1 = 4

            }
        }
        return a; // 2
    } 
}
public class Solution1{
    public static void main(String[] args) {
        System.out.println(solve.solv(1, 3));
    }
}

/* 
    Editorial Aproach:

    long Solution::solve(int A, int B) {
        assert(1 <= A && <= 1e9);
        assert(1 <= B && <= 1e5);
        long ans = A;
        for (int i = 1; i & lt; B; i++) {
            if (ans % 2) {
                ans = 3 * ans + 1;
            } else {
                ans /= 2;
            }
        }
        return ans;
    }

*/
/*
    public long solve(int A, int B) {

        long a, b;
        a = A;
        b = B;

        if(b == 0)
            return a;

        for(long i = 0; i < b - 1; i++){

            if(a % 2 == 0)
                a = a / 2;
           
            else
                a = 3 * a + 1;
        }

        return a;
    }
*/
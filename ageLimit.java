/*

    Problem
    Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

    Minimum age limit is XX (i.e. Age should be greater than or equal to XX).
    Age should be strictly less than YY.
    Chef's current Age is AA. Find whether he is currently eligible to take the exam or not.

    Input Format
    First line will contain TT, number of test cases. Then the test cases follow.
    Each test case consists of a single line of input, containing three integers X, Y,X,Y, and AA as mentioned in the statement.
    Output Format
    For each test case, output YES if Chef is eligible to give the exam, NO otherwise.

    You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical). 
 
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ageLimit{
	public static void main (String[] args) throws java.lang.Exception	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();

            if(X >= A && A < Y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
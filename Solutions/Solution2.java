package Solutions;
/*
    Palindromic Time
*/
class solution{
    public int solv(String s){
        int h = 10*(s.charAt(0) - '0')+(s.charAt(1) - '0');
        int m = 10*(s.charAt(3) - '0')+(s.charAt(4) - '0');

        int inc = 0;

        while(!is_pali(h, m)){
            inc++;
            h = (h + (m + 1) / 60) % 24;
            m = (m + 1) % 60;
        }
        return inc;
    }
    public boolean is_pali(int h, int   m){
        return h / 10 == m % 10 && h % 10 == m / 10;
    }
}
public class Solution2 {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.solv("23:12"));
    }
}

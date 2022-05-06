import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * string_SpecialCharRemv
 */

public class string_SpecialCharRemv {

    public static void main(String[] args) {
        String s = "Hello, Yash!. This is String Special Char Remove.";
        
        String splits[] = s.split("[!,?._'@ ]"); // It will remove all the special char given between [] brackets
        // splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        // System.out.println(splits.length);
        for(String z : splits)
            System.out.println(z);
        
        // Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();
        // scan.close();

        // String splits[] = s.split("[!,?._'@ ]");
    	// splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
    	// System.out.println(splits.length);
    	// for(String z : splits)
    		// System.out.println(z);
        
        // String spc = st.replaceAll("\\s+|[\\-\\+\\$\\?\\.@&].*", "\n");
        // System.out.println(spc.length());
        // st = st.replaceAll("[^a-zA-Z0-9]+", "\n");
        // System.out.println(st);
    }
}
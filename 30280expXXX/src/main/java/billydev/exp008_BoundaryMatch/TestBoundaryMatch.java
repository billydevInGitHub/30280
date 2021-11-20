package billydev.exp008_BoundaryMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestBoundaryMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern="^a.*";   //just test a very simple boundary match 
        //
        String inputString="aadsasdfds"; //  this will match 
                inputString="basdfsaaad"; //will not match 
       boolean b = Pattern.matches(pattern,inputString );
       System.out.println("Regex test of pattern \""+pattern+"\" matches \""+inputString+"\" result : "+b+"\n");
		
       
       
       
       
       
       String pattern2="\\ba.*a\\b";   //just test a  boundary match
       //String pattern2="a\\w*a";  // for w* we can find many matches, but for .* then probably the biggest match which is greedy   
                                      // I guess as we make the greedy match first, then .* is something special , need pay attention to it !! 
       String  inputString2="abasdfvb aaada sdg asfsasdff ada"; //will find the first match or with greedy match 
               inputString2="aadaslja  xsdfsx  aadsfa";
               inputString2="aadaslja  axsdfsxa  aadsf";
       testPattern(pattern2,inputString2);
 
       System.out.println("Directly test:"+ inputString2.matches(pattern2)); //only true when the whole matches 
       
	}

	
	private static void testPattern(String pattern, String line) {
		// TODO Auto-generated method stub
	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
			while (m.find()) {
				System.out.println("Found a [" + m.group() + "].");
			}
	}
}

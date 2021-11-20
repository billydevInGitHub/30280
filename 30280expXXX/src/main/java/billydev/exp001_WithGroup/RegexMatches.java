package billydev.exp001_WithGroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main( String args[] ){
		
		
		//added by myself directly from Java API java.until.regex Pattern class
		// the following might be the simple and directly test of regex in java !! instead of using three lines!!
		boolean b = Pattern.matches("a*b", "aaaaab");
		System.out.println("Regex test of pattern \"a*b\" matches \"aaaaab\":"+b+"\n");
		
		
		
         //160328: the following code shall be moved to group and capturing of Exp011
		 // this example is from: http://stackoverflow.com/questions/17969436/java-regex-capturing-groups 
		
	      // String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(.*)(\\d+)(.*)";

	      testPattern(pattern, line); 
	      
	      line="My Test abc uuu";
	      pattern = "(.*)(\\d+)";  //need more examples 
	      testPattern(pattern, line); 	      

	   }

	private static void testPattern(String pattern, String line) {
		System.out.println("Testing :"+pattern+" "+line+" ----------");
		// TODO Auto-generated method stub
	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	      
	      //the following added by myself , seems only test the matched group
	      while(m.find()){
	    	  System.out.println("%%%%%%%%%%%Found value: "+m.group());
	      }
	}
}

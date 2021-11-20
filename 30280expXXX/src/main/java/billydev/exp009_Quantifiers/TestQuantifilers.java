package billydev.exp009_Quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQuantifilers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("************************************************************************\n\n");
		//refer to: https://docs.oracle.com/javase/tutorial/essential/regex/quant.html 
		String pattern="a?";   
		String inputString=""; 

		boolean b = Pattern.matches(pattern,inputString );
		System.out.println("(1) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");
		
		
		pattern="a*";   
		inputString=""; //if it changes to one space, not working 

		b = Pattern.matches(pattern,inputString );
		System.out.println("(2) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");

		
		//In the above example, the match is successful in the first two cases because the expressions a? and a* both allow for zero occurrences of the letter a
		pattern="a+";   
		inputString=""; 

		b = Pattern.matches(pattern,inputString );
		System.out.println("(3) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");
		
		
		System.out.println("************************************************************************\n\n");
		/// this group of example code seems not that good 
		pattern=".*foo";   
		inputString="xfooxxxxxxfoo"; 

		b = Pattern.matches(pattern,inputString );
		System.out.println("(4) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");

		
		
		
		pattern=".*?foo";   
		inputString="xfooxxxxxxfoo"; 

		b = Pattern.matches(pattern,inputString );
		System.out.println("(5) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");
		
		
		
		
		
		pattern=".*+foo";   
		inputString="xfooxxxxxxfoo"; 

		b = Pattern.matches(pattern,inputString );
		System.out.println("(6) Regex test of pattern: "+pattern+" matches:  "+inputString+": "+b+"\n");
		
	/**
	 * 	
	 */
		///////////////////////////////////////
//		pattern=".*?foo";                            
//	      Pattern r = Pattern.compile(pattern);
//
//	      // Now create matcher object.
//	      Matcher m = r.matcher("xfooxxxxxxfoo");
//	      if (m.find( )) {
//	         System.out.println("Found value: " + m.group(0) );
////	         System.out.println("Found value: " + m.group(1) );
////	         System.out.println("Found value: " + m.group(2) );
//	      } else {
//	         System.out.println("NO MATCH");
//	      }
	      
	   
		System.out.println("************************************************************************\n\n");
	      
	      System.out.println("============================================");
	      String[] expressions ={".*foo",".*?foo",".*+foo"};
             // {"x?", "x*", "x+", "x{2}", "x{2,}", "x{2,5}"};

//      String input = "xxxxxx yyyxxxxxx zzzxxxxxx";
        String input="xfooxxxxxxuuuuufoouuuuuu";
               input="xfooxxxxxxuuuuufoouuuuuu";
               //input="xfooxxxxxxuuuuufoo";
         System.out.println(" The input string is: "+input); 
       // this example test greedy, reluctant and possessive quantifiers at the same time 
       // the possessive quantifier does not have any match as it all 
               
      for (String expression : expressions) {
          // Compiles the given regular expression into a
          // pattern and creates a matcher that will match
          // the given input against this pattern.
          Pattern pattern2 = Pattern.compile(expression);
          Matcher matcher = pattern2.matcher(input);

          // Find every match and print it
          System.out.println("------------------------------");
          System.out.format("regex:  %s %n", expression);
          while (matcher.find()) {
              System.out.format("Text \"%s\" found at %d to %d%n",
                      matcher.group(), matcher.start(),
                      matcher.end());
          }
      }
	}

}

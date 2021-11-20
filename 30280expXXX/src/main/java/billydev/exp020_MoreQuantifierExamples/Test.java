package billydev.exp020_MoreQuantifierExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	
	public static void testRegex(String[] patterns, String input){

		System.out.println(" The input string is: " + input);

		for (String expression : patterns) {
			// Compiles the given regular expression into a
			// pattern and creates a matcher that will match
			// the given input against this pattern.
			Pattern pattern2 = Pattern.compile(expression);
			Matcher matcher = pattern2.matcher(input);

			// Find every match and print it
			System.out.println("------------------------------");
			System.out.format("regex:  %s %n", expression);
			
			while (matcher.find()) {
				System.out.format("Text \"%s\" found at %d to %d%n", matcher.group(), matcher.start(), matcher.end());
			}
		}
	}
	
	public static void main(String[] args) {
		// refer to:
		// https://docs.oracle.com/javase/tutorial/essential/regex/quant.html

		System.out.println("Group1: greedy, reluctant and pocessive for .* ==================================");

		String[] expressions = { ".*foo", ".*?foo", ".*+foo" };


		String input = "xfooxxxxxxuuuuufoouuuuuu";

		testRegex(expressions, input);

		
		
		System.out.println("\n\nGroup2: greedy, reluctant and pocessive for .? ==================================");

		String[] expressions2 = { ".?foo", ".??foo", ".?+foo" };
		                          //
		                          //
		                          // .?+foo eat all , but each time can only eat "0 char+foo" or "1 char +foo" , as the provider is ".?"

		input = "xfooxxxxxxuuuuufoouuuuuu";

		testRegex(expressions2, input);

		
		System.out.println("\n\nGroup3: greedy, reluctant and pocessive for .+ ==================================");

		String[] expressions3 = { ".+foo", ".+?foo", ".++foo" };
		                         // .+foo     greedy, eat all, then go back found one match
		                         // .+?foo    eat one by one, so found 2 matches
		                         //.++foo     eat all, no match

		input = "xfooxxxxxxuuuuufoouuuuuu";

		testRegex(expressions3, input);
		
		
		System.out.println("\n\nGroup4: greedy, reluctant and pocessive for (dog){3} ==================================");

		String[] expressions4 = { "(dog){3}", "(dog){3}?", "(dog){3}+" };  //exactly match seems not care about the pocessive or greedy 

		input = "dogdogdogdogdogdog";
		testRegex(expressions4, input);

		
		System.out.println("\n\nGroup5: greedy, reluctant and pocessive for (dog){3,5} ==================================");

		String[] expressions5 = { "(dog){3,5}", "(dog){3,5}?", "(dog){3,5}+" };   // here the greedy or pocessive works !!
                                                                                  //each time can eat 3-5 dogs, greedy and possive will eat 5 while reluctant only each 3 !!                                           
		input = "dogdogdogdogdogdog";
		testRegex(expressions5, input);
	}

}

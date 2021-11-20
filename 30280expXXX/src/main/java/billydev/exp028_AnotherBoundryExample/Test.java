package billydev.exp028_AnotherBoundryExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// mtp6q37  last case 
		

		Pattern pattern =Pattern.compile("(\\s|^)0[xX][0-9a-fA-F]+(\\s|$)");  
		//Matcher matcher = pattern.matcher("asdf������0x14��jjhgjhg��0x22 0x22");  //this is from original question, because the greedy thing: we try to eat, could not find any match until the last one  is:  " 0x22" could be found 
		  Matcher matcher = pattern.matcher("0x22 0x33 0x44");  //this is from the question explanation, the issue  here is: greedy eat "0x22 "<--it can not , then 
		boolean found = false; 
		while (matcher.find()) { 
			System.out.println("Found the text :["+matcher.group()+"] starting at " +matcher.start()+" and ending at index "+ matcher.end()); 
			found = true;
		}
	}

}

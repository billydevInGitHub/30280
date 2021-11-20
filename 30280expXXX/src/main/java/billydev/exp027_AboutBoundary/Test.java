package billydev.exp027_AboutBoundary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// from mtp6q37
		
		String pattern="(\\s|\\b)0[xX][0-9a-fA-F]+(\\s|\\b)";
		
		String inputString="aaa 0x22 0x33 bbb 0x44";  //case 1: white space ok, when space matched, then space will be included!! 
		//String inputString="0x1+0x2 or 0x1@0x2";        //case 2: A word boundary occurs whenever there is a non word character i.e. a character other than��[a-zA-Z_0-9].
		//String inputString="0x1";                         //case 3: nothing but the quotation mark also works !! but if we remove \\b from the pattern, this input string should not work!   
		
		Pattern p = Pattern.compile(pattern); 
		
		Matcher m=p.matcher(inputString);
		
		
		while(m.find()){
			
			System.out.println("Find the match: ["+m.group()+"]"+ "start at:["+ m.start()+"]"+" end at:["+m.end()+"]");
		}

	}

}

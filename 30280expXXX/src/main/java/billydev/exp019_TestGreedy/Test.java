package billydev.exp019_TestGreedy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// mtp3q36
		
		String input="CooLooLCuuLooC";
		//String regex="C.*L";
		//String regex="C.*?L"; //added by myself to test relunctant
		String regex="C.*+L";  //added by  myself to test possessive
		
		
		
		
		//String regex="C.*+"    ; //added by myself , possessive might only work when regex is not followed by something
		//String regex="C.+L";  //this should also be greedy , because greedy means nothing following + or * 
		//String regex="C.+?L";   // this is relunctant for "+" regex  
		
		Pattern p = Pattern.compile(regex);
		Matcher m=p.matcher(input);
		
		while(m.find()){
			System.out.println("find a match : start: "+m.start()+" end : "+m.end()+"  the match string is:"+m.group(0));
		}
		

	}

}

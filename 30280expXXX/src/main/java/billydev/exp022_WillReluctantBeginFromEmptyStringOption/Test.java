package billydev.exp022_WillReluctantBeginFromEmptyStringOption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//added myself
		
		String input="fooxxxxxxfoo";
		Pattern p = Pattern.compile(".*?");//it is reluctant, match one "", then remove one char !! all match is ""
		                                   // .*  --greedy , then 2 matches , last empty string included
		                                   //.*+   --possessive,also include the last empty string !! ---last empty string could not be possessed !! 
		Matcher m= p.matcher(input);
		

		while(m.find()){
			int start=m.start();
			int end=m.end(); 
			//System.out.println("matched string:             \""+input.substring(start, end) +"\"  start: "+ start+"  end: "+end); //all matched is "" !!!
			System.out.println("matched string(from group): \""+m.group() +"\"  start: "+ start+"  end: "+end); //all matched is "" !!!
		}


	}

}

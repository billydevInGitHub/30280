package billydev.exp023_ReluctantMatchOneChar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//added myself
		
		String input="fooxxxxxxfoo";
		Pattern p = Pattern.compile(".{1}?");  //this one will match the char !! 
		Matcher m= p.matcher(input);
		

		while(m.find()){
			int start=m.start();
			int end=m.end(); 
			//System.out.println("matched string:             \""+input.substring(start, end) +"\"  start: "+ start+"  end: "+end); //all matched is "" !!!
			System.out.println("matched string(from group): \""+m.group() +"\"  start: "+ start+"  end: "+end); //all matched is "" !!!
		}


	}

}

package billydev.exp016_MatchStartMethodTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pattern p =Pattern.compile("\\s[\\d]*\\s");//orig, once match the space will be eaten !! 
		
		//Pattern p =Pattern.compile("[\\d]+\\s");//added by myself,  change * to + so at least some digits exist 
		//Matcher m = p.matcher("12 3abc ab23");
		Matcher m = p.matcher("12 3abc  178  899 ab23");   //modified by myself
		boolean b = false; 
		while(b = m.find()){
			System.out.println("m.start() is:"+m.start()+" "+ "m.group() is: "+ m.group());
	   }

	}
}

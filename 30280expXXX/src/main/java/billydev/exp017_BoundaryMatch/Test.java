package billydev.exp017_BoundaryMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//From 121PD538
		
		String str = "OCPJP 2013 OCPJP7";
		Pattern pattern = Pattern.compile("\\b\\w+\\D\\b");   //seems boundary did not occupy any char !! 
		         //pattern = Pattern.compile("\\b\\w+\\b");  //added by myself, seems the boundary does not occupy any chars 
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println("["+matcher.group()+"]"+"begin:"+matcher.start()+" end:"+matcher.end());
		}

	}

}

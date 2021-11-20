package billydev.exp007_POSIXCharClass;

import java.util.regex.Pattern;

public class TestPOSIXCharClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern="\\p{Punct}*";   //this group we are not so familiar with, Graph(visible) =Alnum+Punct 
		                                //they are visible and printable , printable=visible+space 
		                                //
		String inputString="\t\t"; //  is a not prin
		       inputString="{";
		       inputString="\"";
		boolean b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches:  "+inputString+": "+b+"\n");

	}

}

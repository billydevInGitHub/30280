package billydev.exp003_ReplaceAllDigits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace_All_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this example is from book37 ,after example 12-10
		
		
		String input="qwer23423sdfsfs22342";
		
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(input);
		String output = matcher.replaceAll("#");
		
		System.out.println(output);

		
	}

}

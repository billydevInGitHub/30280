package billydev.exp014_121PD217_UseGroupNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		//121PD217
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank postoffice, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
		Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
		Matcher matcher = pattern.matcher(str);
		String newStr = matcher.replaceAll("$1$2-$3$4");
		String newStr2=matcher.replaceAll("@@@@@@");       //replaceAll support both group number as well as just plain string !! 
		System.out.println(newStr);
		System.out.println(newStr2);
	}

}

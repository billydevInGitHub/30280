package billydev.exp013_121PD216;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexEmailAddress {

	public static void main(String[] args) {
		//121PD216
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank postoffice, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
				Pattern pattern = Pattern.compile("\\w+@\\w+\\.com");
				Matcher matcher = pattern.matcher(str);
				while(matcher.find()) {
				System.out.println(matcher.group());
				}

	}

}

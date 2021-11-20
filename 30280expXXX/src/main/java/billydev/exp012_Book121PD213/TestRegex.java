package billydev.exp012_Book121PD213;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// 121PD213
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
				Pattern pattern = Pattern.compile("\\w+");
				Matcher matcher = pattern.matcher(str);
				while(matcher.find()) {
				System.out.println("["+matcher.group()+"]");
				}

				System.out.println("---------");
		//121PD214
				//pattern = Pattern.compile("\\d{5}");// this is PD214 pattern which will mix zip with phone
				//pattern = Pattern.compile("\\D\\d{5}\\D");   //PD215 this is for pure zip code , but with " " and "," output as they also non-digital char
				pattern = Pattern.compile("\\b\\d{5}\\b");    //PD215
				//pattern = Pattern.compile("\\B\\d{5}\\B");    //this is added by myself to see non-word boundary
				matcher = pattern.matcher(str);
				while(matcher.find()) {
				System.out.println("matcher.start() is: "+matcher.start()+" matcher.group() is: " +matcher.group());
				}
	}

}

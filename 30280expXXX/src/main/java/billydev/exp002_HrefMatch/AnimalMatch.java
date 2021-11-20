package billydev.exp002_HrefMatch;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class AnimalMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I have a cat, but I like my dog better.";

		Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear|human)");
		Matcher m = p.matcher(input);

		List<String> animals = new ArrayList<String>();
		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
			animals.add(m.group());
		}
	}

}

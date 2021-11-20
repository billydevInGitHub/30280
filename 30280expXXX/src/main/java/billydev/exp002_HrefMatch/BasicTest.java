package billydev.exp002_HrefMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// from:
		// http://www.ocpsoft.org/opensource/guide-to-regular-expressions-in-java-part-1/
		String expression = "I lost my:? (wallet|car|cell phone|marbles)";

		String[] input = { "I lost my wallet", "I lost my wallets", "I lost my: car", "I lost my- car",
				"I lost my: cell", "I lost my: cell phone", "I lost my cell phone", "I lost my marbles" };
		for (String str : input) {
			System.out.println("\n\n\nFor expression \" " + expression + "\" matches \"" + str + "\" Result is: "
					+ Pattern.matches(expression, str));

			// the matcher is more detailed
			Pattern p = Pattern.compile(expression);
			Matcher m = p.matcher(str);
			while (m.find()) {
				System.out.format("Text \"%s\" found at %d to %d%n  %s", m.group(), m.start(), m.end(),
						"Using Start/End:" + str.substring(m.start(), m.end()));
			}

		}
	}

}

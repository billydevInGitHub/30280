package billydev.exp018_AnotherGroupExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// from 121PD538

		String str =
				"Suneetha N.=9876543210, Pratish Patil=9898989898";
				Pattern pattern =
				Pattern.compile("(\\w+)(\\s\\w+)(=)(\\d{10})");
				Matcher matcher = pattern.matcher(str);
				String newStr = matcher.replaceAll("$4:$2,$1");
				System.out.println(newStr);
	}

}

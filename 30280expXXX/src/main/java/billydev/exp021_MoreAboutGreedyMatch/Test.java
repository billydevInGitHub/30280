package billydev.exp021_MoreAboutGreedyMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// mtp5q8
		
		args=new String[]{"[wow]*",  "wow its cool" };
		Pattern p = Pattern.compile(args[0]);    
		Matcher m = p.matcher(args[1]);    
		boolean b = false;    
		
		while(b = m.find())    {        
			System.out.println(m.start()+" \""+m.group()+"\" "+m.end());    
			}

	}

}

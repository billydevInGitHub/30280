package billydev.exp030_OverallWithGreedy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//mtp1q22
		//just practice the order; 
		   Pattern p = Pattern.compile("\\s[\\d]*\\s");    
		   Matcher m = p.matcher("12 3abc ab23");    
		   boolean b = false;    
		   while(b = m.find())    {        
			   System.out.println(m.start()+" "+m.group());    
		}

	}

}

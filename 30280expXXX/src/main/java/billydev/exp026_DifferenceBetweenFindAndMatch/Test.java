package billydev.exp026_DifferenceBetweenFindAndMatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// copy from Exp021 
		
		args=new String[]{"[wow]*",  "wow its cool" };
		Pattern p = Pattern.compile(args[0]);    
		Matcher m = p.matcher(args[1]);    
		boolean b = false;    
		
		if(b = m.matches())    {       //checked the api, matches() will check the whole region !! while find() just one by one  
			System.out.print(m.start()+" \""+m.group()+"\" ");    
			}
		
		
		
		Pattern datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		String dateStr="28/03/2016  19/07/2017";
		Matcher m2 = datePatt.matcher(dateStr);
		
		while(b = m2.find())    {       //checked the api, matches() will check the whole region !! while find() just one by one  
			System.out.println(m2.start()+" group():  \""+m2.group()+"\"  group(1)"+"\""+m2.group(1)+"\"");
			
			}        //this is the good example explains that every match or find has the group !! 

	}

}

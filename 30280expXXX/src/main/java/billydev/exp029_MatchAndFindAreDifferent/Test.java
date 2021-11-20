package billydev.exp029_MatchAndFindAreDifferent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		//myself
		String pattern="[efg]*";
		String inputString="fggs";  //if we change from fggs to fggg , then the last zero match still exists 
		                            //if we change to afggs , more clear
	    Pattern p = Pattern.compile(pattern);
	    Matcher m =p.matcher(inputString);
	    while(m.find()){
	    	System.out.println("-----find a match :["+m.group()+"] start: "+m.start()+ " end: "+m.end());  
	    	//so the overall matches failed, but greedy can find them, 
	    	// also after the first match, greedy can match the zero length!!! 
	    }
		

	}

}

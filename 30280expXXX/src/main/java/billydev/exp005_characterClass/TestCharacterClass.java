package billydev.exp005_characterClass;

import java.util.regex.Pattern;

public class TestCharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[efg]*";   //mean repetition of anyone of the chars in the group 
		String inputString="ffggg"; //we use "tab" button on the keyboard
		       
		boolean b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");
		
		
		inputString="fggs";  //s is not within the group  //171109: pattern is a greedy pattern, it will check the overall !! 
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");

		
		pattern="[^efg]*";   //in the [] ^ is redefined, not a boundary match !!
		inputString="adcbd";  //s is not within the group  
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");			
		
		pattern="[e-hE-H]*";   //2 union group 
		inputString="eF";  //
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");			

		pattern="[e-h[E-H]]*";   //2 union group ( the same as above)  
		inputString="eFi";  // i is not within the 2 ranges 
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");
		
		pattern="[a-z&&[^bc]]*";   //2 union group ( the same as above)  
		                           //this might be useful !! 
		inputString="edi";  // eDi will not match as D is not within the range 
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches: "+inputString+": "+b+"\n");		
		
	}

}

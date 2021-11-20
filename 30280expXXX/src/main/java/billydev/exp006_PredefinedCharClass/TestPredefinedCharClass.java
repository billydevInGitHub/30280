package billydev.exp006_PredefinedCharClass;

import java.util.regex.Pattern;

public class TestPredefinedCharClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="\\s*";   //first back slash is java source code escape, then regex escape
		String inputString="\t\t\u000b"; //\u000b is a white space  
		       inputString="\t\t\\x0b";  //\\x0b is java regex , but not recoginze by java source code escape
		                                 // so that means: java String only accept \\\\uhhhh
		boolean b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern: "+pattern+" matches"+inputString+": "+b+"\n");
		
		
		
		
		pattern="\\x0b*";   //first back slash is java source code escape, then regex escape
		                    //\x0b is only recognized by regex, not by java source code !! 
		inputString="\u000b"; //\u000b is a white space  
		       
		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern: "+pattern+" matches"+inputString+": "+b+"\n");		
		
		
		
		pattern="\\W*";   //test non-word character  
		inputString="\u000b"; //\u000b is a white space  ,is also a non-word char 
		//inputString="\u0005"; //\u0005 is control character, is also a non-word char
		inputString="\u09FF"; //\u0005 is control character, is also a non-word char
		                      // suppose the whole set is all characters (including the unicode stuff) 

		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern: "+pattern+" matches"+inputString+": "+b+"\n");			
		

		pattern="\\s*";   //white space pattern 
		inputString=" "; //double confirm that space is a white space !! 

		b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern: "+pattern+" matches\""+inputString+"\": "+b+"\n");	
		
	}

}

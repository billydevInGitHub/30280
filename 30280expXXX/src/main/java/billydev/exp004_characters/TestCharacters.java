package billydev.exp004_characters;

import java.util.regex.Pattern;

public class TestCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="a\t*b";
		String inputString="a	b"; //we use "tab" button on the keyboard
		       //inputString="a   b";  then if we use space to replace the tab, we got false !! 
		boolean b = Pattern.matches(pattern,inputString );
		System.out.println("Regex test of pattern"+pattern+" matches"+inputString+": "+b+"\n");
		
		// this might be useful when we need to deal with many special characters 
		
		
	}

}

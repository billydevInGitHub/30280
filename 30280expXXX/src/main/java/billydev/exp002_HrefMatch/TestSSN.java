package billydev.exp002_HrefMatch;

import java.util.ArrayList;

public class TestSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example from: http://www.ocpsoft.org/opensource/guide-to-regular-expressions-in-java-part-1/
		
		ArrayList<String> input= new ArrayList<String>();
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (attack)");
		input.add("987-65-4321 ");
		input.add("192-83-7465");
		input.add("19283-7465");
		
		for(String ssn:input){
			if(ssn.matches("^\\d{3}-?\\d{2}-\\d{4}$")){
				System.out.format("\nString %s matches  %s", ssn, "^\\d{3}-?\\d{2}-\\d{4}$");
			}
		}

	}

}

package billydev.exp024_StringSplitExample;

public class Test {

	public static void main(String[] args) {
		//mtp6q16
		String[] strArray="1 dan 2 dave 3 dick".split("\\d");//if we add 4 to the end of the String, seems make no difference 
		//String[] strArray="1 dan 2 dave 3 dick4".split("\\d",-1);//  per : https://stackoverflow.com/questions/545957/java-split-method-strips-empty-strings-at-the-end
                                                                 //then the trailing empty string will not be discarded 		                                                        
		int i=0;
		for(String str :strArray){
			System.out.println("No "+ i++ +" : [" +str+"] ");
	   }
	}
}

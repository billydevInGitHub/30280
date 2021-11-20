package billydev.exp025_RegexLimit;

public class Test {

	public static void main(String[] args) {
		//mtp5q16
		String[][] inputStringArray=new String[6][];
		String fixed="boo:and:foo";
		inputStringArray[0]=fixed.split(":",2);
		inputStringArray[1]=fixed.split(":",5);
		inputStringArray[2]=fixed.split(":",-2);
		inputStringArray[3]=fixed.split("o",5); //if we change from 5 to 4 only ouput 4 and will use the last "o" as the normal char
		inputStringArray[4]=fixed.split("o",-2);
		inputStringArray[5]=fixed.split("o",0);
		
		int i=0;
		for(String[] sa:inputStringArray){
			System.out.println("\n\n "+i++ +" :");
			output(sa);
		}
		
	}
	
		
		public static void output(String[] inputStringArray){
			int i=0;
			System.out.println("============");
			for(String str:inputStringArray){
				System.out.println("No "+ i++ +" : " +str+" ");
			}
		}



}

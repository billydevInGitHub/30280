package billydev.exp011_GroupAndCapturing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//refer to: http://www.javamex.com/tutorials/regular_expressions/capturing_groups.shtml#.VvlQrHotiEY
		/*
		 * Capturing groups are an extremely useful feature of regular expression matching that allow us to query the Matcher to find out what the part of the string was that matched against a particular part of the regular expression.

Let's look directly at an example. Say we write an expression to parse dates in the format DD/MM/YYYY. We can write an expression to do this as follows:

[0-9]{2}/[0-9]{2}/[0-9]{4}

(In principle, we could make the regular expression put further constraints on the date. For example, the month part could be just [0-1][0-9], since the first digit of a month number must be 0 or 1. But for this example, we'll accept any number with the correct number of digits and assume that further range checking would then take place when a match was found.)

As it stands, this expression will tell us if a given string matches the required date format, but it won't help us read what the date is. This is where capturing groups come in. We re-write the expression as follows.

([0-9]{2})/([0-9]{2})/([0-9]{4})

The brackets surround the parts of the expression whose corresponding string we want to "remember". These bracketed expressions are called groups, and are number from 1 upwards from left to right.

Now, we can "pull out" these elements of the string with the following code:
		 */
		Pattern datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		String dateStr="28/03/2016";
		Matcher m = datePatt.matcher(dateStr);
		if (m.matches()) {
		  int day   = Integer.parseInt(m.group(1));
		  int month = Integer.parseInt(m.group(2));
		  int year  = Integer.parseInt(m.group(3));
		  //int year1  = Integer.parseInt(m.group(4)); //depends on the regex , there is no group(4)   
		  String group0=m.group();
		  System.out.println("day is "+ day);
		  System.out.println("month is "+month);
		  System.out.println("year is "+ year);
		  //the following one line is added by myself to test the group 0
		  System.out.println("the whole match is:"+group0);
		}
		
		
		
		
		System.out.println("==========================="); 
		//////the following example is added by myself
		
		
		datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})([0-9]{5})");
		dateStr="29/03/201690008";
		m = datePatt.matcher(dateStr);
		if (m.matches()) {
		  
		  int day   = Integer.parseInt(m.group(1));
		  int month = Integer.parseInt(m.group(2));
		  int year  = Integer.parseInt(m.group(3));
		  int newGroup  = Integer.parseInt(m.group(4));   
		  System.out.println("day is "+ day);
		  System.out.println("month is "+month);
		  System.out.println("year is "+ year);
		  System.out.println("new is "+ newGroup);
		    

		}

		System.out.println("==========================="); 
		
		//////the following example is added by myself2-----showing the whole group
		
		
		datePatt = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})([0-9]{5})");
		dateStr="29/03/201690008";
		m = datePatt.matcher(dateStr);
		if (m.matches()) {
		  String whole=m.group(0);
		  int day   = Integer.parseInt(m.group(1));
		  int month = Integer.parseInt(m.group(2));
		  int year  = Integer.parseInt(m.group(3));
		  int newGroup  = Integer.parseInt(m.group(4));   
		  System.out.println("whole is"+ whole);		  
		  System.out.println("day is "+ day);
		  System.out.println("month is "+month);
		  System.out.println("year is "+ year);
		  System.out.println("new is "+ newGroup);
		    

		}		
		
		
		System.out.println("==========================="); 
		//////the following example is added by myself3-----big regex as a group 
		
		
		datePatt = Pattern.compile("(([0-9]{2})/([0-9]{2})/([0-9]{4})([0-9]{5}))");
		dateStr="29/03/201690008";
		m = datePatt.matcher(dateStr);
		if (m.matches()) {
		  String whole=m.group(0);
		  String whole2=m.group(1);  // as we added a brace, group(1) changed to kind of whole thing!!
		  int day   = Integer.parseInt(m.group(2));
		  int month = Integer.parseInt(m.group(3));
		  int year  = Integer.parseInt(m.group(4));
		  int newGroup  = Integer.parseInt(m.group(5));   
		  System.out.println("whole is"+ whole);		
		  System.out.println("whole2 is"+ whole2);		
		  System.out.println("day is "+ day);
		  System.out.println("month is "+month);
		  System.out.println("year is "+ year);
		  System.out.println("new is "+ newGroup);
		    

		}			
		
	}

}

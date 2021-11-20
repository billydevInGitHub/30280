package billydev.exp002_HrefMatch;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HrefMatch {

    public static void main(String[] args)
    {
       try
       {
    	   // this example is from book 37 12-10
    	   
    	   
          // get URL string from command line or use default
          String urlString;
          if (args.length > 0) urlString = args[0];
          else urlString = "http://java.sun.com";

          // open reader for URL
          InputStreamReader in = new InputStreamReader(new URL(urlString).openStream());
                   // this is something read from internet !! very useful!! 

          // read contents into string buffer
          StringBuilder input = new StringBuilder();
          int ch;
          while ((ch = in.read()) != -1) input.append((char) ch);

          // search for all occurrences of pattern
          String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>])\\s*>";  
                       //after the equal sign 2 options: either everything in quotation marks or non-white space non-> ok 
          
                   // this is good example , pay attention to the space chars 
                   // in java we need to do one more escape !! 
          Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
          Matcher matcher = pattern.matcher(input);

          while (matcher.find())
          {
             int start = matcher.start();
             int end = matcher.end();
             String match = input.substring(start, end);
             System.out.println(match);
          }
       }
       catch (IOException e)
       {
          e.printStackTrace();
       }
       catch (PatternSyntaxException e)
       {
          e.printStackTrace();
       }
    }

}

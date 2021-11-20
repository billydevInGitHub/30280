package billydev.exp010_LogicalOperators;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//From:  http://www.vogella.com/tutorials/JavaRegularExpressions/article.html 6.1 examples
		String s = "humbapumpa jim";
	    System.out.println("--1---"+s.matches(".*(jim|joe).*"));
	    System.out.println("================\n");
	    s = "humbapumpa jom";
	    System.out.println("--2---"+s.matches(".*(jim|joe).*"));
	    System.out.println("================\n");
	    s = "humbaPumpa joe";
	    System.out.println("--3---"+s.matches(".*(jim|joe).*"));
	    System.out.println("================\n");
	    
	    s = "humbapumpa joe jim";
	    System.out.println("--4---"+s.matches(".*(jim|joe).*"));
		
		
	    // the following is added by myself to test the case of XY instead of X|Y 
	    System.out.println("======the following added by myself==========\n");	
		s = "humbapumpa jim";
	    System.out.println("--5---"+s.matches(".*(jim).*(joe).*"));
	    System.out.println("================\n");	    

		s = "humbapumpa jim  asdfsjoeasdfds";
	    System.out.println("--6---"+s.matches(".*(jim).*(joe).*"));
	    System.out.println("================\n");	    
		
	}

}

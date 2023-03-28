package Module4_String;

public class Exception {
	public static void div() 
	 { 
	 int a=10,b=0,c; 
	 try 
	 	{ 
		 c=a/b;//10/0 
	 	} 
	 catch(ArithmeticException e) 
	 	{ 
		 System.out.println("Exception is ocurred and handled"); 
	 	} 
	 } 

	public static void main(String[] args) {
		
		div();
	}

}

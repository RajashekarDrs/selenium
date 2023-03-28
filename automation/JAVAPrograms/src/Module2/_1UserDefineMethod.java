package Module2;
//print the prime number using UDM

//import java.util.Scanner;
public class _1UserDefineMethod {
	/*  =>UDM
	->In java we written a logicc in side a class, in order to develop any logic we use Main method,
	  but in case program is lengthy and if we write it in main method, then it is Complicated for
	  Reading,Understanding, and Difficult to find Error if accure,
	->Therefore to overcome this, it is recommended to use UDM.
  =>Method
  	->method is a set of statements which is enclosed within curly braces having Declaration & 
  	  which get executed whenever we call it it is called Method.
  	  
  	  Syntax:-
  	  	AccessModifier static/nonStatic returntype methodName(args[]noarg)
  	  	{
  	  		set of statement
  	  	}																		*/
	public static void Prime()
	{
		//Scanner sc = new Scanner();
		System.out.println("Enter a number");
		//int num = sc.nextInt();
		int num = 23;
		int count = 0;
	  for(int i=1;i<=num;i++)
	  {
		  if(num%i==0)
			count++;
	  }
	  	if(count==2)
	  	System.out.println(num+ "is Prime number");
	  	else
	  	System.out.println(num+ "is not Prime number");
	}
	//UDM
	public static void main(String[] args) {
		// calling Method
		Prime();
		Prime();
		Prime();

	}	
}

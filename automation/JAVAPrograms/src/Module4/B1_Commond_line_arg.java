package Module4;

public class B1_Commond_line_arg {
/*
 -> main method is having one spical argument as String type of array
 -> During execution we can pass some group of values through Command from promt
 	and thouse values will be Stored into array of String.
 */
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
/*	o/p c:-  java,CLA,java	CLA(Command Line Argument)
 
 -> whatever values we can pass through CLA will be stored into String type of
 	that is all the values are saved as String format. if we want to convert 
 	String value into numeric or decimal we have to following method.
 	
 	Integer.parseInt(String);
 	Double.parseDouble(String);
 	Float.parseFloat(String);
 
 */

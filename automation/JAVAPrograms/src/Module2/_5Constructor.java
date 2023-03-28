package Module2;

public class _5Constructor {
		String name = "Rajashekar Drs";
		
	public static void main(String[] args) {
		
			_5Constructor c1 = new _5Constructor();
			_5Constructor c2 = new _5Constructor();
			_5Constructor c3 = new _5Constructor();

/*->Here we have 3-Objects and for each Object separate memory for nonStatic variable
  ->there fore we can say that we can initialize separate value for each object
  ->if we initialize manually it is length approach to Overcome that JAVA introduce Constructor. 
 
  Definition:- 
   -> Constructor is a special type of method which get executed whenever we created an Object
   ->the main purpose of Constructor is to initialize a Non Static Variable.
   
   Syntax:-
   	 
   	 AccessModifier ConstructorName(with/with out args)
   	 {
   	 	//body of constructor;
   	 }
   =>Rules of Constructor
   	 ->constructor can be pppd
   	 ->constructor can be with args or without args
   	 ->constructor name must be same as class name
   	 ->constructor can't be Static or non Static, final,abstract
   	 ->constructor does't have any return type not even Void.
   
   	 
   =>Types of Constructor
   	1,No arg constructor
   	2,with arg constructor/parameterized constructor
   	3,default constructor
 */
}
}
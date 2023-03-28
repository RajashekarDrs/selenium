package Module3;
/*->one class is Inheritances two parent classes at the same time,
  ->Multiple Inheritance is not possible through classes because one class can't have 
  	two parent classes
  -> in case if it is has it leads some problems
  	1,Ambiguity Problem
  	2,Diamond problem
  	3,Constructor chaining problem
  	
  	1,Ambiguity Problem:-
  		->If one child class having two parent class an both having same method then, 
  		  when we call a method from child class there is a confusion which parent class
  		  member to call as both parents have same 				*/
class pp
{
	public void m1()
	{
		System.out.println("parent prop,,");
	}
}
class cc
{
	public void m1()
	{
		System.out.println("child prop,,");
	}
}
class both extends pp//actually we inherit it by pp,cc both but method name is same so we can't
{
	public void m1()
	{
		System.out.println("both can access");
	}
}

public class _3dMultiple_inherit {

	public static void main(String[] args) {
	both b = new both();
	b.m1();			//Ambiguity problem 28th line

	}

}
/*	2,Diamond problem:-
 	  ->Since the shape of a class diagram is an diamond structer so it also refer as 
 	  	Diamond shape class diagram problem.
 	  
 	3,Constructor chaining problem:-
 	  ->Constructor can't be inherit but they can invoked by using "call to Super".
 	  
 	  Call to Super:-
 	  ->the purpose of calling parent class constructor from child class constructor is called,,
 	  ->call super must be first statement in a constructor.
 	  >it represent as "Super()"
 	  
 	  Q)Why we need Super():-  ?
 	   ->because constructor is not inheritance we should suppose to call them we need it.
 	   		super(); is optional if parent class constructor does't have argument//implict
 	   		super(); is mandatory if parent class constructor have argument.//explict

*/

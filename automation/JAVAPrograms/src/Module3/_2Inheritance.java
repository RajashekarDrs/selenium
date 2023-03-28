package Module3;
/*->one class acquires properties of another class is called Inheritance it is also called as IS-A
	relationship or parent child relationship.
->here properties are defined as methods and variable.
->Extends is keyword which indicate we are create a new class from an existing class.
		SYNTAX:-
			 class A
			 {
			 	//member of A class/parent class
			 }
			 class B extend A
			 {
			 	//member of B class+A class/sub derived class 
			 }
	->we can inherit only non-static members, static members cann't be inherited because 
		they will be loaded only once in SAP for entire class
	->we can't inherit Constructor because they are not member of a class
	
	=>Types of Inheritance
		1,Single level
		2,multi level
		3,Hierarchical 
		4,multiple
		5,Hybrid		*/
	
	//Example
	class p{
	  public void m1()
	  {
		  System.out.println("parent");
	  }
	}
	class c extends p{
	  public void m2()
	  {
		  System.out.println("child");
	  }
	}
public class _2Inheritance {

	public static void main(String[] args){
		p par = new p();
		par.m1();		// output: parent
		//par.m2();		// output: can't find symbol
		
		c child = new c();
		child.m1();		//output: parent
		child.m2();		//output: child
		
		/*p par = new c();
		par.m1();		//output: parent
		par.m2();		//output: can't find symbol*/}}
		
	}
}

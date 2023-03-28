package Module2;
/*	1,create a class as non static var/Electronic.
	2,declare and initialize some non static var as Name,Brand,Color,Price,PurchasedFrom,,,,
	3,create a static method as ProductDetails() and Create a object print all static var
	4,create a main method make a call all methods*/
public class _4vNonStaticVar {
/* ==>Non Static Members(2)
  	=>1,Non static var:-
  	  ->var which is present outside a method inside a cls and does not have static keyword
  			Syntax: datatype varable = values;
 	=>2,Non static method:-
 	  ->a method does not have a static keyword such method is called as static method
 	 
 	 		NOTE:- Non static members we  can not use directly in side a static METHOD,
 	  	  			In order to use them we should Create an Object.
 	  	  	
 	  	  	Syntax:-
 	  	  				clsName referenceVar = new clsName();
 */
		String name="iPhone",brand="Apple",color="Silver",purchasedFrom="Amazon";
	    int price=89999;
	    
	 public static void ProductDetails(){
		 _4vNonStaticVar a = new _4vNonStaticVar();// create a object
		 System.out.println(a.name);				//print
		 System.out.println(a.brand);
		 System.out.println(a.color);
		 System.out.println(a.purchasedFrom);
		 System.out.println(a.price);
	 }
	 	
	public static void main(String[] args) {
		ProductDetails();

	}

}

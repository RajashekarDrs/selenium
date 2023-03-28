package Module2;
/*1,create a class as Static var/Electronic.
  2,declare and initialize some static var as Name,Brand,Color,Price,PurchasedFrom,,,,
  3,create a static method as ProductDetails() and print allstatic var
  4,create a main method make a call all methods
*/
	public class _4uStaticVar {
		//1+2,initialize static var
	   static String name="iPhone",brand="Apple",color="Silver",purchasedFrom="Amazon";
	   static 	int price=79999;
	public static void ProductDetails() {
		//3,create a static method
		System.out.println(name);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(purchasedFrom);
		System.out.println(price);
	}
	public static void main(String[] args) {
		//4,calling method
		ProductDetails();

	}

}/* here we use static keyword which is help to memory management,
	var will store into static memory locartion i.e heap area*/

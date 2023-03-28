package Module2;
/*1,Create an groceryApp/CombinationOfStaticAND non static
  2,Declare & initialize some static var itamName,brand.
  3,Declare & initialize some non static var amount,quantity.
  4,create a static method as a Customer_order() aand print all details.
  5,create a non-static method as Delivery_partner() and create some local var as
  	mask-charges,sanity_charges print all local var.
  6,create main() and make a call to Customer_order() & Delivery_partner(). */

public class _4xCombinationOfStaticANDnonstatic {
		static String itamName="washing machine", brand="samsung";
			int amount=6999,qunatity=2;
	public static void Customer_order(){
		System.out.println(itamName);
		System.out.println(brand);
		//for non static var
		_4xCombinationOfStaticANDnonstatic g = new _4xCombinationOfStaticANDnonstatic();
		System.out.println(g.amount);
		System.out.println(g.qunatity);
		}
	
	public void Delivary_partner() {//in main method can not call dirctly we need to create an obj
		
		int mask_charges=50,sanity_charges=100;
		System.out.println(mask_charges);
		System.out.println(sanity_charges);
		}
	public static void main(String[] args) {
		//calling static method
		Customer_order();
		//calling non static method
		_4xCombinationOfStaticANDnonstatic d = new _4xCombinationOfStaticANDnonstatic();
		d.Delivary_partner();
	}

}

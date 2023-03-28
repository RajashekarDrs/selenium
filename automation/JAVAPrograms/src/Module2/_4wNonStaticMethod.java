package Module2;

public class _4wNonStaticMethod {
		String name="iPhone",brand="Apple",color="Silver",purchasedFrom="Amazon";
		int price=99999;
	public void ProductDetails(){
			 System.out.println(name);				
			 System.out.println(brand);
			 System.out.println(color);
			 System.out.println(purchasedFrom);
			 System.out.println(price);
	}
	public static void main(String[] args) {
		_4wNonStaticMethod b = new _4wNonStaticMethod();	//create object for non static method
			b.ProductDetails();								//calling non static method

	}

}
	/* Q,where we need to create an Object
		->Non static members(var and method) inside static method.*/

package Module2;
//parameterize constructor
public class _5withArgConstructor {
		String empname,empdesg;
		int empid,empsal;
	public _5withArgConstructor(String name,String designation,int id,int sal) {
		empname=name;
		empdesg=designation;
		empid  =id;
		empsal =sal;
	}
	public static void main(String[] args) {
		_5withArgConstructor e1 = new _5withArgConstructor("Drs","TestEng",143,60000);
		_5withArgConstructor e2 = new _5withArgConstructor("Drk","DevEng",431,75000);
		System.out.println("Details of first Employee");
		System.out.println(e1.empname+" "+e1.empdesg+" "+e1.empid+" "+e1.empsal);
		System.out.println("Details of second Employee");
		System.out.println(e2.empname+" "+e2.empdesg+" "+e2.empid+" "+e2.empsal);
	}
/*-> Generally we need different name for "arg var(Constructor arg) and actual var(non-static var)"
  -> but in case if we keep Same name for both of them, then we will get default values as output
  		to overcome this we use "This Keyword"
  -> This keyword represent Current Object reference var name.****
  -> we will use This keyword to differentiate b/w actual var and argument var.***
	*/

}

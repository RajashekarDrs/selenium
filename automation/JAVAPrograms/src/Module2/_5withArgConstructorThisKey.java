package Module2;
//This keyword
public class _5withArgConstructorThisKey {
		String empname,empdesg;
			int empid,empsal;
		_5withArgConstructorThisKey(String empname,String empdesg,int empid,int empsal){//defult access
				this.empname=empname;
				this.empdesg=empdesg;
				this.empid  =empid;
				this.empsal =empsal;
			}
	public static void main(String[] args) {
		_5withArgConstructorThisKey e1 = new _5withArgConstructorThisKey("Drs","TestEng",143,60000);
		_5withArgConstructorThisKey e2 = new _5withArgConstructorThisKey("Drk","DevEng",431,75000);
		System.out.println("Details of first Employee");
		System.out.println(e1.empname+" "+e1.empdesg+" "+e1.empid+" "+e1.empsal);
		System.out.println("Details of second Employee");
		System.out.println(e2.empname+" "+e2.empdesg+" "+e2.empid+" "+e2.empsal);
	}

}

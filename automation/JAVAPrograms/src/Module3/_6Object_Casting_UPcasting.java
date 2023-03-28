package Module3;
//converting one class type of object into another class type of object is,,. 2types up & down
class A1{
	public void m1()
	{
		System.out.println("A class m1 method");
	}
}
class B1 extends A1{
	public void m2()
	{
		System.out.println("B class m2 method");
	}
}
public class _6Object_Casting_UPcasting {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m1();
		B1 b1 = new B1();
		b1.m1();
		b1.m2();
		A1 a2 = new B1();//
		a2.m1();
		//a2.m2();

	}

}

package Module3;
class A2
{
	public void m1()
	{
		System.out.println("A class m1 method");
	}
}
class B2 extends A2
{
	public void m2()
	{
		System.out.println("B class m2 method");
	}
}
public class _6Object_Cating_downcasting {
	public static void main(String[] args) {
		A2 a2 = new A2();	//up casting  only parent class
		B2 b2 = (B2) a2;	//down casting both parent and child
		//a2.m1();
		b2.m1();
		b2.m2();
	}
}

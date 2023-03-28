package Module3;
// combination of call to this & call to super(Constructor Chaining)
class A
{
	A()
	{
		System.out.println("1a-constructor without arg");
	}
	A(int i)
	{
		this(); /// it call parent properties to this 
		System.out.println("2A-constructor with args");
	}
}
class B extends A
{
	B()
	{
		super(1000);
		System.out.println("3B-constructor without arg");
	}
	B(int i)
	{
		this();
		System.out.println("4B-constructor with args");
	}
}
public class _3eConstructor_Chaining_super {

	public static void main(String[] args) {
		 B b1 = new B(10000);	} }


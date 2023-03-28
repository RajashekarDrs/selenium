package Module3;
class A
{
	public A()
	{
		System.out.println("1");
	}
}
class B
{
	public B()
	{ b
		System.out.println("2");
	}
}
class C extends A.B
{
	public C
	{
		super();
		super();//constructor chaining problem
	}
}
public class _3fConstructor_chaining_super {

	public static void main(String[] args) {
/*	Note:-
	Here C-constructor should call to both A&B parent class constructor which is not possible
	because in one constructor we can have only call to super, there fore here it leads to
	Problem of constructor Chaining..
	
	Therefore due to Ambiguity problem Diamond problem & constructor chaining problem Multiple
	inheritance is not possible through classes, but it is possible through interface.
*/
	}

}

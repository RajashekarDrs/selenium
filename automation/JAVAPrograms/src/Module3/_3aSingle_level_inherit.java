package Module3;

//1parent and 1child(Single level Inheritance)
class Animal
{
	public void eat()
	{
		System.out.println("animals eat");
	}
}
class dog extends Animal
{
	public void bark()
	{
		System.out.println("bark bark");
	}
}
public class _3aSingle_level_inherit {

	public static void main(String[] args) {
		//Animal e = new Animal();
		//e.eat(); // we can acquires only parent properties
		dog d = new dog();
		d.bark();
		d.eat();
	}

}

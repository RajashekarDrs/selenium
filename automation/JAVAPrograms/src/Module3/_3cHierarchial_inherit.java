package Module3;
//single parent class have multiple children classes(Hierarchial-Inheritance)
class Animalll
{
	public void eat()
	{
		System.out.println("Animal eatssss");
	}
}
class catt extends Animalll
{
	public void meow()
	{
		System.out.println("cat said meoww");
	}
}
class doggg extends Animalll
{
	public void bark()
	{
		System.out.println("dog said bark bark");
	}
}
public class _3cHierarchial_inherit {
	public static void main(String[] args) {
		doggg d = new doggg();
		d.eat();
		d.bark();
		catt c = new catt();
		c.eat();
		c.meow();	}}

package Module3;
//grand parents,parents,children,grand-children(Multi-level Inheritance)
class Animall{
	public void eat()
	{
		System.out.println("animal eats");
	}
}
class dogg extends Animal
{
	public void bark()
	{
		System.out.println("bark bark");
	}
}
class cat extends dog
{
	public void meow()
	{
		System.out.println("cat meoww said");
	}
}
public class _3bMulti_level_inheritance {
	public static void main(String[] args) {	
		cat c = new cat();// with the help of cat method u can acquire all above parent property
		c.meow();
		c.bark();
		c.eat();				} }

package Module3;
class zomato
{
	public void getRestorent()
	{
		System.out.println("According to loaction");
	}
}
class users extends zomato
{
	public void getRestorent()
	{
		System.out.println("According to rating & Review");
	}
}
class prime extends zomato
{
	public void getRestorent()
	{
		System.out.println("Prime member ship");
	}
}
public class _4bMethod_overriding {

	public static void main(String[] args) {
		zomato z = new zomato();
		z.getRestorent();
		users u = new users();
		u.getRestorent();
		prime p = new prime();
		p.getRestorent();
	}

}

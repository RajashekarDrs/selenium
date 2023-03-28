package Module2;

public class _4yHowManyWaysToAccessStaticMethod {
	static String name="Rajashekar DRS";
	public static void main(String[] args) {
		System.out.println(name);									//Directly
		System.out.println(_4yHowManyWaysToAccessStaticMethod.name);//through class name
		
		_4yHowManyWaysToAccessStaticMethod o =new _4yHowManyWaysToAccessStaticMethod();
		System.out.println(o.name);										//through object

	}

}

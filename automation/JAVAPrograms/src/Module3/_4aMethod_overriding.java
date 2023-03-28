package Module3;
// create for separate object for each method(Method Overriding)
class parentt{
	public void getMarriage()
	{
		System.out.println("arrange marraiage");
	}
}
class kids extends parentt{
	public void getMarriage()
	{
		System.out.println("love marriage");
	}
}
public class _4aMethod_overriding {
	public static void main(String[] args) {
		parentt p1 = new parentt();
		p1.getMarriage();
		kids k1 = new kids();
		k1.getMarriage();}}

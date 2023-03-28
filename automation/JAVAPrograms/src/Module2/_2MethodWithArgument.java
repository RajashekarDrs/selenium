package Module2;
//WAP to Areas for Multiple using UDM with argument
public class _2MethodWithArgument {
	/*	=>Method with Argument
	 ->Arguments are define as input given to any Method
	 
	 Syntax:-
	 
	 	MethodHeader(3PartsPSR) MethodName(datatype var,datatype var....)*/
	public static void areaofTri(int b,int h)
	{
		double areaT = 0.5*b*h;
		System.out.println(areaT);
	}
	public static void areaofRect(int l,int b)
	{
		double areaR = l*b;
		System.out.println(areaR);
	}
	public static void areaofCir(int r)
	{
		double areaR = 3.14*r*r;
		System.out.println(areaR);
	}
	public static void areaofSqr(int s)
	{
		double areaS = s*s;
		System.out.println(areaS);
	}

	public static void main(String[] args) {
	// calling methods
	areaofTri(4,8);
	areaofRect(6,9);
	areaofCir(12);
	areaofSqr(11);
}
}
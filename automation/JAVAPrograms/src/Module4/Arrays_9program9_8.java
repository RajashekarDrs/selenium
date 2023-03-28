package Module4;
//passing an Array as argument
public class Arrays_9program9_8 {
	public static void display(int s[],String str[])
	{
		for(int j=0;j<s.length;j++)
		System.out.println(s[j]+" "+str[j]);
	}

	public static void main(String[] args) {
		int a[] = {1001,1002,1003,1004};
		String s[] = {"java","j2EE","paython","datastructer"};
		display(a,s);

	}

}

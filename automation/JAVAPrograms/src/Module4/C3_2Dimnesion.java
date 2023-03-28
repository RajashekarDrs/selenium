package Module4;
//WAP to demonistrate splite method
public class C3_2Dimnesion {

	public static void main(String[] args) {
		String s = "java automation test Engineer";
		String str[] = s.split(" ");/*	split the data 		java 0
														automation 1
															test     2
															Engineer  3  	*/
		for(int k=0;k<str.length;k++)
		{
			System.out.println(str[k]);
		}
	}

}

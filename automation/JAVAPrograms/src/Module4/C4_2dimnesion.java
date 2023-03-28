package Module4;
//WAP to reverse words of String 
public class C4_2dimnesion {

	public static void main(String[] args) {
		String s = "we are Automation test engineers";
		String str[] = s.split(" ");
		for(int k=str.length-1;k>=0;k--)//lenth of array is 12345 but array count from 01234
		{
			System.out.println(str[k]);
		}

	}

}

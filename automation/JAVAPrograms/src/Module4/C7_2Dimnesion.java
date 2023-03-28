package Module4;
//WAP to Delete duplicate words from a String????????/
public class C7_2Dimnesion {

	public static void main(String[] args) {
		String s = "we are test engg we can test the app";
		String str[] = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]=" ";
				}
			}
		//if(str[i]=" "&&count>=1)
		{
			System.out.println(str[i]+" ");
		}
		}

	}

}

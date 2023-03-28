package Module4;
//WAP to find frequence of words present in a String??????
public class C5_2Dimnesion {

	public static void main(String[] args) {
		String s = "we are test engg we can test the app";
		String str[] = s.split(" ");
		int count=0;
		for(String word:str)
		{
			if(word.equalsIgnoreCase("test"))
				count++;
		}
		System.out.println(count);

	}

}

package Module4;
//WAP to print Longest word from a String
public class C6_2Dimnesion {

	public static void main(String[] args) {
		String s = "we are test engg we can test the app";
		String str[] = s.split(" ");
		String max = str[0];
		for(String word:str)
		{
			//if(word.length(),max.length())
			max=word;
		}
		System.out.println(max);
	}

}

package Module4;
//WAP of Palindrome using Array
public class Arrays_9program9_9 {
	public static void pallindrome(int s[])
	{
		for(int j=0;j<s.length;j++)
		{
			int num=s[j],rev=0,rem;
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				rev=rev*10+rem;
			}
			if(rev==s[j])
				System.out.println(s[j]+" is pallindrome");
		}
		
	}

	public static void main(String[] args) {
		int a[] = {1221,2421,3548,3223,5435};
		pallindrome(a);
	}

}

package Module4;
//WAP to print prime numbers from the given Array and create array Object.
public class Arrays_9program9_2 {

	public static void main(String[] args) {
		int a[] = {17,45,65,44,41,95};//Array Object
		for(int i=0;i<a.length;i++)// length of array that many times loop will repeat ex: 6
		{
			int count=0;
			for(int j=1;j<=a[i];j++)	//a[i] it will take one by one i.e 17,45,65,44,,,,,
			{
				if(a[i]%j==0)
					count++;
			}
			if(count==2)
			{
			System.out.println(a[i]+"is a prime number");
			}
		}
	}

}

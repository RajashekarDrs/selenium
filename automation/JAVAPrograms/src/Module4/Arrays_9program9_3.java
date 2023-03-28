package Module4;
//WAP to print Maximum number from Array
public class Arrays_9program9_3 {

	public static void main(String[] args) {
		int a[] = {22,45,256,222,321};
		int max=22; // if say or int max = a[0]
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max number is :"+max);

	}

}
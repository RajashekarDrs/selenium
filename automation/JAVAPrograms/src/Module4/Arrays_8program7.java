package Module4;
//WAP only even numbers from array by reading the values through scanner class.
import java.util.Scanner;

public class Arrays_8program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			if(a[j]%2==0)
			{
				System.out.println(a[j]);
			}
		}

	}

}

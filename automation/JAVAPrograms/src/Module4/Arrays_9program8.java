package Module4;

import java.util.Scanner;

//WAP even Index position numbers from array by reading the values through scanner class.
public class Arrays_9program8 {

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
			if(j%2==0)	//position of Numbers
			{
				System.out.println(a[j]);
			}
		}


	}

}

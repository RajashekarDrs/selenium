package Module4;

import java.util.Scanner;

//WAP to print Sum of array. by reading array values through Scanner class
public class Arrays_6program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array  size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)	//if i=5	4<5 to execute
		{
			a[i] = sc.nextInt();	//100,101,102,103
		}
		
		int sum=0;
		for(int j=size-1;j>=0;j--)
		{
				sum = sum+a[j];
		}
		System.out.println("sum of array is:" +sum);

	}

}

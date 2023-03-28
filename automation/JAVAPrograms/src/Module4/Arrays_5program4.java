package Module4;

import java.util.Scanner;

//WAP to Reverse an Integer array by reading the values through Scanner class
public class Arrays_5program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)		//if i=5	4<5 to execute
		{
			a[i] = sc.nextInt();	//100,101,102,103
		}
		for(int j=size-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}

package Module4;

import java.util.Scanner;

public class Arrays_9program9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		int count_e=0,count_o=0;
		for(int j=0;j<size;j++)
		{
			if(a[j]%2==0)
			count_e++;
			else
			count_o++;
		}
		System.out.println("count of even numbers :"+count_e);
		System.out.println("count of odd numbers :"+count_o);

	}

}

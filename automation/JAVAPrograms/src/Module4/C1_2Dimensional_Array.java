package Module4;

import java.util.Scanner;

/*
 -> it is represented as Rows and Colums in form of matrix.
 ->Syntax:
 	Arraytype arrayName[][] = new arraytype[rowSize][colSize];
 				int a[][] = new int[3][3]
 				
 				a[0][0] a[0][1] a[0][2]
 				a[1][0] a[1][1] a[1][2]
 				a[2][0] a[2][1] a[2][2]
 				
 				a[0][0]	= 10
 			 	a[0][1]	= 20
 			 	a[0][2]	= 30,,Store like it
 				a[1][0]
 				a[1][1]
 				a[1][2]
 				
 				or 
 				
 		we can store Directly the Elements,
 		int a[][] = {10,20,30},{40,50,60},{21,35,33};
 				
 */
public class C1_2Dimensional_Array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Row and Colum Size");
	int rowsize = sc.nextInt();
	int colsize = sc.nextInt();
	int a[][] = new int[rowsize][colsize];
	for(int i=0;i<rowsize;i++)
	{
		for(int j=0;j<colsize;j++)
		{
			a[i][j] = sc.nextInt();
		}
	}
	//printing
	for(int i=0;i<rowsize;i++)
	{
		for(int j=0;j<colsize;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
	}

}

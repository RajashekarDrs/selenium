package Module4;
import java.util.Scanner;
public class Arrays_4Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];	
		for(int i=0;i<size;i++)	//if i=5	4<5 to execute
		{
			a[i] = sc.nextInt();	//100,101,102,103
		}//printing
	for(int j=0;j<size;j++)
	{
		System.out.println(a[j]);
	}
	}
}

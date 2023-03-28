package Module4;
//WAP to sort the array in Assending Order???????????
public class Arrays_9program9_5 {

	public static void main(String[] args) {
		int a[] = {12,14,55,68,65,46};
		for(int i=0;i<a.length;i++)	//12
		{
			int temp;
			for(int j=0;j<a.length;j++)	//12
			{
				if(a[j]>a[j+1])		//12>14f
				{
					temp=a[j];		//temp=skip
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
			System.out.println(a[k]);

	}

}

package Module4;
//WAP to delete duplicate numbers from Array*****
public class Arrays_9program9_7 {

	public static void main(String[] args) {
	int a[] = {65,21,5,21,65,65,53};
	int b[] = new int[a.length],s=0;
	for(int i=0;i<a.length;i++)
	{
		int temp;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1]= temp;
			}
		}
	}
	for(int k=0;k<a.length-1;k++)
	{
		if(a[k]!=a[k+1])
		{
			b[s]=a[k];
			s++;
		}
	}
	b[s]=a[a.length-1];
	for(int l=0;l<=s;l++)
	{
		System.out.println(b[1]);
	}
	}

}

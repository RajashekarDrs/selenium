package Module4;
//WAP to print 2nd max&min and max&min???????????????
public class Arrays_9program9_6 {

	public static void main(String[] args) {
	int a[] = {15,64,78,21,35,69};
	for(int i=0;i<a.length;i++)
	{
		int temp;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("max number :"+a[a.length-1]);
	System.out.println("min number :"+a[a.length-a.length]);
	System.out.println("2ndmax :"+a[a.length-2]);
	System.out.println("2ndmin number :"+a[a.length-(a.length-1)]);
}
}

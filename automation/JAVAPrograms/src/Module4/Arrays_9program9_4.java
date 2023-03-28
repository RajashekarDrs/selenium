package Module4;
//WAP to print 2nd max number from array???????????
public class Arrays_9program9_4 {
	public static void main(String[] args) {
		int a[] = {22,41,11,54,56,48};
		int max=22,smax=22;
		//int a[]=a[0],smax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)	//a[1],a[2],a[3],,,41>22t,11>41f,54>41t
			{
				smax=max;	//smax=22; smax=41
				max=a[i];	//max=41;  max=54
			}
			else if(a[i]>smax) //11>22f
			{
				smax=a[i];	//skip
			}
		}
		System.out.println("max number is :"+max);
		System.out.println("2ndmax number is :"+smax);
	}

}

package Module4;
//WAP TO add 2D of two matrix [11 12,29 18] [19 58,31 22]
public class C2_2Dimnesion {

	public static void main(String[] args) {
		int a[][] = {{11,12},{29,18}};
		int b[][] = {{19,58},{31,22}};
		int c[][] = new int[a.length][b.length];
		for(int i=0;i<a.length;i++)	//11 
		{
			for(int j=0;j<a.length;j++)	//1
			{
				c[i][j] = a[i][j]+b[i][j];	//11+19=30
			}
		}
		for(int k=0;k<a.length;k++)	//for row-0
		{
			for(int l=0;l<a.length;l++)	//for colum-0
			{
				System.out.print(c[k][l]+" ");//i.e c[0][0], c[0][1] go to|
			}
			System.out.println();
		}
	}

}

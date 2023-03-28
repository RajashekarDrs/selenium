package Module4;

public class B2_CLA_program {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			int Cn = Integer.parseInt(args[i]);
			sum = sum+Cn;
		}
		System.out.println(sum);

	}//cmd : CLA 1000,2000,,,,,
}

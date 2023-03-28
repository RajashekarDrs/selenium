package Module2;
//WAP to print Online A/C details using Method Overloading
public class _3MethodOverloading {
	/*	=>Method overloading
	 	->The process of developing Multiple methods with same Name 
	 	  but different argument list is calle MethodOverloading.
	 	*/
	public static void payment(String wallettype,String UID)
	{
		System.out.println(wallettype+ " " +UID);
	}
	public static void payment(String cardtype,long cardno,int cvvno)
	{
		System.out.println(cardtype+ " " +cardno+ " " +cvvno);
	}
	public static void payment(String Banktype,String Uname,int pwd,long accno)
	{
		System.out.println(Banktype+" "+Uname+" "+pwd+" "+accno);
	}
	public static void main(String[] args) {
		//calling Method
		payment("PhonePay","sbi@901073.com");
		payment("Debit",2125453664,987);
		payment("Netbanking","Rajashekar",2211,2143625892);

	}

}

package Module3;
public class Gmail{
	private String username,pwd;
	public void setunam(String name)
	{
		this.uname=uname;
	}
	public void getuname()
	{
		if(uname=="rajashekar")
			return "email verification successfully completed";
		else
			return "account did not found";
	}
	public void setpwd(String pwd)
	{
		this.pwd = pwd;
	}
	public String getpwd()
	{
		if(pwd=="Raj9010@")
			return "password is verified successfully";
		else
			return "password is invalid";
	}
}
public class _7bEncapsulationProgram {

	public static void main(String[] args) {
		Gmail g = new Gmail();
		g.setunam("rajashekar");
		g.setpwd("Raj9010@");

	}

}

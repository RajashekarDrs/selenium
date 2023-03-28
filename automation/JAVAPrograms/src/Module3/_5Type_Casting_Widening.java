package Module3;
//(Type Casting)//Widening
public class _5Type_Casting_Widening {

	public static void main(String[] args) {
		short s = 30000;	// capacity +/- (32768)
		int   i = s;		//in capacity +/- (21 10digits)
		System.out.println(s+"\n"+i); 
	
	}//byte(127)=>short(32768)=>int(21 10didgit)=>long(+21 10digits)

}

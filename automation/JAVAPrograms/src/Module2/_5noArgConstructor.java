package Module2;

public class _5noArgConstructor {
		String name;
		public _5noArgConstructor(){
			name = "Rajashekar DRS";
		}
	public static void main(String[] args) {
		_5noArgConstructor n1 = new _5noArgConstructor();
		System.out.println(n1.name);
		_5noArgConstructor n2 = new _5noArgConstructor();
		System.out.println(n2.name);
	}
/* ->with no arg constructor one of the disadvantage is for every call we are getting same value
   ->there fore to over come this we go for constructor with args.
	*/
}

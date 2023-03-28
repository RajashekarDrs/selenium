package Module2;

public class _6ConstructorChaining {
/*->The process of calling one Constructor from another Constructor is called constructor chaining
  ->Constructor chaining can be achieved in two ways
      1, call to this
      2, call to super
   =>this():-
   	 ->the process of calling one Constructor from another constructor of same class is called CTT
   	 ->the main Rule for call this must be the First statement.
	 */
	public  _6ConstructorChaining(){
		this(1012);
		System.out.println("A Constructor without arg");
			}
	public _6ConstructorChaining(int i) {
		this("DRS");
		System.out.println("A constructor with arg");
			}
	public _6ConstructorChaining(String s) {
		System.out.println("A constructor with String type");
		}
	public static void main(String[] args) {
		_6ConstructorChaining A = new _6ConstructorChaining();
	}

}

public class Problem2i {
	public static void main( String[] args ) {
		Animal ani = new Tiger();
		((Tiger) ani).eat(5);
		ani.eat();
		((Tiger) ani).eat();
	}

}

public class Problem1i {
	public static void main(String[] args ) {
		Animal ani = new Tiger();
		//Tiger mam = new Animal("Mom");
		/*Required type:
		Tiger
		Provided:
		Animal

		*/
		Tiger mammi = new Tiger();
		Animal ani2 = (Animal) mammi;
		//ani.eat(5);
		mammi.eat(5);
	}

}

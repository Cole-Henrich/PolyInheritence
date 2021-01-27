public class Problem3i {
	public static void main(String[] args ) {
		Animal[] anis = { new Animal(), new Panda(), new Tiger() };
		Tiger mommy = new Tiger();
		//Panda p = (Panda) mommy; //Inconvertible types; cannot cast 'Tiger' to 'Panda'
		Tiger t = (Tiger)anis[1];
		t.eat(5);

	}

}

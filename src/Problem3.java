
public class Problem3 {
	public static Animal merge(Animal a, Animal b) {
		Animal ani = new Animal();
		ani.setName( a.getName() + b.getName());
		return ani;
	}
	
	public static void main( String[] args ) {
		Panda p = new Panda();
		System.out.println("----------");
		Tiger t = new Tiger();
		System.out.println("----------");
		Animal a = Problem3.merge(p, t);
		System.out.println("----------");
		System.out.println(a.getName());
	}
}

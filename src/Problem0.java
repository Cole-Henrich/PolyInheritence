
public class Problem0 {

	public static void main(String[] args ) {
		Panda p = new Panda("Lemming");
		System.out.println("----------");
		System.out.println(p.getName());
		System.out.println("----------");
		System.out.println(p.setName("Tiger"));
		System.out.println(p.getName() );
	}
}


public class Tiger extends Animal{

	private String name;
	public Tiger() {
		super("Tiger");
		this.name = "T-Mom";
		System.out.println("Tiger0");
	}
	public String getName() {
		System.out.println("Tiger: getName");
		return "Tiger: "+ super.getName();
	}
	public void eat( int pounds ) {
		System.out.println("Tiger: eat(int)");
	}

	public boolean setName(String name) {
		super.setName(name);
		this.name = name + " " + getName();
		System.out.println("Tiger: setName");
		return false;
	}
}

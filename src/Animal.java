
public class Animal {
	private String name;
	
	public Animal() {
		name = "Undefined";
		System.out.println("Animal0");
	}
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal1");
	}

	public void eat() {
		System.out.println("Animal: eat");
	}
	
	public String getName() {
		if (setName(name)) {
			System.out.println("Animal:");
			return name;
	}
		else {return "invalid";}
	}

	public boolean setName(String name) {
		System.out.println("Animal: setName");
		if( name != null ) {
			this.name = name;
			return true;
		}
		return false;
	}
	
	public String toString() {
		System.out.println("Animal: toString");
		return getName();
	}
}

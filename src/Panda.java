
public class Panda extends Animal{
//inheritance
	/*
	Family tree
	Taxonomy
	a class/object shares variables or methods

	happens at compile

	 */

	/*
	polymorphism
	where inher starts
	runtime
	 */
	/*

	 */
	public Panda() {
		super("Panda");
		System.out.println("Panda0");
	}
	
	public Panda(String name) {
		System.out.println("Panda1");
	}
	
	public String getName() {
		System.out.println("Panda: getName");
		return "Panda: "+ super.getName();
	}
	
	public String toString() {
		System.out.println("Panda: toString");
		return getName();
	}
}
/*
Composition
	Person
		Arm does not have similar properties to a person
		A person has an arm-composition
		Leg
		Engineer fix()
		Writer write()
	Car analogy
		Vehicle
			Attributes
				tire[] tires
				String model
			Inheritance
				Truck inherits vehicle
				SUV inherits vehicle
				car inherits vehicle

Polymorphism


 */
	/*Person p = new Teacher()
	Person q = new Student()
	Person s = new Person()


			p.getAge();
			 //compile? Yes
	 */
// from which class is the method run?
/*
compile look at var type
runtime object type
p is a person
compile: look in person class for getAge()
Person extends object implicit
runtime: look in teacher for getAge()
run in person;
p.work()
Person var
Check person at compile time
what class does work run from: Teacher
q.work() compile? no. why . At compile look at var person
q.getGPA() compile? no. Person has no getGPA() no runtime n/a
cast to a student (student)q.getGPA(); runs from student
parsing vs. casting.
(int) double is still a double at heart
cannot cast across


*/
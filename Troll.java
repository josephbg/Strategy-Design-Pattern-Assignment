//Brian Guthrie

public class Troll extends Character {
	
	//call super(name) because it is from parent class, set weapon behavior
	public Troll(String name) {
		super(name);
		weaponBehavior = new WeaponAxe();
	}
	
	//set display
	public void display() {
		System.out.println(name + " is a funny troll");
	}
}

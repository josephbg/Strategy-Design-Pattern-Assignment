//Brian Guthrie

public class Queen extends Character {
	
	//call super(name) because it is from parent class, set wapon behavior
	public Queen(String name) {
		super(name);
		weaponBehavior = new WeaponKnife();
	}
	
	//set display
	public void display() {
		System.out.println(name + " is a beautiful queen");
	}
}

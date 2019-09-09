//Brian Guthrie

//King is an extention of class Character
public class King extends Character {
	
	//call super(name) because it is from parent class, set wapon behavior
	public King(String name) {
		super(name);
		weaponBehavior = new WeaponSword();
	}
	
	//set display which is different for each character
	public void display() {
		System.out.println(name + " is a Noble King");
	}
}

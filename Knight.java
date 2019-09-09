//Brian Guthrie

public class Knight extends Character {
	
	//call super(name) because it is from parent class, set wapon behavior
	public Knight(String name) {
		super(name);
		weaponBehavior = new WeaponBow();
	}
	
	//set display 
	public void display() {
		System.out.println(name + " is a valiant knight");
	}
}
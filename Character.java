//Brian Guthrie

//make Character class abstract because every character is differnet
public abstract class Character {
	protected String name;
	WeaponBehavior weaponBehavior;
	
	//set character name as this.name to be able to call it in driver
	public Character(String name) {
		this.name = name;
	}
	
	//set attack as weaponBehavior.attack() because weapon behavior uses attack
	public void attack() {
		weaponBehavior.attack();
	}
	
	//make display abstract because every character has a different one
	public abstract void display();
	
	//be able to call a new instance of weapon behavior
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
}



public class Player {
	private int health;
	private int strength;
	private int skill;
	private String weapon;
	
	Player (int pick){
		if (pick == 1){
			health = 1500;
			strength = 8;
			skill = 10;
			weapon = "Club";
		} else if (pick == 2) {
			health = 1000;
			strength = 6;
			skill = 50;
			weapon = "Sword";
		} else if (pick == 3) {
			health =500;
			strength = 5;
			skill = 80;
			weapon = "Dagger";
		}
		
	}
	
	//GETTERS
	public int getHealth(){
		return(health);
	}
	public int getStrength(){
		return(strength);
	}
	public int getSkill(){
		return(skill);
	}
	public String getWeapon(){
		return(weapon);
	}
	
	//SETTERS
	public void setHealth(int i){
		health = i;
	}
	public void setStrength(int i){
		strength = i;
	}
	public void setDefense(int i){
		skill = i;
	}
	public void setWeapon(String s){
		weapon = s;
	}
	
}

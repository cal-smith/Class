public class Zergling extends Unit implements GroundAttack {
	public Zergling() {
		super(35, 0, 5);
	}
	
	public void upgradeGroundAttackDamage() { this.groundAttackDamage++; }
	
	public int getGroundAttackDamage() {return this.groundAttackDamage; }

	public String toString() {
		return super.toString().replaceAll("unit","Zergling");
	}
}
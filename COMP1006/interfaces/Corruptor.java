public class Corruptor extends Unit implements AirAttack {
	public Corruptor() {
		super(200, 12, 0);
	}
	
	public void upgradeAirAttackDamage() { this.airAttackDamage++; }
	
	public int getAirAttackDamage() {return this.airAttackDamage; }

	public String toString() {
		return super.toString().replaceAll("unit","Corruptor");
	}
}
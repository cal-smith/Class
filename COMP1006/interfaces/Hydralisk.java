public class Hydralisk extends Unit implements GroundAttack, AirAttack {
	private boolean speedUpgraded;
	
	public Hydralisk() {
		super(80, 12, 12);
		this.speedUpgraded = false;
	}

	public void upgradeAirAttackDamage() { this.airAttackDamage++; }
	public void upgradeGroundAttackDamage() { this.groundAttackDamage++; }
	
	public int getGroundAttackDamage() {return this.groundAttackDamage; }
	public int getAirAttackDamage() {return this.airAttackDamage; }


	public void upgradeSpeed() { this.speedUpgraded = true; }
	
	public String toString() {
		if(this.speedUpgraded) {
			return super.toString().replaceAll("unit", "fast Hydralisk");
		} else {
			return super.toString().replaceAll("unit", "slow Hydralisk");
		}
	}
}
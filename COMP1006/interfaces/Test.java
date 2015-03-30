public class Test {
	public static void main(String[] args) {
		Zergling z = new Zergling();
		Hydralisk h = new Hydralisk();
		Corruptor c = new Corruptor();

		z.upgradeGroundAttackDamage();
		h.upgradeGroundAttackDamage();
		h.upgradeAirAttackDamage();
		c.upgradeAirAttackDamage();
	}
}
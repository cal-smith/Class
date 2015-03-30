public abstract class Unit {
	private int health;
	private int maximumHealth;
	protected int airAttackDamage;
	protected int groundAttackDamage;

	public Unit(int m, int a, int g) {
		this.health = m;
		this.maximumHealth = m;
		this.airAttackDamage = a;
		this.groundAttackDamage = g;
	}

	public int getHealth() { return this.health; }
	public int getMaximumHealth() { return this.maximumHealth; }

	public void setHealth(int h) { this.health = h; }

	public String toString() {
		return "A unit with " + this.health + "/" + this.maximumHealth + " health";
	}

	public boolean equals(Object o) {
		if(o instanceof Unit) {
			Unit u = (Unit)o;
			return this.health == u.health
				&& this.maximumHealth == u.maximumHealth
				&& this.airAttackDamage == u.airAttackDamage
				&& this.groundAttackDamage == u.groundAttackDamage;
		} else {
			return false;
		}
	}
}
public class LegoMinifigure {
	String name;
	LegoHat hat;
	LegoItem left;
	LegoItem right;

	public LegoMinifigure(String n, LegoHat h, LegoItem l, LegoItem r) {
		this.name = n;
		this.hat = h;
		this.left = l;
		this.right = r;
	}

	public String toString() {
		String description = "A minifig named " + this.name;
		if (this.hat != null || this.left != null || this.right != null) {
			description += " who is";
		}
		if (this.hat != null) {
			description += " wearing " + this.hat;
		}
		if (this.left != null || this.right != null) {
			if (this.hat != null) description += ",";
			if(this.right == null) description += " and";
			description += " holding ";
		}
		if (this.left != null) {
			description += this.left + " in his left hand";
			if (this.right != null) description += " and ";
		}
		if (this.right != null) {
			description += this.right + " in his right hand";
		}
		return description;
	}

	public void swapHands() {
		LegoItem temp = this.left;
		this.left = this.right;
		this.right = temp;
	}

	public void wearHat(LegoHat hat) {
		this.hat = hat;
	}

	public void placeInLeftHand(LegoItem item) {
		this.left = item;
	}

	public void placeInRightHand(LegoItem item) {
		this.right = item;
	}

	public boolean isGood(String season, float threshold) {
		if(this.hat == null) return false;
		if (this.hat.computeStyle(season) >= 6) {
		 	if ((this.left == null || !this.left.isHeavy(threshold)) && (this.right == null || !this.right.isHeavy(threshold))){
				return true;
			}
		}
		return false;
	}
}
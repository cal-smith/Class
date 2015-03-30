public class LegoItem {
	String name;
	float weight;

	public LegoItem(String n, float w) {
		this.name = n;
		this.weight = w;
	}

	public String toString() {
		return "a " + this.weight + "-gram " + this.name;
	}

	public boolean isHeavy(float threshold) {
		return weight > threshold? true:false;
	}
}
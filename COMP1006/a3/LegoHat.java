public class LegoHat {
	String style;
	String size;

	public LegoHat(String style, String size) {
		this.style = style;
		this.size = size;
	}

	public String toString() {
		return "a " + this.size + " " + this.style;
	}

	public int computeStyle(String season) {
		if (season.equals("summer") && this.style.equals("toque")) {
			return 0;
		}

		if (season.equals("winter") && this.style.equals("sun visor")) {
			return 0;
		}
		//magically arbitrary style computation
		int style = 0;
		if (season.equals("winter")) style += 1;
		if (season.equals("summer")) style += 3;
		if (season.equals("fall")) style += 2;
		if (season.equals("spring")) style += 2;
		if (this.size.equals("medium")) style += 5;
		if (this.size.equals("small")) style += 3;
		if (this.size.equals("huge")) style += 4;
		return style;
	}
}
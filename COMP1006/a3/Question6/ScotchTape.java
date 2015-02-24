public class ScotchTape {
	String colour;
	float weight;
	float length;

	public ScotchTape(String c, float w, float l){
		this.colour = c;
		this.weight = w;
		this.length = l;
	}

	public static void printTapeArray(ScotchTape tapeArray[]) {
		for (int i = 0; i < tapeArray.length; i++) {
			System.out.println(tapeArray[i]);
		}
	}

	public void stickTape(float percetToUse)	{
		this.weight -= this.weight * percetToUse;
		this.length -= this.length * percetToUse;
	}

	public String toString() {
		return this.colour + " (" + this.length + " cm, " + this.weight + " oz)";
	}

	public static void main(String[] args) {
		ScotchTape tapes[] = new ScotchTape[3];
		tapes[0] = new ScotchTape("clear", 3, 22);
		tapes[1] = new ScotchTape("green", 1, 15);
		tapes[2] = new ScotchTape("blue", 2, 19);
		ScotchTape.printTapeArray(tapes);
		System.out.println();//because linebreaks
		tapes[0].stickTape(0.5f);
		tapes[1].stickTape(0.3f);
		tapes[2].stickTape(0.9f);
		ScotchTape.printTapeArray(tapes);
	}
}
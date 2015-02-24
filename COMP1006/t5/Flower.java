public class Flower {
	String color;
	int height;
	float percentWater;
	public Flower(String color, int height, float percentWater){
		this.color = color;
		this.height = height;
		this.percentWater = percentWater;
	}
	public void print(){
		System.out.println(this.color + " (" + this.height + " cm, " + this.percentWater + "% water)");
	}

	public void grow(){
		this.height += 2;
		this.percentWater -= 0.05f;
	}

	public void water(){
		this.percentWater += 0.1f;
	}
}
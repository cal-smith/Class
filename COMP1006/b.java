public class b {
	int x;
	int y;

	public b(){
		this.x = 0;
		this.y = 0;
	}

	public b(int x, int y){
		this.x = x;
		this.y = y;
	}

	public b movex(int amount){
		this.x += amount;
		return this;
	}

	public void print(){
		System.out.println(this.x + " " + this.y);
	}

	public boolean equals(b other){
		if (this.x == other.x && this.y == other.y) {
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		b b = new b(10, 10);
		b b2 = new b(10, 10);
		System.out.println(b.equals(b2));
		//b.print();
		//b2.movex(5).print();
	}
}
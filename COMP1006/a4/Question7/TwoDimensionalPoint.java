public class TwoDimensionalPoint {
	private float x;
	private float y;
	private TwoDimensionalPoint next;

	public TwoDimensionalPoint (float x, float y, TwoDimensionalPoint n) {
		this.x = x;
		this.y = y;
		this.next = n;
	}

	public TwoDimensionalPoint (float x, float y) {
		this(x, y, null);
	}

	public void printPoint() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}

	public float getX() { return this.x; }
	public float getY() { return this.y; }
	public TwoDimensionalPoint getNext() { return this.next; }
	public void setX(float x) { this.x = x; }
	public void setY(float y) { this.y = y; }
	public void setNext(TwoDimensionalPoint n) { this.next = n; }
}
public class Polygon {
	private TwoDimensionalPoint root;
	
	public Polygon (TwoDimensionalPoint r) {
		this.root = r;
	}

	public void addPoint(TwoDimensionalPoint p) {
		TwoDimensionalPoint current = this.root;
		while (current.getNext() != null && current.getNext() != this.root) {
			current = current.getNext();
		}
		current.setNext(p);
		p.setNext(this.root);
	}

	public TwoDimensionalPoint removePoint(TwoDimensionalPoint p) {
		if (this.root == p) {
			TwoDimensionalPoint current = this.root;
			while (current.getNext() != null && current.getNext() != this.root) {
				current = current.getNext();
			}
			current.setNext(this.root.getNext());
			this.root = this.root.getNext();
			return this.root.getNext();
		} else {
			TwoDimensionalPoint current = this.root;
			while (current.getNext() != null && current.getNext() != p) {
				current = current.getNext();
			}
			if (current.getNext() != null) {
				current.setNext(current.getNext().getNext());
			}
			return this.root;
		}
	}

	public TwoDimensionalPoint lowestPoint() {
		TwoDimensionalPoint lowest = this.root;
		TwoDimensionalPoint current = this.root;
		boolean done = false;
		while (current.getNext() != null && !done) {
			if (current.getY() < lowest.getY()) {
				lowest = current;
			}
			current = current.getNext();
			if (current == this.root) {
				done = true;
			}
		}
		return lowest;
	}

	public float perimeter() {
		float perimeter = 0.0f;
		TwoDimensionalPoint current = this.root;
		boolean done = false;
		while (current.getNext() != null && !done) {
			float dx = current.getX() - current.getNext().getX();
			float dy = current.getY() - current.getNext().getY();
			perimeter += Math.sqrt(dx*dx + dy*dy);
			current = current.getNext();
			if (current == this.root) {
				done = true;
			}
		}
		return perimeter;
	}

	public void print(){
		TwoDimensionalPoint current = this.root;
		boolean done = false;
		while (current.getNext() != null && !done) {
			current.printPoint();
			current = current.getNext();
			if (current == this.root) {
				done = true;
			}
		}
	}
}
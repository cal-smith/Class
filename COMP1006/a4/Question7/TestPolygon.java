public class TestPolygon {
	public static void main(String[] args) {
		TwoDimensionalPoint p1 = new TwoDimensionalPoint(0.0f, 1.0f);
		TwoDimensionalPoint p2 = new TwoDimensionalPoint(1.0f, 0.0f);
		TwoDimensionalPoint p3 = new TwoDimensionalPoint(0.0f, -1.0f);
		TwoDimensionalPoint p4 = new TwoDimensionalPoint(-1.0f, 0.0f);
		Polygon p = new Polygon(p1);

		p.addPoint(p2);
		p.addPoint(p3);
		p.addPoint(p4);
		System.out.println("Initial Polygon:");
		p.print();
		System.out.println("Lowest point:");
		p.lowestPoint().printPoint();
		System.out.println("Perimeter: ");
		System.out.println(p.perimeter());

		System.out.println();
		
		p.removePoint(p2);
		System.out.println("Polygon after removing p2:");
		p.print();
		System.out.println("Lowest point:");
		p.lowestPoint().printPoint();
		System.out.println("Perimeter: ");
		System.out.println(p.perimeter());
	}	
}
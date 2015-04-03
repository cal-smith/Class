import processing.core.PApplet;

public class Doom extends PApplet {
	int px;
	int py;
	int x1 = 250;
	int y1 = 150;
	int x2 = 250;
	int y2 = 250;
	float angle = 0;
	int x = 200;
	int y = 200;

	public void setup(){
		px = 200;
		py = 200;
		x = 200;
		y = 200;
		size(400,400);
	}

	public void draw(){
		if (keyPressed) {
			if (key == 'a') {
				py--;
			}
			if (key == 'd') {
				py++;
			}
			if (key == 'w') {
				px++;
			}
			if (key == 's') {
				px--;
			}
			if (key == 'q') {
				angle -= 0.1;
			}
			if (key == 'e') {
				angle -= 0.1;
			}
		}

		background(0,0,0);
		
		line(x, y, x, y+5);

		float tx1 = x1 - px;
		float tx2 = x2 - px;
		float ty1 = y1 - py;
		float ty2 = y2 - py;
		
		float tz1 = tx1 * (float)Math.cos(angle) + ty1 * (float)Math.sin(angle);
		float tz2 = tx2 * (float)Math.cos(angle) + ty2 * (float)Math.sin(angle);
		tx1 = tx1 * (float)Math.sin(angle) - ty1 * (float)Math.cos(angle);
		tx2 = tx2 * (float)Math.sin(angle) - ty2 * (float)Math.cos(angle);
		float xs1 = 60 / tz1;
		float xs2 = 60 / tz2;
		float ys1 = 60 / tz1;
		float ys2 = 60 / tz2;
		float fx1 = 400/2 - tx1 * xs1;
		float fx2 = 400/2 - tx2 * xs2;
		float fy1 = 400/2 - tz1 * ys1;
		float fy2 = 400/2 - tz2 * ys2;
		//System.out.println(" tx1: " + tx1 + " ty1: " + ty1 + " tz1: " + tz1);
		//System.out.println(" tx2: " + tx2 + " ty2: " + ty2 + " tz2: " + tz2 + "\n");
		System.out.println(fx1 + " " + fx2 +" y: "+ fy1 +" "+ fy2);
		line(fx1, fy1, fx2, fy2);
		line(fx1, fy1+50, fx2, fy2+50);
		stroke(255);
	}

	public static void main(String[] args) {
		PApplet.main(Doom.class.getCanonicalName());
	}
}
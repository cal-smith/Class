import processing.core.PApplet;

public class Doom extends PApplet {
	int px;
	int py;
	int x1 = 100;
	int y1 = 10;
	int x2 = 100;
	int y2 = 100;
	float angle = 0;
	int x = 200;
	int y = 200;
	int h = 400;
	int w = 400;
	float vw = 0.73f*400;
	float vh = 0.2f*400;

	//private static float min(float a, float b) { return a < b ? a : b; }
	//private static float max(float a, float b) { return a > b ? a : b; }
	private float clamp(float a, float mi, float ma) { return min(max(a, mi), ma); }
	private float vxp(float x0, float y0, float x1, float y1) { return (x0 * y1) - (x1 * y0); }
	private float intersectx(float x1, float y1,  float x2, float y2,  float x3, float y3,  float x4, float y4){
		return vxp(vxp(x1,y1, x2,y2), (x1-x2), vxp(x3,y3, x4,y4), (x3-x4)) / vxp(x1 - x2, y1 - y2, x3 - x4, y3 - y4);
	}
	private float intersecty(float x1, float y1,  float x2, float y2,  float x3, float y3,  float x4, float y4){
		return vxp(vxp(x1,y1, x2,y2), (y1-y2), vxp(x3,y3, x4,y4), (y3-y4)) / vxp(x1 - x2, y1 - y2, x3 - x4, y3 - y4);
	}
	private void vline(int x, float y1, float y2){
		y1 = clamp(y1, 0, h-1);
		y2 = clamp(y2, 0, h-1);
		line(x, y1, x, y2);

	}

	public void setup(){
		px = 200;
		py = 200;
		x = 200;
		y = 200;
		size(h,w);
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

		//vertex points		
		float vx1 = x1 - px;
		float vx2 = x2 - px;
		float vy1 = y1 - py;
		float vy2 = y2 - py;
		
		//transformation of the points around the player
		float tz1 = vx1 * (float)Math.cos(angle) + vy1 * (float)Math.sin(angle);
		float tz2 = vx2 * (float)Math.cos(angle) + vy2 * (float)Math.sin(angle);
		float tx1 = vx1 * (float)Math.sin(angle) - vy1 * (float)Math.cos(angle);
		float tx2 = vx2 * (float)Math.sin(angle) - vy2 * (float)Math.cos(angle);
		
		//TODO:intersections
		//float interx = intersectx()
		//float intery = intersecty() 

		//perspective transforms
		float xscale1 = vw / tz1;
		float xscale2 = vw / tz2;
		float yscale1 = vh / tz1;
		float yscale2 = vh / tz2;
		float local_x1 = w/2 - (tx1 * xscale1);
		float local_x2 = w/2 - (tx2 * xscale2);

		//heights to screen-coords
		float y1a = h/2 - ((50 + tz1) * yscale1);
		float y1b = h/2 - ((200 + tz1) * yscale1);
		float y2a = h/2 - ((50 + tz2) * yscale2);
		float y2b = h/2 - ((200 + tz2) * yscale2);
		for (int x = 0; x <= 400 ; x++) {
			float ya = (x - local_x1) * (y2a - y1a) / (local_x2 - local_x1) + y1a;
			float yb = (x - local_x1) * (y2b - y1b) / (local_x2 - local_x1) + y1b;
			//System.out.println(ya);
			vline(x, ya, yb);
		}
		//line(fx1, fy1+50, fx2, fy2+50);
		stroke(255);
	}

	public static void main(String[] args) {
		PApplet.main(Doom.class.getCanonicalName());
	}
}
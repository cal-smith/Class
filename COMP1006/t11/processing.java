import processing.core.*;

public class processing extends PApplet {
	PImage img;
	int x;
	int y;
	public void setup(){
		img = loadImage("jpg.jpg");
		x = img.width*2;
		y = img.height*2;
		size(x,y);
		//blendMode(DIFFERENCE);
	}

	public void draw(){
		int p1x = (int)Math.floor(noise(x));
		int p1y = (int)Math.floor(noise(y));
		int p2x = (int)Math.floor(noise(x));
		int p2y = (int)Math.floor(noise(y));
		img.copy(p1x, p1y, x, y, p2y, p2x, x, y);
		image(img, 0, 0, x, y);
	}

	public static void main(String[] args) {
		PApplet.main(processing.class.getCanonicalName());
	}
}
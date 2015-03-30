import processing.core.PApplet;

public class Ex extends PApplet {
	int boxX;
	int boxY;
	int boxWidth;
	int boxHeight;
	int boxSpeed;
	public void setup() {
		size(500,500);
		rectMode(CENTER);
		boxX = width/2;
		boxY = height/2;
		boxWidth = 30;
		boxHeight = 40;
		boxSpeed = 5;
	}

	public void draw() {
		background(255,255,255);
    
		boxX += boxSpeed;
		if(boxX > width-boxWidth/2-1 || boxX < boxWidth/2) {
			boxSpeed = -boxSpeed;
		}

		rect(boxX, boxY, boxWidth, boxHeight);
	}

	public static void main(String[] args) {
		PApplet.main(Ex.class.getCanonicalName());
	}
}
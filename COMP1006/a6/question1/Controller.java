import processing.core.*;

public class Controller extends PApplet {
	private Model model;
	private View view;
	public int width = 500;
	public int height = 500;

	public void setup(){
		size(this.width, this.height);
		this.model = new Model();
		this.view = new View(this.model, this);
	}

	public void draw(){
		this.model.move();
		this.view.draw();

	}

	public void mouseClicked(){
		this.model.react();
	}

	public static void main(String[] args) {
		PApplet.main(Controller.class.getCanonicalName());
	}
}
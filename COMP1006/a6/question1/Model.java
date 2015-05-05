import java.util.ArrayList;

public class Model {
	private ArrayList<Space> space;
	/*
	So yes, this whole thing has little to do with space
	but dammit, I'm not renaming all these classes.
	Perhaps it's space on drugs?
	*/
	public Model(){
		this.space = new ArrayList<Space>();
		this.space.add(new BlackHole(50, 1f));
		for (int i = 0; i < 50; i++) {
			this.space.add(new Star(20, 1f, (float)Math.random()*500f, (float)Math.random()*500f));
		}
		for (int i = 0; i < 10; i++){
			this.space.add(new Comet(10, 2f, 250f, (float)Math.random()*500f));
		}
	}

	public void move(){
		for (Space s : this.space) {
			s.move();
		}
	}

	public void react(){
		for (Space s : this.space) {
			s.react();
		}
	}

	public ArrayList<Space> getSpace() {
		return this.space;
	}
}
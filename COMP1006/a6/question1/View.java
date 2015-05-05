public class View {
	private Model model;
	private Controller controller;
	public View(Model m, Controller c){
		this.model = m;
		this.controller = c;
	}

	public void draw(){
		this.controller.background(0,0,0);
		for (Space s : this.model.getSpace()) {
			this.controller.fill(s.getR(), s.getG(), s.getB());
			this.controller.arc(s.getX(), s.getY(), s.getSize(), s.getSize(), 0, 2*this.controller.PI);
			if (s.getY() + s.getSize()/2 > this.controller.width) {
				s.setMoveY(false);
			} else if(s.getY() < s.getSize()/2){
				s.setMoveY(true);
			}
			if (s.getX() + s.getSize()/2 > this.controller.width) {
				s.setMoveX(false);
			} else if(s.getX() < s.getSize()/2){
				s.setMoveX(true);
			}
		}
	}
}
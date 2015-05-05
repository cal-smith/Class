public class BlackHole extends Space {
	public BlackHole(int size, float speed){
		//*black hole noises*
		//do black holes even make noise?
		//guess not cause it's in a vacuum and whatnot.
		super(size, speed, 200, 200);
		this.moveX = false;
	}

	public void move(){
		this.x += this.moveX?this.speed:-this.speed;
		this.y += this.moveY?this.speed:-this.speed;
	}

	public void react(){
		if (this.size*2 > 200) {
			this.size = this.size/2;
		} else {
			this.size = this.size*2;
		}
	}
}
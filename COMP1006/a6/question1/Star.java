public class Star extends Space {
	public Star(int size, float speed, float x, float y){
		super(size, speed, x, y);
	}

	public void move(){
		this.y += this.moveY?this.speed:-this.speed;
	}

	public void react(){
		this.r = 255;
		this.g = (int)Math.floor(Math.random()*255);
		this.b = 30;
	}
}
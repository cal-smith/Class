public class Comet extends Space {
	private boolean react;
	private boolean expanding;
	private int orignial_size;
	public Comet(int size, float speed, float x, float y){
		super(size, speed, x, y);
		this.orignial_size = size;
		this.moveX = this.randBool();
		this.react = false;
		this.expanding = true;
	}

	public void move(){
		if (this.react) {
			this.x += this.moveX?1:-1;
			this.y -= this.moveY?-1:1;
			this.r = 100;
			this.g = (int)Math.floor(Math.random()*255);
			this.b = (int)Math.floor(Math.random()*255);
			if (this.size > 30) {
				this.expanding = false;
			}
			if (this.size < this.orignial_size) {
				this.expanding = true;
			}
			this.size += this.expanding?1:-1;
		} else {
			this.x += this.moveX?this.speed:-this.speed;
			this.r = 255;
			this.g = 255;
			this.b = 255;
			if (this.size >= this.orignial_size) {
				this.size--;
			}
		}
	}

	public void react(){
		this.react = !this.react;
		this.moveX = this.randBool();
		this.moveY = this.randBool();
	}
}
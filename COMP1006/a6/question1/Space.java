public abstract class Space {
	protected int size;
	protected float speed;
	protected float x;
	protected float y;
	protected int r;
	protected int g;
	protected int b;
	protected boolean moveX;
	protected boolean moveY;
	public Space(int size, float speed, float x, float y){
		this.size = size;
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.r = 255;
		this.g = 255;
		this.b = 255;
		this.moveX = true;
		this.moveY = true;
	}
	public abstract void move();
	public abstract void react();

	protected boolean randBool(){
		return Math.floor(Math.random() * 2) == 0;
	}

	public float getX(){ return this.x; }
	public float getY(){ return this.y; }
	public int getSize(){ return this.size; }
	public int getR(){ return this.r; }
	public int getG(){ return this.g; }
	public int getB(){ return this.b; }
	public void setMoveX(boolean m) { this.moveX = m; }
	public void setMoveY(boolean m) { this.moveY = m; }
}
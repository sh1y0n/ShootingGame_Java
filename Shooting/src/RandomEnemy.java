
public class RandomEnemy extends Enemy
{
	public RandomEnemy (double x, double y,double vx,double vy)
	{
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
		f.setColor(0,125,0);
		f.fillRect(x, y,10,10);
		f.setColor(0,125,0);
		f.fillRect(x-10,y-20,10,20);
		f.setColor(0,125,0);
		f.fillRect(x+10,y-20,10,20);
	}
	public void move() 
	{
		super.move();
		vx=Math.random()*4-2;
	}
}
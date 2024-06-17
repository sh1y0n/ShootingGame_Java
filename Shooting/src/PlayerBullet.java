
public class PlayerBullet extends Character {
	public void  draw (MyFrame PlayerBullet) {
		PlayerBullet.setColor(0,128,0);
		PlayerBullet.fillRect(x+10, y, 10, 10);
	
	}
public PlayerBullet (double x,double y,double vx, double vy ) {
	super(x,y,vx,vy);
	
}

}

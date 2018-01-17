import java.util.ArrayList;

public class Spirale extends Trajectoire{
	private int fenX;
	private int fenY;
	private int x;
	private int y;
	private int xs;
	private int ys;
	private double r;
	
	public Spirale(int x, int y){
		super();
		this.x = x;
		this.y = y;
		traj=new ArrayList<Point>();
	}
	
	public void ajouterPoints(){
		xs = x;
		ys = y;
		double theta = 0;		//l`angle en degres
		double angle;			// l`angle en rad
		double a = 0.5;			// on choisit la constante en relation avec distance
								//entre deux points sur la meme ligne droite
		double v = 0.01;		// constante de vitesse de changement de l`angle
		while ((xs > 0 && xs < fenX) && (ys > 0 && ys < fenY)){
			angle = (theta*v)*2*Math.PI;			
			xs = (int)Math.round(x + Math.cos(angle)*r);
			ys = (int)Math.round(y + Math.sin(angle)*r);
			traj.add(new Point(xs,ys));
			r = theta*a;				// on choisit la distance entre deux points sur la meme ligne droite
			theta += 1;
		}
			
		int last = traj.size()-1;
		traj.remove(last);         // enlever dernier point de la trajectoire
	}
	
	public void setX(int n){
		fenX = n;
	}
	
	public void setY(int n){
		fenY = n;
	}
	
}

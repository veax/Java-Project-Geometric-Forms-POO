import java.awt.Color;
import java.awt.Graphics;

public class Ellipse implements Forme{
	private int rayh;			// rayon horizontale
	private int rayv;			// rayon verticale
	private Color coul;
	private int x;
	private int y;
	
	public Ellipse(int rh,int rv, Color c){
		rayh = rh;
		rayv = rv;
		coul = c;
	}
	
	public void dessiner(Graphics g) {
        g.setColor(coul);
        g.drawOval(x,y,rayh*2,rayv*2);
	}
	
	public void ancrer(Point p){
		this.x = p.getAbs() - rayh;
		this.y = p.getOrd() - rayv;
	}
}

import java.awt.Color;
import java.awt.Graphics;

public class Point implements Forme{
	private int x;		// abcisse
	private int y;		// ordonnée
	private Color coul;	// couleur

	public Point(int x, int y, Color coul) {	// constructeur pour les points visibles qui suivent la trajectoire
		this.x = x;
		this.y = y;
		this.coul = coul;
	}
	
	public Point(int x, int y){		// constructeur pour simplement des points de la trajectoire qui sont stocke dans ArrayList
		this.x = x;
		this.y = y;
	}

	// Méthode de dessin dans un objet graphique g
	public void dessiner(Graphics g) {	//implementation de dessiner
        g.setColor(coul);
        g.drawOval(x,y,1,1);
	}
	
	public int getAbs(){
		return x;
	}
	
	public int getOrd(){
		return y;
	}
	public void ancrer(Point p){	//implementation de l`ancrage
		this.x = p.getAbs();
		this.y = p.getOrd();
	}
	
}

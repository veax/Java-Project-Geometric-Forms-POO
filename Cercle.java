import java.awt.Color;
import java.awt.Graphics;

public class Cercle implements Forme {
	private int x;		// abcisse
	private int y;		// ordonnée
	private int r;      // rayon
	private Color coul;	// couleur

	public Cercle(int r, Color coul) {
		this.r = r;
		this.coul = coul;
	}
	
	// Méthode de dessin dans un objet graphique g
	public void dessiner(Graphics g) {
        g.setColor(coul);
        g.drawOval(x,y,r,r);		// comme on a r,r - c`est la forme partuculiere d`un oval - un cercle
	}
	
	public void ancrer(Point p){		// ancrage du cercle sur le point
		this.x = p.getAbs() - r/2;		
		this.y = p.getOrd() - r/2;
	}
		
}

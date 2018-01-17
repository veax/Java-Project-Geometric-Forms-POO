import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Forme {
	private int x;		// abcisse
	private int y;		// ordonnée
	private int width;  // largeur
	private int height;	// hauteur
	private Color coul;	// couleur
	
	public Rectangle(int width, int height, Color coul) {
		this.width = width;
		this.height = height;
		this.coul = coul;
	}
	
	public void dessiner(Graphics g) {
        g.setColor(coul);
        g.drawRect(x,y,width,height);
	}
	
	public void ancrer(Point p){
		this.x = p.getAbs();
		this.y = p.getOrd();
	}
}

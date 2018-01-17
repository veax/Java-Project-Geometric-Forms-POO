import java.awt.Color;

public class AppliDessin {

	// effectuer une pause d'une certaine durée en millisecondes
	static void Pause(int millisecondes) {
		try {
			Thread.sleep(millisecondes);
		}
		catch(Exception e) {}
	}

	
		// ---------------------PROGRAMME PRINCIPAL------------------------
	public static void main(String[] args) {
		
		// CONSTRUCTION DE LA FENETRE
		Fenetre fen = new Fenetre("window",400,400);
		//int fenx = fen.getX();	!on a besoin de fenx et feny pour le cas d`un spirale d`Archimede
		//int feny = fen.getY();
	
		
		//  --------------- CREATION DES OBJETS ET LE DEPLACEMENT: ----------------------
		
		
		// 1.
		// Deplacer un cercle rouge de rayon 10 sur une trajectoire horizontale entre les points
		//(100, 100) et (300, 100) 
		
		/*
		Cercle c = new Cercle(10, Color.RED);         // object cercle rouge de rayon 10
		TrajectoireHorizontale t = new TrajectoireHorizontale(new Point(100,100), new Point(200,100));  // objet - nouveau trajectoire																							// horizontale
		int nb_points = t.getSize();			// obtenir le nombre de points dans la trajectoire
		for (int i = 0; i < nb_points; ++i){
			Point courant = t.getPoint(i);          // obtenir i-eme point de la trajectoire
			c.ancrer(courant);                      // ancrer la forme a un point courant
			fen.dessiner(c);						// dessiner la forme
			fen.dessiner(new Point(courant.getAbs(),courant.getOrd(),Color.WHITE));
			Pause(30);
		}
		*/
		
		// 2.
		//Deplacer un rectangle bleu de largeur 30 et de hauteur 20 sur une trajectoire circulaire
		//de centre (200, 100) et de rayon 50
		
		
		Rectangle rect = new Rectangle(30,20, Color.BLUE);
		TrajectoireCirculaire t = new TrajectoireCirculaire(200,100,50);
		int nb_points = t.getSize();
		for (int i = 0; i < nb_points; ++i){
			Point courant = t.getPoint(i);          // obtenir i-eme point de la trajectoire
			rect.ancrer(courant);                      // ancrer la forme a un point courant
			fen.dessiner(rect);						// dessiner la forme
			fen.dessiner(new Point(courant.getAbs(),courant.getOrd(),Color.WHITE));
			Pause(30);
		}
				
		//3.
		//Deplacer une ellipse verte de rayon horizontal 20 et de rayon vertical 10 sur une spirale
		//d’Archimede
		
		/*
		Ellipse e = new Ellipse(20,10,Color.GREEN);
		Spirale s = new Spirale(200,200);
		s.setX(fenx);						// on passe les coordonnees de fenetre à l`exemplaire d`un classe Spirale
		s.setY(feny);
		s.ajouterPoints();					// on ajoute la liste des points
		int nbp = s.getSize();
		for (int i = 0; i < nbp; ++i){
			Point courant = s.getPoint(i);          // obtenir i-eme point de la trajectoire
			e.ancrer(courant);                      // ancrer la forme a un point courant
			fen.dessiner(e);						// dessiner la forme
			fen.dessiner(new Point(courant.getAbs(),courant.getOrd(),Color.WHITE));
			Pause(50);
		}
		*/
		
		
	}
}

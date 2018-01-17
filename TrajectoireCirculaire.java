import java.util.ArrayList;
public class TrajectoireCirculaire extends Trajectoire {
	private int nb_points;
	private double circonference;
	
	public TrajectoireCirculaire(int x, int y, int r){
		super();
		circonference = 2*Math.PI*r;
		nb_points = (int) Math.round(circonference);   //nb points depend du rayon saisi
		traj = new ArrayList<Point>();
		for (int i = 0; i <= nb_points; i=i+2){			// pas de 2 
			double ic = i;							   // pour la division flottante
			double theta = (ic/nb_points)*2*Math.PI;
			int xc = (int)Math.round(x + Math.cos(theta)*r);
			int yc = (int)Math.round(y + Math.sin(theta)*r);
			traj.add(new Point(xc,yc));
		}
	}
}

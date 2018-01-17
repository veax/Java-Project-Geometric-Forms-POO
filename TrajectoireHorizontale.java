import java.util.ArrayList;

public class TrajectoireHorizontale extends Trajectoire {
	private int nb_points;
	
	public TrajectoireHorizontale(Point P1, Point P2){
		super();
		nb_points = P2.getAbs() - P1.getAbs(); //nombre de points dans notre trajectoire horizontale
		traj=new ArrayList<Point>();;
		for (int i = 0; i <= nb_points; i=i+2){
			traj.add(new Point(P1.getAbs()+i,P1.getOrd()));
		}
	}
}

import java.util.ArrayList;
public class TrajectoireVerticale extends Trajectoire{
	private int nb_points;
	
	public TrajectoireVerticale(Point P1, Point P2){
		super();
		nb_points = P2.getOrd() - P1.getOrd(); 		//nombre de points dans notre trajectoire verticale
		traj = new ArrayList<Point>();
		for (int i = 0; i <= nb_points; i=i+2){
			traj.add(new Point(P1.getAbs(),P1.getOrd()+ i));
		}
	}
}

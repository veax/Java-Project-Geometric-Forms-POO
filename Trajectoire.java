import java.util.ArrayList;

public class Trajectoire {
	protected ArrayList<Point> traj;        //trajectoire: liste des points
	
	public Trajectoire(){
		traj = new ArrayList<Point>();
	}
	
	public int getSize(){
		return traj.size();
	}
	public Point getPoint(int i){
		return traj.get(i);
	}

}

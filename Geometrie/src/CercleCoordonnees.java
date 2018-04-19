import java.awt.Graphics;

public class CercleCoordonnees extends CercleAbstrait{
	private Object coord[];

	public CercleCoordonnees(String myName, PointAbstrait myCentre, double myRayon) {
		super(myName);
		coord[0] = myCentre;
		coord[1] = myRayon;
	}

	public Object[] coord() {
		return coord;
	}
	
	public void tracer(Graphics g) {
		
	}

}

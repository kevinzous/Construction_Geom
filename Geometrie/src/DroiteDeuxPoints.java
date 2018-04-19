import java.awt.Graphics;

public class DroiteDeuxPoints extends DroiteAbstraite{
	private PointAbstrait point1 ;
	private PointAbstrait point2;

	public DroiteDeuxPoints(String myName, PointAbstrait myPoint1, PointAbstrait myPoint2) {
		super(myName);
		point1 = myPoint1;
		point2 = myPoint2;
	}
	
	public double[] coord() {
		double[] tab = new double[2];
		// a= (y2-y1)/(x2-x1) 
		// b = y1 - x1*(y2-y1)/(x2-x1)	
		tab[0] = (point2.coord()[1]-point1.coord()[1])/(point2.coord()[0]-point1.coord()[0]);
		tab[1] = point1.coord()[1] - point1.coord()[0]*tab[0];
		return tab;
	}
	
	
	public void tracer(Graphics g) {
		
	}

}

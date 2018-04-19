import java.awt.Graphics;

public class DroitePerpendiculaire extends DroiteAbstraite {
	private DroiteAbstraite droite;
	private PointAbstrait point;
	
	public DroitePerpendiculaire(String myName, DroiteAbstraite myDroite, PointAbstrait myPoint) {
		super(myName);
		droite = myDroite;
		point = myPoint;
	}
	
	public double[] coord() {
		double[] tab = new double[2];
		// a = -1/a'
		// b = y - a*x
		tab[0] = -1/droite.coord()[0];
		tab[1] = point.coord()[1]-tab[0]*point.coord()[0];
		return tab;
	}
	
	public void tracer(Graphics g) {
		
	}
	
	
}

import java.awt.Graphics;

public class PointCoordonnees extends PointAbstrait {
	private double coord[];
	

	public PointCoordonnees(String myName, double MyAbscisse, double MyOrdonnee) {
		super(myName);
		coord[0]=MyAbscisse;
		coord[1]=MyOrdonnee;

	}
	
	public double[] coord() {
		return coord;
	}

	@Override
	public void tracer(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	
}

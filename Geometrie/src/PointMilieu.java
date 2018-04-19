import java.awt.Graphics;

public class PointMilieu extends PointAbstrait {
	PointAbstrait point1 ;
	PointAbstrait point2;
	
	
	public PointMilieu(String myName, PointAbstrait MyPoint1, PointAbstrait MyPoint2){
		super(myName) ;
		point1 = MyPoint1;
		point2 = MyPoint2;
	}

	public double[] coord() {
		double[] tab = new double[2];
		tab[0] =  (point1.coord()[0] + point2.coord()[0])/2;
		tab[1] = (point1.coord()[1] + point2.coord()[1])/2;
		return tab;
	}
	
	public void tracer(Graphics g) { 
		  
	}
	
}

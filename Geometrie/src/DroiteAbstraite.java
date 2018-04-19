import java.awt.Graphics;

public abstract class DroiteAbstraite extends ElementGeometrique { 

	public DroiteAbstraite(String myName) {
		super(myName);
	}

	abstract double[] coord();
	
	public void tracer(Graphics g) {
		
	}
}

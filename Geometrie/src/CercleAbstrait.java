import java.awt.Graphics;

public abstract class CercleAbstrait extends ElementGeometrique {
	
	public CercleAbstrait(String myName) {
		super(myName);
	}

	abstract Object[] coord();
	
	public void tracer(Graphics g) {
		
	}

}

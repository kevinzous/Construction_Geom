import java.awt.Graphics;

public abstract class ElementGeometrique {
	private String name;
	
	public ElementGeometrique(String myName) {
		this.name = new String(myName);
	}
	
	abstract public void tracer(Graphics g);
	
}


public class Test {

	public static void main(String[] args) {
		
		PointCoordonnees p1 = new PointCoordonnees("A",2.0, 5.0);
		PointCoordonnees p2 = new PointCoordonnees("B",15.0, 46.0);
		DroiteCoordonnees d1 = new DroiteCoordonnees("d1", 1, 2/3);
		DroiteCoordonnees d2 = new DroiteCoordonnees("d2", -2, 4);

		PointMilieu P3 = new PointMilieu("C",p1, p2);
		
		System.out.println(P3.coord());
	}

}

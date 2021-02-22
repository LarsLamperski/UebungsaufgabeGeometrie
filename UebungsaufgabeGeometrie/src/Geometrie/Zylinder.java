package Geometrie;

public class Zylinder implements InterfaceKoerper {

	private double radius;
	private double höhe;

	public Zylinder(double x, double y) {
		höhe = x;
		radius = y;

	}

	@Override
	public double calcOberfläche() {

		return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * höhe;
	}

	@Override
	public double calcVolumen() {
		return Math.PI * Math.pow(radius, 2) * höhe;
	}

}

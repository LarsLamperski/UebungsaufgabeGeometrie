package Geometrie;

public class Kegel implements InterfaceKoerper {

	private double radius;
	private double höhe;

	public Kegel(double x, double y) {
		höhe = x;
		radius = y;

	}

	@Override
	public double calcOberfläche() {
		double mantel = Math.sqrt(Math.pow(höhe, 2) + Math.pow(radius, 2));

		return Math.PI * Math.pow(radius, 2) + Math.PI * radius * mantel;
	}

	@Override
	public double calcVolumen() {
		return Math.PI * 1 / 3 * Math.pow(radius, 2) * höhe;
	}

}

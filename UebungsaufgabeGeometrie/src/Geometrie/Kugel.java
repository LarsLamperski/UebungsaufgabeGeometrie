package Geometrie;

public class Kugel implements InterfaceKoerper {

	private double radius;

	public Kugel(double x) {
		radius = x;

	}

	@Override
	public double calcOberfläche() {

		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calcVolumen() {
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}

}

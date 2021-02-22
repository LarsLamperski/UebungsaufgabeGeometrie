package Geometrie;

public class Zylinder implements InterfaceKoerper {

	private double radius;
	private double h�he;

	public Zylinder(double x, double y) {
		h�he = x;
		radius = y;

	}

	@Override
	public double calcOberfl�che() {

		return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * h�he;
	}

	@Override
	public double calcVolumen() {
		return Math.PI * Math.pow(radius, 2) * h�he;
	}

}

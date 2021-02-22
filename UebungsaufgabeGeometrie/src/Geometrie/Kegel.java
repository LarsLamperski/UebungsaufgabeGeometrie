package Geometrie;

public class Kegel implements InterfaceKoerper {

	private double radius;
	private double h�he;

	public Kegel(double x, double y) {
		h�he = x;
		radius = y;

	}

	@Override
	public double calcOberfl�che() {
		double mantel = Math.sqrt(Math.pow(h�he, 2) + Math.pow(radius, 2));

		return Math.PI * Math.pow(radius, 2) + Math.PI * radius * mantel;
	}

	@Override
	public double calcVolumen() {
		return Math.PI * 1 / 3 * Math.pow(radius, 2) * h�he;
	}

}

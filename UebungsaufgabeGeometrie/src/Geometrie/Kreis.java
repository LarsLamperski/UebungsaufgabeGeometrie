package Geometrie;

public class Kreis implements InterfaceFlaeche {
	private double radius;

	public Kreis(double x) {
		radius = x;
	}

	@Override
	public double calcFlächeninhalt() {
		return Math.pow(radius, 2) * Math.PI;

	}

	@Override
	public double calcUmfang() {
		return radius * 2 * Math.PI;

	}

}

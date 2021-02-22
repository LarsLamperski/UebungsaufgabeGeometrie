package Geometrie;

public class Dreieck implements InterfaceFlaeche {

	private double h�he;
	private double grundfl�che;

	public Dreieck(double x, double y) {
		h�he = x;
		grundfl�che = y;

	}

	@Override
	public double calcUmfang() {
		return Math.sqrt(Math.pow(h�he, 2) + Math.pow(grundfl�che, 2));
	}

	@Override
	public double calcFl�cheninhalt() {
		return h�he * grundfl�che / 2;

	}

}

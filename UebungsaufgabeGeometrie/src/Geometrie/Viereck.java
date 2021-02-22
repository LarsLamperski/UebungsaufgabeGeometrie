package Geometrie;

public class Viereck implements InterfaceFlaeche {

	private double seiteA;
	private double seiteB;

	public Viereck(double x, double y) {
		seiteA = x;
		seiteB = y;

	}

	@Override
	public double calcUmfang() {
		return seiteA * 2 + seiteB * 2;
	}

	@Override
	public double calcFlächeninhalt() {
		return seiteA * seiteB;

	}

}

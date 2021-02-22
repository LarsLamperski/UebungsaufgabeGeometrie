package Geometrie;

public class Würfel implements InterfaceKoerper {

	private double seiteA;

	public Würfel(double x) {
		seiteA = x;

	}

	@Override
	public double calcOberfläche() {
		return 6 * Math.pow(seiteA, 2);
	}

	@Override
	public double calcVolumen() {
		return Math.pow(seiteA, 3);
	}

}

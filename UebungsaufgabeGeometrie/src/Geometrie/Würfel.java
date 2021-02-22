package Geometrie;

public class W�rfel implements InterfaceKoerper {

	private double seiteA;

	public W�rfel(double x) {
		seiteA = x;

	}

	@Override
	public double calcOberfl�che() {
		return 6 * Math.pow(seiteA, 2);
	}

	@Override
	public double calcVolumen() {
		return Math.pow(seiteA, 3);
	}

}

package Geometrie;

public class Dreieck implements InterfaceFlaeche {

	private double höhe;
	private double grundfläche;

	public Dreieck(double x, double y) {
		höhe = x;
		grundfläche = y;

	}

	@Override
	public double calcUmfang() {
		return Math.sqrt(Math.pow(höhe, 2) + Math.pow(grundfläche, 2));
	}

	@Override
	public double calcFlächeninhalt() {
		return höhe * grundfläche / 2;

	}

}

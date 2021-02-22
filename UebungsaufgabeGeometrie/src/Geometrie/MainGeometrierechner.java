package Geometrie;

import java.util.Scanner;

//Aufgabenstellung: erstellen Sie ein Programm zur Körper- und Flächenberechnung von geometrischen Figuren.
//Das Programm soll objektorientiert programmiert sein und das Vererbungskonzept (oder Interfaces) verwenden.
//Der Benutzer soll nach Eingabe der objektspezifischen Daten (Name, Seite_a,...) die Berechnungsergebnisse (z.B.: A, U) angezeigt bekommen.
//Das Programm ist beliebig wiederholbar und per Befehl zu verlassen.
//Auf Fehleingaben ist entsprechend zu reagieren.


public class MainGeometrierechner {
	public static void main(String[] args) {

		System.out.println("Geben sie Figur ein (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen die die Anwendung mit \"Exit\" ");
		Scanner scan = new Scanner(System.in);
		boolean neustart = true;

		do {
			String figur = scan.nextLine();

			if (figur.equalsIgnoreCase("rechtwinkliges Dreieck")){
				double dGrundfläche = 0;
				double dHöhe = 0;
				while (true) {
					System.out.println("Bitte geben Sie die Höhe des Dreiecks ein");
					String idHöhe = scan.next();
					try {
						idHöhe = idHöhe.replaceAll("[a-zA-Z]", "");
						dHöhe = Double.parseDouble(idHöhe);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie die Grundfläsche bzw. Seite C ein");
					String idGrundfläche = scan.next();
					try {
						idGrundfläche = idGrundfläche.replaceAll("[a-zA-Z]", "");
						dGrundfläche = Double.parseDouble(idGrundfläche);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut");
					}
				}
				Dreieck deck1 = new Dreieck(dHöhe, dGrundfläche);
				System.out.println("Das Dreieck hat eine Gesamtfläche von:" + deck1.calcFlächeninhalt());
				System.out.println("Das Dreieck hat einen Umfang von:" + deck1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Viereck")) {
				double seiteA = 0;
				double seiteB = 0;
				while (true) {
					System.out.println("Bitte geben Sie die Länge der Seite A an");
					String iseiteA = scan.next();
					try {
						iseiteA = iseiteA.replaceAll("[a-zA-Z]", "");
						seiteB = Double.parseDouble(iseiteA);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie die Länge der Seite B an.");
					String iseiteB = scan.next();
					try {
						iseiteB = iseiteB.replaceAll("[a-zA-Z]", "");
						seiteA = Double.parseDouble(iseiteB);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut");
					}
				}
				Viereck vier1 = new Viereck(seiteB, seiteA);
				System.out.println("Das Viereck hat eine Gesamtfläche von:" + vier1.calcFlächeninhalt());
				System.out.println("Das Viereck hat einen Umfang von:" + vier1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Kreis")) {
				double radius = 0;
				while (true) {
					System.out.println("Bitte geben Sie den Radius des Kreises ein");
					String iradius = scan.next();
					try {
						iradius = iradius.replaceAll("[a-zA-Z]", "");
						radius = Double.parseDouble(iradius);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");
					}
				}
				Kreis circle1 = new Kreis(radius);
				System.out.println("Der Kreis hat eine Gesamtfläche von:" + circle1.calcFlächeninhalt());
				System.out.println("Der Kreis hat einen Umfang von:" + circle1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Würfel")) {
				double seiteA = 0;
				while (true) {
					System.out.println("Bitte geben Sie eine beliebige Seite des Würfels an");
					String iseiteA = scan.next();
					try {
						iseiteA = iseiteA.replaceAll("[a-zA-Z]", "");
						seiteA = Double.parseDouble(iseiteA);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");
					}
				}
				Würfel würfel1 = new Würfel(seiteA);
				System.out.println("Der Würfel hat eine Volumen von:" + würfel1.calcVolumen());
				System.out.println("Der Würfel hat eineb Oberflächeninhalt von:" + würfel1.calcOberfläche());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Kugel")) {
				double kRadius = 0;
				while (true) {
					System.out.println("Bitte geben Sie den Radius der Kugel an");
					String ikRadius = scan.next();
					try {
						ikRadius = ikRadius.replaceAll("[a-zA-Z]", "");
						kRadius = Double.parseDouble(ikRadius);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");
					}
				}
				Kugel kugel1 = new Kugel(kRadius);
				System.out.println("Die Kugel hat ein Gesamtvolumen von: " + kugel1.calcVolumen());
				System.out.println("Die Kugel hat einen Oberfläscheninhalt von:" + kugel1.calcOberfläche());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Zylinder")) {
				double zRadius = 0;
				double zHöhe = 0;
				while (true) {
					System.out.println("Bitte geben Sie die Höhe des Zylinders ein");
					String izHöhe = scan.next();
					try {
						izHöhe = izHöhe.replaceAll("[a-zA-Z]", "");
						zHöhe = Double.parseDouble(izHöhe);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie den Radius des Zylinders ein");
					String izRadius = scan.next();
					try {
						izRadius = izRadius.replaceAll("[a-zA-Z]", "");
						zRadius = Double.parseDouble(izRadius);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut");
					}
				}
				Zylinder zylinder1 = new Zylinder(zHöhe, zRadius);
				System.out.println("Der Zylinder hat ein Volumen von: " + zylinder1.calcVolumen());
				System.out.println("Der Zylinder hat einen Oberflächeninhalt von: :" + zylinder1.calcOberfläche());
				System.out.println("My hat's off to you! Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");
				

			} else if (figur.equalsIgnoreCase("Kegel")) {
				double kRadius = 0;
				double dHöhe = 0;
				while (true) {
					System.out.println("Bitte geben Sie die Höhe des Kegels ein");
					String idHöhe = scan.next();
					try {
						idHöhe = idHöhe.replaceAll("[a-zA-Z]", "");
						dHöhe = Double.parseDouble(idHöhe);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie den Radius des Kegels ein");
					String ikRadius = scan.next();
					try {
						ikRadius = ikRadius.replaceAll("[a-zA-Z]", "");
						kRadius = Double.parseDouble(ikRadius);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine gültilge Zahl. Versuchen Sie es erneut");
					}
				}
				Kegel kegel1 = new Kegel(dHöhe, kRadius);
				System.out.println("Der Kegel hat ein Volumen von: " + kegel1.calcVolumen());
				System.out.println("Der Kegel hat einen Oberflächeninhalt von: :" + kegel1.calcOberfläche());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, Würfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");
			}
			else if ((figur.isEmpty())) {
				continue;
			}
			else if (figur.equalsIgnoreCase("Exit")) {
				System.out.println("Vielen Dank für ihre Zeit");
				System.exit(0);
			
				}
			
			else {
				System.out.println(
						"Dies ist keine gültige Figur.Bitte versuchen sie es erneut. (rechtwinkliges Dreieck, Quadrat, Kreis, Raute, Trapez, Würfel, Pyramide, Kugel, Zylinder, Kegel.");

			}
		} while (neustart);
	}
}
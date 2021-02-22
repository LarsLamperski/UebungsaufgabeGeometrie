package Geometrie;

import java.util.Scanner;

//Aufgabenstellung: erstellen Sie ein Programm zur K�rper- und Fl�chenberechnung von geometrischen Figuren.
//Das Programm soll objektorientiert programmiert sein und das Vererbungskonzept (oder Interfaces) verwenden.
//Der Benutzer soll nach Eingabe der objektspezifischen Daten (Name, Seite_a,...) die Berechnungsergebnisse (z.B.: A, U) angezeigt bekommen.
//Das Programm ist beliebig wiederholbar und per Befehl zu verlassen.
//Auf Fehleingaben ist entsprechend zu reagieren.


public class MainGeometrierechner {
	public static void main(String[] args) {

		System.out.println("Geben sie Figur ein (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen die die Anwendung mit \"Exit\" ");
		Scanner scan = new Scanner(System.in);
		boolean neustart = true;

		do {
			String figur = scan.nextLine();

			if (figur.equalsIgnoreCase("rechtwinkliges Dreieck")){
				double dGrundfl�che = 0;
				double dH�he = 0;
				while (true) {
					System.out.println("Bitte geben Sie die H�he des Dreiecks ein");
					String idH�he = scan.next();
					try {
						idH�he = idH�he.replaceAll("[a-zA-Z]", "");
						dH�he = Double.parseDouble(idH�he);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie die Grundfl�sche bzw. Seite C ein");
					String idGrundfl�che = scan.next();
					try {
						idGrundfl�che = idGrundfl�che.replaceAll("[a-zA-Z]", "");
						dGrundfl�che = Double.parseDouble(idGrundfl�che);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut");
					}
				}
				Dreieck deck1 = new Dreieck(dH�he, dGrundfl�che);
				System.out.println("Das Dreieck hat eine Gesamtfl�che von:" + deck1.calcFl�cheninhalt());
				System.out.println("Das Dreieck hat einen Umfang von:" + deck1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Viereck")) {
				double seiteA = 0;
				double seiteB = 0;
				while (true) {
					System.out.println("Bitte geben Sie die L�nge der Seite A an");
					String iseiteA = scan.next();
					try {
						iseiteA = iseiteA.replaceAll("[a-zA-Z]", "");
						seiteB = Double.parseDouble(iseiteA);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");

					}
				}

				while (true) {
					System.out.println("Bitte geben Sie die L�nge der Seite B an.");
					String iseiteB = scan.next();
					try {
						iseiteB = iseiteB.replaceAll("[a-zA-Z]", "");
						seiteA = Double.parseDouble(iseiteB);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut");
					}
				}
				Viereck vier1 = new Viereck(seiteB, seiteA);
				System.out.println("Das Viereck hat eine Gesamtfl�che von:" + vier1.calcFl�cheninhalt());
				System.out.println("Das Viereck hat einen Umfang von:" + vier1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

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
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");
					}
				}
				Kreis circle1 = new Kreis(radius);
				System.out.println("Der Kreis hat eine Gesamtfl�che von:" + circle1.calcFl�cheninhalt());
				System.out.println("Der Kreis hat einen Umfang von:" + circle1.calcUmfang());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("W�rfel")) {
				double seiteA = 0;
				while (true) {
					System.out.println("Bitte geben Sie eine beliebige Seite des W�rfels an");
					String iseiteA = scan.next();
					try {
						iseiteA = iseiteA.replaceAll("[a-zA-Z]", "");
						seiteA = Double.parseDouble(iseiteA);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");
					}
				}
				W�rfel w�rfel1 = new W�rfel(seiteA);
				System.out.println("Der W�rfel hat eine Volumen von:" + w�rfel1.calcVolumen());
				System.out.println("Der W�rfel hat eineb Oberfl�cheninhalt von:" + w�rfel1.calcOberfl�che());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

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
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");
					}
				}
				Kugel kugel1 = new Kugel(kRadius);
				System.out.println("Die Kugel hat ein Gesamtvolumen von: " + kugel1.calcVolumen());
				System.out.println("Die Kugel hat einen Oberfl�scheninhalt von:" + kugel1.calcOberfl�che());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");

			} else if (figur.equalsIgnoreCase("Zylinder")) {
				double zRadius = 0;
				double zH�he = 0;
				while (true) {
					System.out.println("Bitte geben Sie die H�he des Zylinders ein");
					String izH�he = scan.next();
					try {
						izH�he = izH�he.replaceAll("[a-zA-Z]", "");
						zH�he = Double.parseDouble(izH�he);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");

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
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut");
					}
				}
				Zylinder zylinder1 = new Zylinder(zH�he, zRadius);
				System.out.println("Der Zylinder hat ein Volumen von: " + zylinder1.calcVolumen());
				System.out.println("Der Zylinder hat einen Oberfl�cheninhalt von: :" + zylinder1.calcOberfl�che());
				System.out.println("My hat's off to you! Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");
				

			} else if (figur.equalsIgnoreCase("Kegel")) {
				double kRadius = 0;
				double dH�he = 0;
				while (true) {
					System.out.println("Bitte geben Sie die H�he des Kegels ein");
					String idH�he = scan.next();
					try {
						idH�he = idH�he.replaceAll("[a-zA-Z]", "");
						dH�he = Double.parseDouble(idH�he);
						break;
					} catch (Exception e) {
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut.");

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
						System.out.println("Das ist leider Keine g�ltilge Zahl. Versuchen Sie es erneut");
					}
				}
				Kegel kegel1 = new Kegel(dH�he, kRadius);
				System.out.println("Der Kegel hat ein Volumen von: " + kegel1.calcVolumen());
				System.out.println("Der Kegel hat einen Oberfl�cheninhalt von: :" + kegel1.calcOberfl�che());
				System.out.println("Geben sie eine weitere Figur an (Kegel, Zylinder, W�rfel, Kugel, Kreis, Viereck, rechtwinkliges Dreieck) oder verlassen Sie das Programm mit \"Exit\".");
			}
			else if ((figur.isEmpty())) {
				continue;
			}
			else if (figur.equalsIgnoreCase("Exit")) {
				System.out.println("Vielen Dank f�r ihre Zeit");
				System.exit(0);
			
				}
			
			else {
				System.out.println(
						"Dies ist keine g�ltige Figur.Bitte versuchen sie es erneut. (rechtwinkliges Dreieck, Quadrat, Kreis, Raute, Trapez, W�rfel, Pyramide, Kugel, Zylinder, Kegel.");

			}
		} while (neustart);
	}
}
/*
TODO: ein Vererbungsbeispiel:
mit mehreren Vererbungen
z.B.: Shapes: (Dreiecke, Rechteck, Raute, Kreis)
min. 3 Klassen (Shapes)
Gesamtumfang ALLER shapes
*/

public class Main {

    public static void main(String[] args) {
        Fahrrad f1 = new Fahrrad(2, 30, 30,0);
        f1.bewegung(f1.getMaxSpeed());
        f1.bewegung(60);

        Auto a1 = new Auto(4, 140, 140, 0);
        a1.bewegung(60);

        Krankenwagen k1 = new Krankenwagen(4, 120, 120, 0);
        k1.bewegung(60);

        Rennwagen r1 = new Rennwagen(4, 300, 300, 0);
        r1.bewegung(60);
    }
}

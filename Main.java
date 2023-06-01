package unit12_230513.hausaufgabe_230513;

/*
TODO: ein Vererbungsbeispiel:
mit mehreren Vererbungen
z.B.: Shapes: (Dreiecke, Rechteck, Raute, Kreis)
min. 3 Klassen (Shapes)
Gesamtumfang ALLER shapes
*/

public class Main {

    public static void main(String[] args) {
        int minuten = 30;
        Fahrrad f1 = new Fahrrad(2, 30, 30,0);
        f1.bewegung(f1.getMaxSpeed());

        Auto a1 = new Auto(4, 140, 140, 0);
        a1.bewegung(60);
    }
}

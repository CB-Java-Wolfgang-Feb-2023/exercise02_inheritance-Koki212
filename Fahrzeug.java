package unit12_230513.hausaufgabe_230513;

public class Fahrzeug {
    private int anzahlRaeder;
    private int speed;
    private double maxSpeed;
    private double position;

    public Fahrzeug(int anzahlRaeder, int speed, double maxSpeed, double position) {
        this.anzahlRaeder = anzahlRaeder;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.position = position;
    }

    void bewegung(double minuten) {
        this.position = speed * (minuten/60);
        System.out.println("Es wurden " + position + " km in " + minuten + " Minuten zurückgelegt");
    }

    /*public void setSpeed(int speed) {
        this.speed = speed;
    }*/

    public double getMaxSpeed() {
        return maxSpeed;
    }
}

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


    public double getMaxSpeed() {
        return maxSpeed;
    }
}

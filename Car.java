

public class Car {
    private String merkki;
    private String malli;
    private int nopeus;

    public Car(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
        this.nopeus = 0; // Nopeus alkutilanteessa 0.
    }

    public void tiedot() {
        System.out.println("Auto: " + merkki + " " + malli + " " + "Nopeus: " + nopeus + "km/h");
    }
}
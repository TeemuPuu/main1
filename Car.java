

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
        if (nopeus < 0) {
            nopeus = 0;
         }
         System.out.println("Auto: " + merkki + " " + malli + " " + "Nopeus: " + nopeus + "km/h");
    }

    public void accelerate(int kiihdytys) {
        this.nopeus += kiihdytys;
    }

    public void decelerate(int hidastus) {
        this.nopeus -= hidastus;
    }
}
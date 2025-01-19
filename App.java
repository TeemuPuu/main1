// Koodin runko tehty kurssin videoiden pohjalta. Chatgpt käytetty virheiden tarkistukseen ja korjaukseen.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        Car newCar = null;

        System.out.print("Anna auton merkki:");
        String merkki = sc.nextLine();
        System.out.print("Anna auton malli:");
        String malli = sc.nextLine();

        newCar = new Car(merkki, malli);

        Boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = Integer.parseInt(sc.nextLine());

                switch(i) {
                    case 1:
                        newCar.tiedot();
                        break;

                    case 2:
                         System.out.print("Anna auton merkki:");
                         merkki = sc.nextLine();
                         System.out.print("Anna auton malli:");
                         malli = sc.nextLine();

                         newCar = new Car(merkki, malli);
                         break;
                    case 3:
                         System.out.print("Kuinka monta km/h haluat kiihdyttää?");
                         int kiihdytys = Integer.parseInt(sc.nextLine());
                         if (kiihdytys > 0) {
                            newCar.accelerate(kiihdytys);
                         } else {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                         }
                         break;
                    case 4:
                         System.out.print("Kuinka monta km/h haluat hidastaa?");
                         int hidastus = Integer.parseInt(sc.nextLine());
                         if (hidastus > 0) {
                            newCar.decelerate(hidastus);
                         } else {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                         }
                         break;
                    case 0:
                         System.out.println("Kiitos ohjelman käytöstä.");
                         exit = true;
                         break;
                    default:
                         System.out.println("Syöte oli väärä");
                         break;
                }
            }
        }
    }
}     
}





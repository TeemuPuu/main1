import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Safe newSafe = new Safe("0000");

        Boolean exit = false;
        while(!exit) {
            System.out.println("1) Aseta pinkoodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = Integer.parseInt(sc.nextLine());

                switch(i) {
                    case 1:
                        System.out.print("Anna PIN-koodi");
                        String pinCode = sc.nextLine();
                        newSafe = new Safe(pinCode);
                        break;

                    case 2:
                         break;

                    case 3:
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






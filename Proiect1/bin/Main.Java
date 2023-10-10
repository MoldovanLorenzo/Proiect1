import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Laptop> lista = new ArrayList<>();

        boolean iesire = false;

        while (!iesire) {
            System.out.println("\nMeniu:");
            System.out.println("1. Introducere laptop");
            System.out.println("2. Afișare capacității de RAM");
            System.out.println("3. Căutare laptop după preț");
            System.out.println("4. Ieșire");

            System.out.print("Alegeți o opțiune: ");
            int optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    System.out.print("Introduceți producătorul: ");
                    String producator = scanner.next();
                    System.out.print("Introduceți capacitatea de RAM (GB): ");
                    int ram = scanner.nextInt();
                    System.out.print("Introduceți arhitectura procesorului: ");
                    String arhitecturaProcesor = scanner.next();
                    System.out.print("Introduceți prețul: ");
                    double pret = scanner.nextDouble();
                    lista.add(new Laptop(producator, ram, arhitecturaProcesor, pret));
                    break;
                case 2:
                    for (Laptop laptop : lista) {
                        laptop.afiseazaCapacitateRam();
                    }
                    break;
                case 3:
                    System.out.print("Introduceți prețul dorit: ");
                    double pretCautat = scanner.nextDouble();
                    for (Laptop laptop : lista) {
                        if (laptop.arePretulMaiMicSauEgalDecat(pretCautat)) {
                            System.out.println("Laptopul cu producătorul " + laptop.getProducator() + " este în bugetul tău.");
                        }
                    }
                    break;
                case 4:
                    iesire = true;
                    System.out.println("La revedere!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opțiune invalidă. Vă rugăm să alegeți o opțiune validă.");
            }
        }
    }
}
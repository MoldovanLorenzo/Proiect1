import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Laptop> lista = new ArrayList<>();
        String producator;
        int ram;
        String arhitecturaProcesor;
        double pret;
        double pretCautat;
        int meniu;
        do{
            System.out.println("\nMeniu:");
            System.out.println("1. Introducere laptop");
            System.out.println("2. Afișare capacitatii de RAM");
            System.out.println("3. Căutare laptop după pretul cautat");
            System.out.println("4. Iesire");

            System.out.print("Alegeti o optiune: ");
            meniu= scanner.nextInt();

            switch (meniu) {
                case 1:
                    System.out.print("Introduceti producatorul: ");
                    producator = scanner.next();
                    System.out.print("Introduceti capacitatea RAM : ");
                    ram = scanner.nextInt();
                    System.out.print("Introduceti arhitectura procesorului: ");
                    arhitecturaProcesor = scanner.next();
                    System.out.print("Introduceti pretul: ");
                    pret = scanner.nextDouble();
                    lista.add(new Laptop(producator, ram, arhitecturaProcesor, pret));
                    break;
                case 2:
                    for (Laptop laptop : lista) {
                        laptop.afiseazaCapacitateRam();
                    }
                    break;
                case 3:
                    System.out.print("Introduceti pretul dorit: ");
                    pretCautat = scanner.nextDouble();
                    for (Laptop laptop : lista) {
                        if (laptop.cautarePret(pretCautat)) {
                            System.out.println("Laptopul" + laptop.getProducator() + " este în bugetul tau.");
                        }
                    }
                    break;
                case 4:
                System.out.println("iesire!");
                    break;
                default:
                    System.out.println("Optiune invalida.");
            }
        }while(meniu!=4);
    }
}
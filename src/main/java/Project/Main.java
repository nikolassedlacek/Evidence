package Project;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpravaPojistenych spravaPojistenych = new SpravaPojistenych();

        System.out.println("---------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("---------------------");

        boolean pokracovat = true;

        while (pokracovat){
            System.out.println("1 _ Vytvořit pojištěného");
            System.out.println("2 - Zobraz seznam pojištěných");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");

            System.out.println("Vyberte akci (1-4)");
            int volba = scanner.nextInt();
            switch (volba){
                case 1:
                    vytvorPojistenehoZeVstupu(spravaPojistenych,scanner);
                    break;
                case 2:
                    System.out.println("Seznam Pojištěných");
                    spravaPojistenych.zobrazSeznamPojistenych();
                    break;
                case 3:
                    System.out.println("Zadejte jméno a příjmení pro vyhledání pojištěného:");
                    String hledaneJmeno = scanner.next();
                    String hledanePrijmeni = scanner.next();
                    Pojisteny hledanyPojisteny = spravaPojistenych.najdiPojisteneho(hledaneJmeno, hledanePrijmeni);
                    if(hledanyPojisteny != null){
                        System.out.println("\nNalezený pojištěný: " + hledanyPojisteny);
                    }else {
                        System.out.println("\nPojištěný s jménem " + hledaneJmeno + " " + hledanePrijmeni + " nebyl nalezen");
                    }
                    break;
                case 4:
                    pokracovat = false;
                    break;
                default:
                    System.out.println("Neplatná volba. Zadejte prosím číslo od 1 do 4.");


            }
        }
        System.out.println("Konec programu.");
        scanner.close();
    }
    private static void vytvorPojistenehoZeVstupu(SpravaPojistenych spravaPojistenych, Scanner scanner){
        System.out.println("\nVytvořte pojištěného - Zadejte jméno, příjmení, věk a telefoní číslo:");
        System.out.print("Jméno: ");
        String jmeno = scanner.next();
        System.out.print("Příjmení: ");
        String prijmeni = scanner.next();
        System.out.print("Věk: ");
        int vek = scanner.nextInt();
        System.out.print("Telefoní číslo: ");
        String telefoniCislo = scanner.next();

        try {
            spravaPojistenych.vytvorPojisteneho(jmeno, prijmeni,vek, telefoniCislo);
            System.out.println("Pojištěný byl úspěšně vytvořen");
        } catch (IllegalArgumentException e){
            System.out.println("Chyba při vytvářéní pojištěného: " + e.getMessage());
        }
    }
}


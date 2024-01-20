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

        while (pokracovat) {
            // Menu pro volbu akce
            System.out.println("1 - Přidat nového pojisteného");
            System.out.println("2 - Vypsat všechny pojistené");
            System.out.println("3 - Vyhledat pojisteného");
            System.out.println("4 - Konec");

            System.out.println("Vyberte akci (1-4)");
            String volba = scanner.nextLine();
            switch (volba) {
                case "1":
                    // Volání metody pro vytvoření pojistěného ze vstupu
                    vytvorPojistenehoZeVstupu(spravaPojistenych, scanner);
                    break;
                case "2":
                    // Vypsání všech pojistěných
                    System.out.println(spravaPojistenych.vypisVsechnyPojistene());
                    break;
                case "3":
                    // Vyhledání pojištěného podle jména a příjmení
                    hledejPojisteneho(spravaPojistenych, scanner);
                    break;
                case "4":
                    // Ukončení programu
                    pokracovat = false;
                    break;
                default:
                    System.out.println("Neplatná volba. Zadejte prosím číslo od 1 do 4.");
                    break;
            }
        }
        System.out.println("Konec programu.");
        scanner.close();
    }
    // Metoda pro vyhledání pojistěného
    private static void hledejPojisteneho(SpravaPojistenych spravaPojistenych, Scanner scanner) {
        System.out.println("Zadejte jméno a příjmení pro vyhledání pojištěného:");
        String hledaneJmeno = scanner.nextLine();
        String hledanePrijmeni = scanner.nextLine();
        Pojisteny hledanyPojisteny = spravaPojistenych.najdiPojisteneho(hledaneJmeno, hledanePrijmeni);
        if (hledanyPojisteny != null) {
            System.out.println("\nNalezený pojištěný: " + hledanyPojisteny);
        } else {
            System.out.println("\nPojištěný s jménem " + hledaneJmeno + " " + hledanePrijmeni + " nebyl nalezen");
        }
    }
    // Metoda pro kontrolu platného jména
    private static boolean jePlatneJmeno(String jmeno) {
        int minDelkaJmena = 2;
        int maxDelkaJmena = 20;
        return jmeno.length() >= minDelkaJmena && jmeno.length() <= maxDelkaJmena;
    }
    // Metoda pro kontrolu platného příjmení
    private static boolean jePlatnePrijmeni(String prijmeni) {
        int minDelkaPrijmeni = 2;
        int maxDelkaPrijmeni = 20;
        return prijmeni.length() >= minDelkaPrijmeni && prijmeni.length() <= maxDelkaPrijmeni;
    }
    // Metoda pro kontrolu platného věku
    private static boolean jePlatnyVek(int vek) {
        return vek >= 0 && vek <= 120;
    }
    // Metoda pro kontrolu platného telefoního čísla
    private static boolean jePlatneTelefoniCislo(String telefoniCislo) {
        return telefoniCislo.trim().matches("\\d{9,10}");
    }
    // Metoda pro vytvoření pojištěného ze vstupu
    private static void vytvorPojistenehoZeVstupu(SpravaPojistenych spravaPojistenych, Scanner scanner) {
        System.out.println("\nVytvořte pojištěného - Zadejte jméno, příjmení, věk a telefoní číslo:");

        String jmeno = nactiPlatneJmeno(scanner);
        String prijmeni = nactiPlatnePrijmeni(scanner);
        int vek = nactiPlatnyVek(scanner);
        String telefoniCislo = nactiPlatneTelefoniCislo(scanner);

        try {
            spravaPojistenych.vytvorPojisteneho(jmeno, prijmeni, vek, telefoniCislo);
            System.out.println("Pojištěný byl úspěšně vytvořen");
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba při vytváření pojištěného: " + e.getMessage());
        }
    }
    // Metoda pro načtení platného jména
    private static String nactiPlatneJmeno(Scanner scanner) {
        String jmeno;
        do {
            System.out.print("Jméno: ");
            jmeno = scanner.nextLine();
        } while (!jePlatneJmeno(jmeno));
        return jmeno;
    }
    // Metoda pro načtení platného příjmení
    private static String nactiPlatnePrijmeni(Scanner scanner) {
        String prijmeni;
        do {
            System.out.print("Příjmení: ");
            prijmeni = scanner.nextLine();
        } while (!jePlatnePrijmeni(prijmeni.trim()));
        return prijmeni;
    }
    // Metoda pro načtení platného věku
    private static int nactiPlatnyVek(Scanner scanner) {
        int vek;
        do {
            System.out.print("Věk: ");
            vek = Integer.parseInt(scanner.nextLine());
        } while (!jePlatnyVek(vek));
        return vek;
    }
    // Metoda pro načtení platného telefoního čísla
    private static String nactiPlatneTelefoniCislo(Scanner scanner) {
        String telefoniCislo;
        do {
            System.out.print("Telefoní číslo: ");
            telefoniCislo = scanner.nextLine();
        } while (!jePlatneTelefoniCislo(telefoniCislo));
        return telefoniCislo;
    }
}


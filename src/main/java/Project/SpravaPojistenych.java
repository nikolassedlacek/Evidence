package Project;

import java.util.ArrayList;
import java.util.List;


public class SpravaPojistenych {
// Vytvoří privátní seznam, který je uloženy v pameti
    private List<Pojisteny> seznamPojistenych;

    public List<Pojisteny> getSeznamPojistenych() {
        return seznamPojistenych;
    }

    //Vytvoří arrayList(dynamický seznam)
    public SpravaPojistenych() {

        this.seznamPojistenych = new ArrayList<>();
    }
// Metoda pro vytvoření pojišteneho
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefoniCislo) {
        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefoniCislo);
        seznamPojistenych.add(pojisteny);

    }
// Metoda pro vypis seznamu
    public void zobrazSeznamPojistenych() {
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println(pojisteny);
        }
    }
// Metoda pro vyhledání pojištěného podle jména a příjmení
    public Pojisteny najdiPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                return pojisteny;
            }
        }
        return null;
    }

}


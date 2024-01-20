package Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Třída SpravaPojistených slouží k evidenci a správě pojištěných osob.
 */
public class SpravaPojistenych {
    // Privatní seznam pro ukládání objektů typu Pojisteny
    private List<Pojisteny> seznamPojistenych;

    /**
     * Konstruktor pro vytvoření instance třídy SpravaPojistenych.
     * Inicializuje seznamPojistenych jako nový ArrayList.
     */
    public SpravaPojistenych() {

        this.seznamPojistenych = new ArrayList<>();
    }

    /**
     * Metoda pro vytvoření nového pojištěného a přidání ho do seznamu.
     *
     * @param jmeno         Jméno pojištěného.
     * @param prijmeni      Příjmení pojištěného.
     * @param vek           Věk pojištěného.
     * @param telefoniCislo Telefoní číslo pojištěného.
     */
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefoniCislo) {
        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefoniCislo);
        seznamPojistenych.add(pojisteny);
    }

    /**
     * Metoda pro získání seznamu všech pojištěných v textové podobě.
     *
     * @return Textová reprezentace všech pojištěných.
     */
    public String vypisVsechnyPojistene() {
        StringBuilder vystup = new StringBuilder();
        for (Pojisteny pojisteny : seznamPojistenych) {
            vystup.append(pojisteny.toString()).append("\n");
        }
        return vystup.toString();
    }

    /**
     * Metoda pro vyhledání pojištěného podle jména a přijmení.
     *
     * @param jmeno     Jméno pojištěného k vyhledání.
     * @param prijmeni  Příjmení pojištěného k vyhledání.
     * @return Pojištěný s odpovídajícím jménem a příjmením nebo null, pokud není nalezen.
     */
    public Pojisteny najdiPojisteneho(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                return pojisteny;
            }
        }
        return null;
    }
}


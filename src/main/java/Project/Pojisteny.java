package Project;

// Vytvoří objekt pojistenec
public class Pojisteny {
    /**
     * @param jmeno - přidá objektu jmeno string
     * @param prijmeni - přidá objektu příjmení string
     * @param vek - přidá objektu věk integer
     * @param telefoniCislo - přidá objektu telefoní číslo string
     */

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefoniCislo;


// podmínka, která ošetřuje aby jméno nebylo prázdné
    public  Pojisteny (String jmeno, String prijmeni, int vek, String telefonicislo) {
        if (jmeno == null || jmeno.trim().isEmpty()) {
            throw new IllegalArgumentException("Jméno nesmí být prázdné");
        }
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefonicislo;
    }

    /**
     *
     * @return jmeno - vrátí hodnotu jméno string
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     *
     * @return prijmeni - vrátí hodnotu příjmení string
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     *
     * @return - vratí parametry + daný text
     */
    @Override
    public String toString(){
        return jmeno + " " + prijmeni + "(Věk: " + vek + ", Tel.: " + telefoniCislo + ")";

    }
}




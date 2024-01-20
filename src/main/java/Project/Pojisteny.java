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

    /**
     * Reprezentuje pojištěnou ossobu s jménem, přijmením, věkem a telefoním číslem
     * @param jmeno Jméno pojištěného.
     * @param prijmeni Přijmení pojištěného
     * @param vek Věk pojištěného
     * @param telefoniCislo Telefoní číslo pojištěného
     */
    public  Pojisteny (String jmeno, String prijmeni, int vek, String telefoniCislo) {
        // Konstruktor
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefoniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString(){
        return jmeno + " " + prijmeni + "(Věk: " + vek + ", Tel.: " + telefoniCislo + ")";

    }
}




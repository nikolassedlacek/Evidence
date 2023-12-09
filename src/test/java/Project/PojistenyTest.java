package Project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PojistenyTest {

    @Test
    void getJmeno() {
        Pojisteny pojisteny = new Pojisteny("Karel", "Novák", 25, "231234567");
        assertEquals("Karel", pojisteny.getJmeno());
    }

    @Test
    void getPrijmeni() {
        Pojisteny pojisteny = new Pojisteny("Karel", "Novák", 25, "231234567");
        assertEquals("Novák", pojisteny.getPrijmeni());
    }

    @Test
    void testToString() {
        Pojisteny pojisteny = new Pojisteny("John", "Doe", 30, "123456789");
        String expectedToString = "John Doe(Věk: 30, Tel.: 123456789)";
        assertEquals(expectedToString, pojisteny.toString());
    }
}
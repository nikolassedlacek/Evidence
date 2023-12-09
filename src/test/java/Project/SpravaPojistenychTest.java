package Project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpravaPojistenychTest {

    @Test
    void vytvorPojisteneho() {
        SpravaPojistenych sprava = new SpravaPojistenych();
        sprava.vytvorPojisteneho("Karel", "Novák", 26, "123456789");
        assertEquals(1, sprava.getSeznamPojistenych().size());
    }

    @Test
    void zobrazSeznamPojistenych() {
        SpravaPojistenych sprava = new SpravaPojistenych();
        sprava.vytvorPojisteneho("Karel", "Novák", 30, "123456789");
        sprava.vytvorPojisteneho("Michal", "Čára", 25, "987654321");


        assertDoesNotThrow(() -> sprava.zobrazSeznamPojistenych());
    }

    @Test
    void najdiPojisteneho() {
        SpravaPojistenych sprava = new SpravaPojistenych();
        sprava.vytvorPojisteneho("Karel", "Novák", 30, "123456789");
        sprava.vytvorPojisteneho("Michal", "Čára", 25, "987654321");

    }
}
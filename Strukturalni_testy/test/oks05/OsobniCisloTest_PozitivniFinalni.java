package oks05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest_PozitivniFinalni {
    private OsobniCislo oc;
    @BeforeEach
    void setUp() {
        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, p");
        oc.generujOsobniCislo("1234");
    }
    @org.junit.jupiter.api.Test
    void generujOsobniCislo() {
        assertEquals("A14B1234P", oc.vysledek,"Chyba: špatně vygenerované osobní číslo");
    }

    @org.junit.jupiter.api.Test
    void isPlatneOsobniCislo() {
        assertEquals(true, oc.isPlatneOsobniCislo(), "Chyba: osobní číslo je platné");
    }

}
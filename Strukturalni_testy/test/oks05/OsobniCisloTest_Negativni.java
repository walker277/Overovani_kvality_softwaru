package oks05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest_Negativni {

    @org.junit.jupiter.api.Test
    void testToString() {
        OsobniCislo oc = new OsobniCislo("");
        assertEquals("???xxxx? <= ? ? ("+Konstanty.TEXT_CHYBNY_FORMAT+")", oc.toString(), "Chyba: špatné vypsaní osobního čísla");
    }

    @Test
    void zpracujRokNastupu_1() {
        OsobniCislo oc = new OsobniCislo("");
        oc.zpracujRokNastupu("12345");
        assertEquals("?", oc.rokNastupu,"Chyba rok nástupu je neplatný");
    }

    @Test
    void zpracujRokNastupu_2() {
        OsobniCislo oc = new OsobniCislo("");
        oc.zpracujRokNastupu("****");
        assertEquals( "?", oc.rokNastupu, "Chyba: musí být ?");
    }

    @Test
    void zpracujNepovinne() {
        OsobniCislo oc = new OsobniCislo("");
        oc.zpracujNepovinne("Nepovinne");
        assertEquals( "Nepovinne", oc.nepovinne, "Chyba: špatně nepovinné");
    }

    @org.junit.jupiter.api.Test
    void isPlatneOsobniCislo() {
        OsobniCislo oc = new OsobniCislo("");
        assertEquals(false, oc.isPlatneOsobniCislo(), "Chyba: osobní číslo je neplatné");
    }

    @org.junit.jupiter.api.Test
    void naplnAtributy_1() {
        OsobniCislo oc = new OsobniCislo("Novák, Josef, fav, 2014, b, p,c,q,w g");
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("Josef", oc.jmeno, "Šptaně naplněný atribut jméno");
    }

    @org.junit.jupiter.api.Test
    void naplnAtributy_2() {
        OsobniCislo oc = new OsobniCislo(null);
        oc.naplnAtributy("");
        assertEquals("?", oc.jmeno, "Šptaně naplněný atribut jméno");
    }
}
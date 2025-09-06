package oks05;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest_PozitivniPolotovar {
    private OsobniCislo oc;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, p");
    }

    @org.junit.jupiter.api.Test
    void compareTo_1() {
        assertEquals(0, oc.compareTo(oc), "Chyba: příjmení jsou stejná");
    }
    @org.junit.jupiter.api.Test
    void compareTo_2() {
        OsobniCislo oc2 = new OsobniCislo("Bystrý, Josef, fav, 2014, b, p");
        assertEquals(-1, oc2.compareTo(oc), "Chyba: příjmeí nejsou stejná B");
    }
    @org.junit.jupiter.api.Test
    void compareTo_3() {
        OsobniCislo oc2 = new OsobniCislo("Novák, Arnošt, fav, 2014, b, p");
        assertEquals(-1, oc2.compareTo(oc), "Chyba: jména nejsou stejná");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("A14BxxxxP <= NOVÁK Josef", oc.toString(), "Chyba: špatné vypsaní osobního čísla s jménem");
    }

    @org.junit.jupiter.api.Test
    void getOsobniCislo() {
        assertEquals("A14BxxxxP", oc.getOsobniCislo(), "Chyba: vráceno špatné osobní číslo");
    }

    @org.junit.jupiter.api.Test
    void isPlatneOsobniCislo() {
        assertEquals(false, oc.isPlatneOsobniCislo(), "Chyba: osobní číslo je neplatné");
    }

    @org.junit.jupiter.api.Test
    void isPlatnyFormat() {
        assertEquals(true, oc.isPlatnyFormat(), "Chyba: formát osobního čísla je platný");
    }

    @org.junit.jupiter.api.Test
    void getTypStudia() {
        assertEquals(TypStudia.BAKALARSKY, oc.getTypStudia(), "Chyba: vrácen špatný typ studia");
    }

    @org.junit.jupiter.api.Test
    void getFakulta() {
        assertEquals("A", oc.getFakulta(), "Chyba: vrácena špatná fakulta");
    }

    @org.junit.jupiter.api.Test
    void naplnAtributy_1() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("A", oc.fakulta, "Šptaně naplněný atribut fakulta");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_2() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("Josef", oc.jmeno, "Šptaně naplněný atribut jméno");
    } @org.junit.jupiter.api.Test
    void naplnAtributy_3() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("NOVÁK", oc.prijmeni, "Šptaně naplněný atribut přijmení");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_4() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("14", oc.rokNastupu, "Šptaně naplněný atribut rok nástupu");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_5() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals(TypStudia.BAKALARSKY, oc.getTypStudia(), "Chyba: Šptaně naplněný atribut typStuida");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_6() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("P", oc.formaStudia, "Chyba: Šptaně naplněný atribut formatStudia");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_7() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals("", oc.nepovinne, "Chyba: Šptaně naplněný atribut nepovine");
    }
    @org.junit.jupiter.api.Test
    void naplnAtributy_8() {
        oc.naplnAtributy("Novák, Josef, fav, 2014, b, p");
        assertEquals(true, oc.isPlatnyFormat(), "Chyba: Šptaně naplněný atribut platnyFormat");
    }
}
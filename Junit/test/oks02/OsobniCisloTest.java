package oks02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest {

    private OsobniCislo oc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Před každým testovacím případem");
        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, 0123, p, i");

    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Po každém testovacím případu");
        oc = null;
    }
    @org.junit.jupiter.api.Test

    void getOsobniCislo_1() {
        oc.vysledek = "A14B0123P";
        assertEquals("A14B0123P", oc.getOsobniCislo());
    }
    @org.junit.jupiter.api.Test
    void getOsobniCislo_2() {
        oc.vysledek = "A14b0123P";
        assertEquals("A14B013P", oc.getOsobniCislo());
    }




    @org.junit.jupiter.api.Test
    void osobniCislo() {
        OsobniCislo oc2 = new OsobniCislo("Novák, Josef, fav, 2014, b, 0123, p, i");
        assertEquals( "A14B0123PI", oc2.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_1() {
        oc = new OsobniCislo("A14B0123P");
        assertEquals("A14B0123P", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_2() {
        oc = new OsobniCislo("");
        assertEquals("??NEPLATNY?", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_3() {
        oc = new OsobniCislo("A14B0123Pi");
        assertEquals("A14B0123PI", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_4() {
        oc = new OsobniCislo("q14B0123P");
        assertEquals("?14B0123P", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_5() {
        oc = new OsobniCislo("AxxB0123P");
        assertEquals("A?B0123P", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_6() {
        oc = new OsobniCislo("A14B0123X");
        assertEquals("A14B0123?", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_7() {
        oc = new OsobniCislo("A14X0123P");
        assertEquals("A14NEPLATNY0123P", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_8() {
        oc.vysledek = null;
        assertEquals("", oc.vysledek);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_9() {
        assertEquals("Josef", oc.jmeno);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_11() {
        assertEquals("14", oc.rokNastupu);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_13() {
        assertEquals("0123", oc.poradoveCislo);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_14() {
        assertEquals("B", oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void OsobniCislo_15() {
        assertEquals("i", oc.nepovinne);
    }

    @org.junit.jupiter.api.Test
    void osobniCislo_16() {
        OsobniCislo oc2 = new OsobniCislo("Novák, Josef, fav, 2014, b, 0123, p, i");
        assertEquals( "A14B0123PI", oc2);
    }





    @org.junit.jupiter.api.Test
    void isPlatneOsobniCislo_1() {
        oc.platnyFormat = true;
        assertEquals(true,oc.isPlatneOsobniCislo());
    }
    @org.junit.jupiter.api.Test
    void isPlatneOsobniCislo_2() {
        oc.platnyFormat = false;
        assertEquals(false,oc.isPlatneOsobniCislo());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_1() {
        oc.vysledek = "A14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_2() {
        oc.vysledek = "I14B0123P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_3() {
        oc.vysledek = "E14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_4() {
        oc.vysledek = "S14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_5() {
        oc.vysledek = "P14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_6() {
        oc.vysledek = "K14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_7() {
        oc.vysledek = "F14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_8() {
        oc.vysledek = "R14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_9() {
        oc.vysledek = "Z14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_10() {
        oc.vysledek = "D14B0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_11() {
        oc.vysledek = "A1jB0123P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_12() {
        oc.vysledek = "A111B0123P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_13() {
        oc.vysledek = "A14N0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_14() {
        oc.vysledek = "A14P0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_15() {
        oc.vysledek = "A14M0123P";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_16() {
        oc.vysledek = "A14l0123P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_17() {
        oc.vysledek = "A14Bx123P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_18() {
        oc.vysledek = "A14Bxx23P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_19() {
        oc.vysledek = "A14BxxxxP";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_20() {
        oc.vysledek = "A14Bxxx7P";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_21() {
        oc.vysledek = "A14B0123K";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_22() {
        oc.vysledek = "A14B0123D";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_23() {
        oc.vysledek = "A14B0123L";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_24() {
        oc.vysledek = "A14B0123I";
        assertEquals(true, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void isPlatnyFormat_25() {
        oc.vysledek = "A14B0123u";
        assertEquals(false, oc.isPlatnyFormat());
    }
    @org.junit.jupiter.api.Test
    void getTypStudia_1() {
        oc.typStudia = TypStudia.BAKALARSKY;
        assertEquals(TypStudia.BAKALARSKY,oc.getTypStudia());
    }
    @org.junit.jupiter.api.Test
    void getTypStudia_2() {
        oc.typStudia = TypStudia.MAGISTERSKY;
        assertEquals(TypStudia.MAGISTERSKY,oc.getTypStudia());
    }
    @org.junit.jupiter.api.Test
    void getTypStudia_3() {
        oc.typStudia = TypStudia.NAVAZUJICI;
        assertEquals(TypStudia.NAVAZUJICI,oc.getTypStudia());
    }
    @org.junit.jupiter.api.Test
    void getTypStudia_4() {
        oc.typStudia = TypStudia.DOKTORSKY;
        assertEquals(TypStudia.DOKTORSKY,oc.getTypStudia());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_1() {
        oc.fakulta = "A";
        assertEquals("A", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_2() {
        oc.fakulta = "E";
        assertEquals("E", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_3() {
        oc.fakulta = "S";
        assertEquals("S", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_4() {
        oc.fakulta = "P";
        assertEquals("P", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_5() {
        oc.fakulta = "K";
        assertEquals("K", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_6() {
        oc.fakulta = "F";
        assertEquals("F", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_7() {
        oc.fakulta = "R";
        assertEquals("R", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_8() {
        oc.fakulta = "Z";
        assertEquals("Z", oc.getFakulta());
    }
    @org.junit.jupiter.api.Test
    void getFakulta_9() {
        oc.fakulta = "D";
        assertEquals("D", oc.getFakulta());
    }

    @org.junit.jupiter.api.Test
    void zpracujPrijmeni_1() {
        oc.zpracujPrijmeni("Novák");
        assertEquals("NOVÁK", oc.prijmeni);
    }
    @org.junit.jupiter.api.Test
    void zpracujPrijmeni_2() {
        oc.zpracujPrijmeni(null);
        Assertions.assertEquals(Konstanty.ZNAK_CHYBY, oc.prijmeni);
    }

    @org.junit.jupiter.api.Test
    void zpracujJmeno_1() {
        oc.zpracujJmeno("Josef");
        assertEquals("Josef", oc.jmeno);
    }
    @org.junit.jupiter.api.Test
    void zpracujJmeno_2() {
        oc.zpracujJmeno(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.jmeno);
    }@org.junit.jupiter.api.Test
    void zpracujJmeno_3() {
        oc.zpracujJmeno("josef");
        assertEquals("Josef", oc.jmeno);
    }

    @org.junit.jupiter.api.Test
    void zpracujRokNastupu_1() {
        oc.zpracujRokNastupu("2014");
        assertEquals("14",oc.rokNastupu);
    }
    @org.junit.jupiter.api.Test
    void zpracujRokNastupu_2() {
        oc.zpracujRokNastupu(null);
        assertEquals(Konstanty.ZNAK_CHYBY,oc.rokNastupu);
    }
    @org.junit.jupiter.api.Test
    void zpracujRokNastupu_3() {
        assertThrows(NumberFormatException.class,() -> oc.zpracujRokNastupu("aaaa"));
    }
    @org.junit.jupiter.api.Test
    void chybnyRokNastupu() {
        oc.chybnyRokNastupu();
        assertEquals(Konstanty.ZNAK_CHYBY, oc.rokNastupu);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_1() {
        oc.zpracujFakulta("FAV");
        assertEquals("A", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_2() {
        oc.zpracujFakulta("FEL");
        assertEquals("E", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_3() {
        oc.zpracujFakulta("FST");
        assertEquals("S", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_4() {
        oc.zpracujFakulta("FPE");
        assertEquals("P", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_5() {
        oc.zpracujFakulta("FEK");
        assertEquals("K", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_6() {
        oc.zpracujFakulta("FF");
        assertEquals("F", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_7() {
        oc.zpracujFakulta("FPR");
        assertEquals("R", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_8() {
        oc.zpracujFakulta("FZS");
        assertEquals("Z", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_9() {
        oc.zpracujFakulta("FDU");
        assertEquals("D", oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_10() {
        oc.zpracujFakulta("fhg");
        assertEquals(Konstanty.ZNAK_CHYBY, oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujFakulta_11() {
        oc.zpracujFakulta(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.fakulta);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_1() {
        oc.zpracujTypStudia(null);
        assertEquals(TypStudia.NEPLATNY, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_2() {
        oc.zpracujTypStudia("Odstrasujici");
        assertEquals(TypStudia.NEPLATNY, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_3() {
        oc.zpracujTypStudia("M");
        assertEquals(TypStudia.MAGISTERSKY, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_4() {
        oc.zpracujTypStudia("B");
        assertEquals(TypStudia.BAKALARSKY, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_5() {
        oc.zpracujTypStudia("P");
        assertEquals(TypStudia.DOKTORSKY, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujTypStudia_6() {
        oc.zpracujTypStudia("N");
        assertEquals(TypStudia.NAVAZUJICI, oc.typStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujFormaStudia_1() {
        oc.zpracujFormaStudia("P");
        assertEquals("P", oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujFormaStudia_2() {
        oc.zpracujFormaStudia("K");
        assertEquals("K", oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujFormaStudia_3() {
        oc.zpracujFormaStudia("D");
        assertEquals("D", oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujFormaStudia_4() {
        oc.zpracujFormaStudia(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujFormaStudia_5() {
        oc.zpracujFormaStudia("L");
        assertEquals(Konstanty.ZNAK_CHYBY, oc.formaStudia);
    }
    @org.junit.jupiter.api.Test
    void zpracujNepovinne_1() {
        oc.zpracujNepovinne(null);
        assertEquals(Konstanty.PRAZDNY, oc.nepovinne);
    }
    @org.junit.jupiter.api.Test
    void zpracujNepovinne_2() {
        oc.zpracujNepovinne("I");
        assertEquals("I", oc.nepovinne);
    }
    @org.junit.jupiter.api.Test
    void zpracujNepovinne_3() {
        oc.zpracujNepovinne("K");
        assertEquals(Konstanty.PRAZDNY, oc.nepovinne);
    }
}
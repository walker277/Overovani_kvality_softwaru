package oks03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest {
    @ParameterizedTest(name = "{index}: vysledek={0}; data:{1}")
    @MethodSource("oks03.PripravaDatovehoZdroje#listDvojiceBooleanString")
    void isPlatnyFormat(Boolean vysledek, String radkaDat) {
        PripravaDatovehoZdroje.listDvojiceBooleanString();
        OsobniCislo os = new OsobniCislo(radkaDat);

        assertEquals(vysledek, os.isPlatnyFormat());
    }
}
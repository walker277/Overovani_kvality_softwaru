package oks04;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class GeneratorTest {
  private Generator generator;
  private List<List<OsobniCislo>> seznamyTypuStudia;
  private List<OsobniCislo> testovaciData;
  ICteniDat cD;
  @BeforeEach
  public void setUp() {
    // příprava dat pro mock objekt
    testovaciData = TestovaciData.getTestovaciData();
    // příprava mock objektu
    cD = mock(ICteniDat.class);
    when(cD.nactiVsechnaOsobniCisla("")).thenReturn(testovaciData);
    generator = new Generator(cD);
    seznamyTypuStudia = generator.zpracovani("","fav");
  }
  @AfterEach
  public void tearDown() {
    // dodatečná kontrola, zda byl mock objekt očekávaně využit
    verify(cD).nactiVsechnaOsobniCisla("");
    verifyNoMoreInteractions(cD);
  }
  @org.junit.jupiter.api.Test
  void getSeznamTypuStudia_bakalari(){
    int delkaSeznamuBakalaruFav = generator.getSeznamTypuStudia(seznamyTypuStudia, TypStudia.BAKALARSKY).size();
    assertEquals(4, delkaSeznamuBakalaruFav, "Počet bakalářů nesedí");
  }
  @org.junit.jupiter.api.Test
  void getSeznamTypuStudia_navazujici(){
    int delkaSeznamuNavazujiciFav = generator.getSeznamTypuStudia(seznamyTypuStudia, TypStudia.NAVAZUJICI).size();
    assertEquals(14, delkaSeznamuNavazujiciFav, "Počet navazujícíh nesedí");
  }
  @org.junit.jupiter.api.Test
  void getSeznamTypuStudia_doktorandi(){
    int delkaSeznamuDoktorantiFav = generator.getSeznamTypuStudia(seznamyTypuStudia, TypStudia.DOKTORSKY).size();
    assertEquals(3, delkaSeznamuDoktorantiFav, "Počet doktorantů nesedí");
  }

  @org.junit.jupiter.api.Test
  void vytvorSeznamChybnychFormatu(){
    int delkaSeznamuChybnychFormatu = generator.vytvorSeznamChybnychFormatu(testovaciData, "A").size();
    assertEquals( 9, delkaSeznamuChybnychFormatu, "Počet prvků v seznamu chybných formatů nesedí");
  }
}

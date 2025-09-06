package oks03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PripravaDatovehoZdroje {

    private static List<String> nacteniSouboru(){
        String soubor = System.getProperty("datovy.zdroj.oks03");
        //String soubor = "priklady-oks-03.txt";
        List<String> seznamRadek = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(soubor));
            String radka;
            while( (radka = br.readLine()) != null){//cteme po radkach do konce souboru
                radka = radka.trim();//odstraneni mezer na zacatku a konci
                if( !radka.isEmpty() && !radka.startsWith("#")){
                    seznamRadek.add(radka);
                }
            }
            return seznamRadek;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static List<Object[]> listDvojiceBooleanString(){
        List<String> seznamRadek = new ArrayList<>();
        seznamRadek = nacteniSouboru();
        List<Object[]> generovano = new ArrayList<>();
        boolean platnost;
        String radka;
        for (int i = 0; i < seznamRadek.size(); i++){
            radka = seznamRadek.get(i);
            if(radka.startsWith("true")){
                platnost = Boolean.parseBoolean(radka.substring(0,4));
                radka = radka.replace("true;", "");
            }else{
                platnost = Boolean.parseBoolean(radka.substring(0,5));;
                radka = radka.replace("false;", "");
            }
            generovano.add( new Object[2]);
            generovano.get(i)[0] = platnost;
            generovano.get(i)[1] = radka;

        }
        return generovano;
    }
}

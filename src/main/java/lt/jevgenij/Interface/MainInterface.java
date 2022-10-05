package lt.jevgenij.Interface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainInterface {
    public static void main(String[] args) {

        Mobilus mobilus01 = new Mobilus("8-655-12312", "123-456-795-465");
        Taksofon taksofon01 = new Taksofon(0.4);
        System.out.println();
        System.out.println("-----Naujas mobilus -------");
        System.out.println();
        System.out.println(mobilus01);
        mobilus01.setMelodija("Jazz muzika");
        mobilus01.paskambink("8-645-45456");
        mobilus01.fotografok();
        mobilus01.fotografok();
        mobilus01.fotografok();
        mobilus01.fotografok();
        mobilus01.fotografok();
        System.out.println(mobilus01);
        System.out.println("-----Naujas taksofonas -------");
        System.out.println();
        taksofon01.paskambink("8-37-4656");
        taksofon01.paskambink("8-37-4656");
        taksofon01.setPinigulikutis(0.45);
        System.out.println(taksofon01);
        taksofon01.paskambink("8-37-4656");
        taksofon01.paskambink("8-37-4656");
        System.out.println(taksofon01);
        Telefonas mobilus02 = new Mobilus("6-55555-88774564", "645606456045");
        Telefonas taksofon02 = new Taksofon(0.55);
        List<Mobilus> mobiliakai = new ArrayList<>();
        // mobiliakai.add(mobilus02);
        // mobiliakai.add(taksofon02);
        mobiliakai.add(mobilus01);
        // mobiliakai.add(taksofon01);
        List<Telefonas> telefonai = new ArrayList<>();
        telefonai.add(mobilus02);
        telefonai.add(taksofon02);
        telefonai.add(taksofon01);
        telefonai.add(mobilus01);
        List<Object> objektai = new ArrayList<>();
        String kintString = "";
        Integer kintInt = 456;
        BigDecimal kintBD = BigDecimal.valueOf(1);
        objektai.add(kintString);
        objektai.add(kintInt);
        objektai.add(kintBD);
    }

}

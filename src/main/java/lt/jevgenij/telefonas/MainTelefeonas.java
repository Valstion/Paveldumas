package lt.jevgenij.telefonas;

public class MainTelefeonas {
    public static void main(String[] args) {
        Telefonas telefonas01 = new Telefonas("1122334");
        Telefonas telefonas02 = new Telefonas("11265445654564");
        Mobilus mobilus01 = new Mobilus("8-655-12312", "123-456-795-465");
        Taksofon taksofon01 = new Taksofon(0.4);
        telefonas01.setMelodija("Skamba VArpai");

        System.out.println(telefonas01);
        System.out.println();
        telefonas01.paskambink("8-5-2456789");
        telefonas01.setMelodija("ALALALAL Muzika");
        System.out.println(telefonas01);

        System.out.println();
        telefonas02.paskambink("8-5-248559");
        telefonas02.setMelodija("ALALALAL Muzika");
        System.out.println(telefonas02);
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
    }

}

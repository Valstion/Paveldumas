package lt.jevgenij.telefonas;

public class Mobilus extends Telefonas {
    private String simnr;
    private int nuotraukuSkaicius = 0;

    public Mobilus(String numeris, String simnr) {
        super(numeris);
        this.simnr = simnr;
    }

    public void fotografok() {
        nuotraukuSkaicius++;
    }

    public String getSimnr() {
        return simnr;
    }

    public int getNuotraukuSkaicius() {
        return nuotraukuSkaicius;
    }

    @Override
    public String toString() {
        return String.format("Mobilus {numeris: %s, simnr: %s, melodija: %s, nutraukuSk: %s }",
                super.getNumeris(),
                this.simnr,
                super.getMelodija(),
                this.nuotraukuSkaicius);
    }
}


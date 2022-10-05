package lt.jevgenij.Interface;

public class Mobilus implements Telefonas {
    private String simnr;
    private int nuotraukuSkaicius = 0;
private String numeris;
private String melodija;
    public Mobilus(String numeris, String simnr) {
        this.numeris = numeris;
        this.simnr = simnr;
    }

    public void fotografok() {
        nuotraukuSkaicius++;
    }

    public String getNumeris() {
        return numeris;
    }

    public String getSimnr() {
        return simnr;
    }

    public int getNuotraukuSkaicius() {
        return nuotraukuSkaicius;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    public String getMelodija() {
        return melodija;
    }

    @Override
    public void paskambink(String numeris) {

          System.out.printf("Abonementas %s skambina i %s%n", this.numeris, numeris);

    }

    @Override
    public String toString() {
        return String.format("Mobilus {numeris: %s, simnr: %s, melodija: %s, nutraukuSk: %s }",
                this.numeris,
                this.simnr,
                this.melodija,
                this.nuotraukuSkaicius);
    }
}

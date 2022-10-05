package lt.jevgenij.Abstrackt;

public abstract class Telefonas {
    private String numeris;
    private String melodija;

    public Telefonas(String numeris) {
        this.numeris = numeris;
    }

    // public void paskambink(String numeris) {
    //   System.out.printf("Abonementas %s skambina i %s%n", this.numeris, numeris);
//
    // }
    public abstract void paskambink(String numeris);

    public String getNumeris() {
        return numeris;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public String toString() {
        return "Telefonas{" +
                "numeris='" + numeris + '\'' +
                ", melodija='" + melodija + '\'' +
                '}';
    }
}

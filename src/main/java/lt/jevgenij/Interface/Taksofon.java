package lt.jevgenij.Interface;

import java.math.BigDecimal;

public class Taksofon implements Telefonas {
    private String numeris;
    private BigDecimal pinigulikutis;
    private final BigDecimal SkambucioKAINA = BigDecimal.valueOf(0.25);

    public Taksofon(Double pinigeliai) {

        this.numeris = "[numeris yra taksofonas]";
        this.pinigulikutis = BigDecimal.valueOf(pinigeliai);
    }

    public BigDecimal getPinigulikutis() {
        return pinigulikutis;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setPinigulikutis(Double pinigelis) {
        this.pinigulikutis = this.pinigulikutis.add(BigDecimal.valueOf(pinigelis));
        System.out.println(String.format("Pinigu likutis papyldytas %s, viso likutis tra %s", pinigelis, this.pinigulikutis));
    }


    @Override
    public void paskambink(String numeris) {
        if (pinigulikutis.compareTo(SkambucioKAINA) >= 0) {
            //super.paskambink(numeris);
            System.out.printf("Abonementas %s skambina i %s%n", this.numeris, numeris);

            this.pinigulikutis = pinigulikutis.subtract(SkambucioKAINA);
        } else {
            System.out.println("skambuciui nepakanka pinigeliu");
            System.out.println("Prasome papyldyti likuti");
        }


    }

    @Override
    public String toString() {
        return String.format("Taksofonas{pinigu likutis: %s, skambuciu kaina: %s}", this.pinigulikutis, this.SkambucioKAINA);

    }
}

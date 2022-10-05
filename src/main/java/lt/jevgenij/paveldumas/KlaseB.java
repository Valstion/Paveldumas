package lt.jevgenij.paveldumas;

public class KlaseB extends KlaseA{
    String stringA_B;
    int intB_B;

    public KlaseB(String stringA_a, int intB_a, String stringA_A, int intB_A) {
        super(stringA_A, intB_A);
        this.stringA_B = stringA_B;
        this.intB_B = intB_B;
        super.methodA_A();
    }


    public void methodA_B(){

        methodA_A();
        methodB_A();
        stringA_B = stringA_A;
        intB_B = intB_A;
    }

    public void methodB_B(){}

}

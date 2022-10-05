package lt.jevgenij.paveldumas;

public class Main {

    public static void main(String[] args) {

        KlaseA klaseA = new KlaseA("", 1);
        KlaseB klaseB = new KlaseB("", 2, "",12);
        KlaseC klaseC = new KlaseC("", 3);
        KlaseD klaseD = new KlaseD("", 4,"",14);

        //       klaseA
        //         |
        //      ---------
        //     |         |
        //  klaseB     klaseC
        //    |
        //  klaseD


        // is klasesA
        int kintInt = klaseA.intB_A;
        String kintString = klaseA.stringA_A;
        klaseA.methodA_A();
        klaseA.methodB_A();

        // is klasesB
        // pasiekiame visus kintamuosius ir metodus
        kintInt = klaseB.intB_A;
        kintInt = klaseB.intB_B;
        kintString = klaseB.stringA_A;
        kintString = klaseB.stringA_B;

        klaseB.methodA_A();
        klaseB.methodB_A();
        klaseB.methodA_B();
        klaseB.methodB_B();

        // is klasesC
        kintInt = klaseC.intB_A;
        kintInt = klaseC.intB_C;
        kintString = klaseC.stringA_A;
        kintString = klaseC.stringA_C;

        klaseC.methodA_A();
        klaseC.methodB_A();
        klaseC.methodA_C();
        klaseC.methodB_C();

        // is klasesD
        kintInt = klaseD.intB_A;
        kintInt = klaseD.intB_D;
        kintString = klaseD.stringA_A;
        kintString = klaseD.stringA_D;

        klaseD.methodA_A();
        klaseD.methodB_A();
        klaseD.methodA_D();
        klaseD.methodB_D();
klaseD.equals();

    }
}


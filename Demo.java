public class Demo {

    public void demo1() {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generic text");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
        System.out.println();
    }

    public void demo2() {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Non generic text");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value: " + str);
        System.out.println();

        //iOb = strOb;
        //v = (Integer) iOb.getOb();
    }

    public void demo3() {
        TwoGen<Integer, String> tgOb = new TwoGen<Integer, String>(88, "Generics");
        tgOb.showTypes();
        int v = tgOb.getOb1();
        System.out.println("T Value: " + v);
        String str = tgOb.getOb2();
        System.out.println("V Value: " + str);
    }
}

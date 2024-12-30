
public class Company {
    //constants for the design
    final static String LINE_TOP      = "╔═══════════════════════════════════════╗\n";
    final static String SIDE          = "║";
    final static String SEPERATOR     = "╟───────────────────────────────────────╢\n";
    final static String LINE_BOTTOM   = "╚═══════════════════════════════════════╝\n";
    final static String LOGO = "%s%s\t\t Machine \t\t%s\n%s".formatted(LINE_TOP,SIDE,SIDE,SEPERATOR);

    public static void main(String[] args) {
        Machine m1 = new Machine("Rubber Duck", 20.5, 150);
        Machine m2 = new Machine("Pizza Funghi", 180.78, 450);
        Machine m3 = new Machine("Pancake", 12.4, 210);
        Machine m4 = new Machine("Copper Ingot", 22.5, 850);
        Machine m5 = new Machine("T-Shirt", 13.2, 150);
        Machine m6 = new Machine("broken machine", 0.0, 0);
        System.out.println("Test machine 1");
        testMachine(m1);
        System.out.println("\n Test machine 2");
        testMachine(m2);
        System.out.println("\n Test machine 3");
        testMachine(m3);
        System.out.println("\n Test machine 4");
        testMachine(m4);
        System.out.println("\n Test machine 5");
        testMachine(m5);
        System.out.println("\n Test machine 6");
        testMachine(m6);

        System.out.println("\n Test factory 1");
        Factory myFactory = new Factory(m1,m2,m3,m4,m5,null,m6);
        myFactory.work(8);
        myFactory.printServiceCost();
        myFactory.work(-8);
        myFactory.printServiceCost();

        new Factory(null).work(1);
        Out.println(String.format("Factoy service costs of empty factory: %.2f", new Factory(null).serviceCosts()));

    }
    private static void testMachine(Machine m){
        m.print();
        m.run(1.0);
        m.print();
        m.run(0.1);
        m.run(0.02);
        m.print();
        m.run(-3);
        m.print();
    }
}

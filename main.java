import newPackage.JavaTestVSC;

public class main {
    public static void main(String[] args) {
        JavaTestVSC jTest = new JavaTestVSC("Some message!");
        JavaTestVSC jTest2 = new JavaTestVSC();

        jTest.setNumber(4);
        System.out.println("Get number from jTest: " + jTest.getNumber());
        jTest.printNumber();

        jTest2.printNumber();

        System.out.println("Hello there.");
    }
}
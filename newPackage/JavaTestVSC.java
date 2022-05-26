package newPackage;

public class JavaTestVSC {
    int number;
    
    public JavaTestVSC(String message) {
        System.out.println("This is inside the JavaTestVSC class constructor method");
        System.out.println("Your message is: ");
        System.out.println(message);
    }
    public JavaTestVSC() {
        System.out.println("This is inside the JavaTestVSC class constructor method");
        System.out.println("This one does not have a parameter");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void printNumber() {
        System.out.println("Your number is: " + number);
    }

}

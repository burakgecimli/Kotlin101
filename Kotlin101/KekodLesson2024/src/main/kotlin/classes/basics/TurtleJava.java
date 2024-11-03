package classes.basics;

public class TurtleJava {
    int feetCount = 4;
    String feetColor = "Brown";
    int headCount = 1;
    String headColor = "Brown";
    String shelterColor = "Green";
    int tailCount = 1;
    int age = 1;
    String name = "Tosbik";
    String sex = "Female";
    boolean isMarried = true;

    static {
        System.out.println("Static one.......");
    }

    {
        System.out.println("Static two.......");
    }


    public TurtleJava(int feetCount) {
        System.out.println("Constructor one.......");
        this.feetCount = feetCount;
    }

    public TurtleJava(int feetCount, String name) {
        System.out.println("Constructor two.......");
        this.feetCount = feetCount;
        this.name = name;
    }


    String makeASound() {
        return "htjtjjt";
    }

    void eatMeal() {

    }

    void walk() {

    }

    void swim() {

    }

    public static void main(String[] args) {
        TurtleJava turtleJava = new TurtleJava(4,"rsf");
        TurtleJava turtleJava1 = new TurtleJava(4);

    }
}

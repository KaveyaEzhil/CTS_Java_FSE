public class Test {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("First Message");
        l2.log("Second Message");

        if (l1 == l2) {
            System.out.println("Only one Logger object is created.");
        } else {
            System.out.println("Different Logger objects are created.");
        }
    }
}
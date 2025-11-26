public class empty {
    public static void main(String[] args) {
        String name = null;   // variable declared but has no value

        System.out.println("The value of name is: " + name);

        if (name == null) {
            System.out.println("Name is not assigned yet!");
        }
    }
}

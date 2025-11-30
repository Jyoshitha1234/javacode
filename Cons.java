public class Cons { 
    int x;
    int y;

    // Default Constructor
    Cons() {
        System.out.println("This is called default constructor");
    }

    // Parameterized Constructor
    Cons(int a, int b) {
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        x = a;
        y = b;
    }

    void Display() {
        System.out.println("value of x: " + x);
        System.out.println("value of y: " + y);
    }
}

class TestCons {
    public static void main(String[] args) {

        System.out.println("Calling parameterized constructor:");
        Cons obj = new Cons(10, 20);
System.out.println("Calling default constructor:");
        Cons obj1 = new Cons();
        obj1.x = 30;
        obj1.y = 40;
        obj1.Display();
    }
}

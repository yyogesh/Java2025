public class Main {
    public static void main(String[] args) {
        ClassName className = new ClassName(); // creating object
        // int x = 10;
        className.display(); // from object we are accessing display function.

        Human ajay = new Human("Ajay", 15, 1234);
        ajay.humanInfo();
        System.out.println("Person Name is: " + ajay.getName());

        Human ravi = new Human("Ravi", 20, 45567);
        ravi.humanInfo();
        String name = ravi.getName();
        System.out.println("Name is: " + name);


        Human shivani = new Human("Shivani", 12);
        System.out.println("Student Name is: " + shivani.getName());


        Book original = new Book("Java Programming");
       // original.title
        original.show();
        Book copy = new Book(original);
        copy.show();

        // Class
        // Object
        // Method
        // Constructor
        // Overloading Constructor
        // Copy Constructor
        // This keyword
        // Object creation
        // Static data member and method
        // Finalize()

        Circle smallCircle = new Circle(3);
        System.out.println("Area of small circle: " + smallCircle.area());

        Circle bigCircle = new Circle(6);
        System.out.println("Area of big circle: " + bigCircle.area());
        // bigCircle.pi
        System.out.println("Pi Value " + Circle.pi);

        FinalizeExample finalizeExample = new FinalizeExample();
        System.out.println("Before garbage:: " + finalizeExample.name);
        finalizeExample = null; // Eligible for garbage collection;
        System.gc(); // Request garbage collection
        // System.out.println("After garbage:: " + finalizeExample.name);
    }
}

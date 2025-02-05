public class Circle {
    int radius;
    static double pi = 3.14;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return  pi * radius;
    }

    static void valueOfPI() {
        System.out.println("Pi Value is " + pi);
    }
}

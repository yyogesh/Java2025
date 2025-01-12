public class JavaOperatorsProgram {
    public static void calculateDiscount() {
        double price = 100.0;
        double discountPercent = 20.0;
        double finalPrice = price - (price * discountPercent / 100);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println();
    }

    public static void checkNumberProperties() {
        int number = 15;
        System.out.println("Number: " + number);
        System.out.println("Is even? " + (number % 2 == 0));
        System.out.println("Is positive? " + (number > 0));
        System.out.println("Is multiple of 3 and 5? " +
                (number % 3 == 0 && number % 5 == 0));
        System.out.println();
    }

    public static void temperatureConverter() {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature Conversion:");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}

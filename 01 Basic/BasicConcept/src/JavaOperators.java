public class JavaOperators {

    public static void ArithmeticOperators() {
        System.out.println("1. ARITHMETIC OPERATORS");
        int a =10, b =3;
       // int b = 3;
        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("Addition: " + (a + b)); // Addition103 // Addition13
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--b));
        System.out.println();
    }


    public static void AssignmentOperators() {
        System.out.println("2. ASSIGNMENT OPERATORS");
        int x = 10;  // Simple assignment
        System.out.println("Initial x: " + x);
        x += 5;      // Add and assign
        System.out.println("After x += 5: " + x);
        x -= 3;      // Subtract and assign
        System.out.println("After x -= 3: " + x);
        x *= 2;      // Multiply and assign
        System.out.println("After x *= 2: " + x);
        x /= 4;      // Divide and assign
        System.out.println("After x /= 4: " + x);
        x %= 3;      // Modulus and assign
        System.out.println("After x %= 3: " + x);
        System.out.println();
    }

    public static void comparisonOperators() {
        System.out.println("3. COMPARISON OPERATORS");
        int p = 10, q = 20;
        System.out.println("Numbers: p = " + p + ", q = " + q);
        System.out.println("Equal to: " + (p == q));            // false
        System.out.println("Not equal to: " + (p != q));        // true
        System.out.println("Greater than: " + (p > q));         // false
        System.out.println("Less than: " + (p < q));            // true
        System.out.println("Greater than or equal: " + (p >= q));// false
        System.out.println("Less than or equal: " + (p <= q));   // true
        System.out.println();
    }

    public static void logicalOperators() {
        System.out.println("4. LOGICAL OPERATORS");
        boolean condition1 = true;
        boolean condition2 = false;

        int x = 10;
        int y = 20;

        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical AND: " + (x > 15 && y < 25));
        // T T => T
        // T F => F
        // F T => F
        // F F => F
        System.out.println("Logical OR: " + (condition1 || condition2));
        // T T => T
        // T F => T
        // F T => T
        // F F => F
        System.out.println("Logical NOT: " + (!condition1));
        System.out.println();
    }

    public static void bitwiseOperators() {
        System.out.println("5. BITWISE OPERATORS");
        int num1 = 5; // 101 in binary
        int num2 = 3;  // 011 in binary
        // 7 ==> 111

        System.out.println("Numbers: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Bitwise AND: " + (num1 & num2));
        // 101
        // 011
        // 001
        System.out.println("Bitwise OR: " + (num1 | num2));
        // 101
        // 011
        // 111
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
    }

    public static void ternaryOperator() {
        System.out.println("6. TERNARY OPERATOR");
        int age = 20;
        System.out.println("Age: " + age);
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);
        System.out.println((age >= 18) ? "Adult" : "Minor");
        System.out.println();
    }

    public static void instanceOfOperators() {
        String st="Hello";
        System.out.println("Is str instance of String? " + (st instanceof String));
        System.out.println();
    }

    public static void operatorPrecedence() {
        int result = 10 + 20 * 30;
        System.out.println("10 + 20 * 30 = " + result);

        result = (10 + 20) * 30;
        System.out.println("(10 + 20) * 30 = " + result);
        System.out.println();
    }
}

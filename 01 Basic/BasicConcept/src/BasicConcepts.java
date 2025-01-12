public class BasicConcepts {
    public static void main(String[] args) {
        String studentName = "ABC";
        char division = 'a';
        int age = 20;
        double height = 5.9;
        boolean isStudent = true;

        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Division: " + division);
        System.out.println("Is Student: " + isStudent);

        System.out.println("**************************");
        JavaOperators.ArithmeticOperators();
        JavaOperators.AssignmentOperators();
        JavaOperators.comparisonOperators();
        JavaOperators.logicalOperators();
        JavaOperators.bitwiseOperators();
        JavaOperators.ternaryOperator();
        JavaOperators.instanceOfOperators();
        JavaOperators.operatorPrecedence();

        System.out.println("********** Programs ****************");
        JavaOperatorsProgram.calculateDiscount();
        JavaOperatorsProgram.checkNumberProperties();
        JavaOperatorsProgram.temperatureConverter();

        System.out.println("********** Console input  ****************");
        ConsoleInputExamples.scannerInputDemo();
        // ConsoleInputExamples.consoleDemo();
    }
}

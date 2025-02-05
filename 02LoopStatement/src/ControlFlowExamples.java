import java.util.Random;
import java.util.Scanner;

public class ControlFlowExamples {

    public static String validateUserAge(int age) {
        if(age < 0) {
            return "Invalid age";
        } else if(age < 18) {
            return "Minor";
        } else if(age < 65) {
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }

    public static void printUserAge(int age) {
        if(age < 0) {
            System.out.println("Invalid age");
        }
        if(age < 18) {
            System.out.println("Minor");
        }
        if(age < 65) {
            System.out.println("Adult");
        }

        System.out.println("Senior Citizen");
    }

    public static void printUserAge1(int age) {
        if(age < 0) {
            System.out.println("Invalid age");
        }
        if(age < 18) {
            System.out.println("Minor");
        }
        if(age < 65) {
            if(age < 60) {
                System.out.println("a Adult");
            } else {
                System.out.println("b Adult");
            }
        }
        System.out.println("Senior Citizen");
    }

    public static boolean processTransaction(double amount, boolean isAuthenticated, double balance) {
        if (isAuthenticated) {
            if( amount > 0) {
              if(balance >= amount) {
                  return true;
              } else {
                  System.out.println("Insufficient balance");
              }
            } else {
                System.out.println("Invalid amount");
            }
        }  else {
            System.out.println("Authentication required");
        }

        return false;
    }


    public static void printNumber(int n) {
        System.out.println("Printing numbers from 1 to " + n + ":");
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
           // sum = sum + i;
        }
        return sum;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number /10;
            System.out.println("number " +  number);
            count++;
        }
        return count;
    }


    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;

        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("You took " + attempts + " attempts.");
            }

        } while (guess != numberToGuess);

        scanner.close();
    }



//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }

    public static void main(String[] args) {
       String user1 =  validateUserAge(40);
       // String user2 =  validateUserAge(70);
       // String user3 =  validateUserAge(10);

        System.out.println(user1);
        System.out.println(validateUserAge(70));
        System.out.println(validateUserAge(10));
//        sum(10, 5);
//        sum(50, 5);
//        sum(8, 9);

        boolean success = processTransaction(100.0, true, 500.0);
        System.out.println("Transaction status: " + success);

        printNumber(10);

        System.out.println(calculateSum(432));
        System.out.println(countDigits(123456));

        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);

        System.out.println("****************");
        int j = 10;
        while (j < 5) {
            System.out.println(j);;
            j++;
        }

        playGame();
    }
}

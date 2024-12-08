import java.util.Scanner;

class FactorialChecker {
    public boolean isFactorial(int num) {
        int fact = 1, i = 1;
        while (fact < num) {
            fact *= ++i;
        }
        return fact == num;
    }
}

public class FactorialRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorialChecker checker = new FactorialChecker();

        System.out.print("Enter lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = scanner.nextInt();

        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (checker.isFactorial(i)) {
                count++;
            }
        }
        System.out.println("Factorial numbers count: " + count);
    }
}
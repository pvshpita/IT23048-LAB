import java.util.Scanner;

class FactorionChecker {
  
    public boolean isFactorion(int n) {
        int sum = 0, originalNumber = n;

        while (n > 0) {
            int dig = n % 10;
            int fac = 1;

            for (int j = 1; j <= dig; ++j) {
                fac *= j;
            }

            sum += fac;
            n /= 10;
        }

        return sum == originalNumber;
    }
}

public class FactorionCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FactorionChecker checker = new FactorionChecker();

        int start = input.nextInt();
        int end = input.nextInt();

        int cnt = 0;

        for (int i = start; i <= end; ++i) {
            if (checker.isFactorion(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);

        input.close();
    }
}

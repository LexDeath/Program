import java.util.Scanner;

public class Example {
    static int digitsCount(int number) {
        int result = 0;
        for (; number > 0; result++) {
            number /= 10;
        }
        return result;
    }

    static int[] makeArray(int number) {
        int digitsCount = digitsCount(number);
        int[] digits = new int[digitsCount];
        for (int i = 0; number > 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] digits = makeArray(number);

        for (int i = 0; i < digits.length; i++) {
            int c = 0;
            for (int k = 0; k < digits.length; k++) {
                if (digits[i] == digits[k]) {
                    c++;
                }
            }

            if (c == 3) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}

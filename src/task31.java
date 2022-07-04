public class task31 {
    public static void main(String[] args) {

        for (int c = 100; c > 99 && c < 1000; c++) {
            int a, b, d;
            a = c % 10;
            b = c / 10 % 10;
            d = c / 100;
            if (a % 2 == 0 && b % 2 == 0 && d % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,a,b,c;
        x = scanner.nextInt();

        a = x % 10;
        b = x - a + 10;
        c = x - a;

        if (x % 2 > 0) {
            System.out.println("Down to" + " " + c);
        } else {
            System.out.println("Up to"+" "+b);
        }

    }
}

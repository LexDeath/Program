import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,a,b,c;
        x= scanner.nextInt();
        a = x % 10;
        b = x / 10 % 10;
        c = x / 100;

        if ((a + b + c) % 2 > 0 && (a*b*c) % 2 > 0) {
            System.out.println("Не дважды четное");
        } else {
            System.out.println("Дважды четное");
        }
    }
}

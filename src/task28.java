import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        int x, b;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        System.out.println("От");
        b = 0 - x;
        while (b < x -1) {
            b++;
            System.out.println(b + "");
        }
        System.out.println("и до");
    }
}

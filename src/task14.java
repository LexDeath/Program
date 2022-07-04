import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        System.out.println("Введите секунды");
        Scanner scanner = new Scanner(System.in);
        int x,i,j;

        x= scanner.nextInt();

        i = x / 60;
        j = x % 60;

        if (x<360) {
            System.out.println("Минут" + " " + i);
            System.out.println("Секунд" + " " + j);
        } else {
            System.out.println("Расчет не производиться");
        }


    }
}

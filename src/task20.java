import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x= scanner.nextInt();

        if (x>2 && x<6) {
            System.out.println("Spring");
        }else if (x>5 && x < 9) {
            System.out.println("Summer");
        }else if (x>8 && x<12) {
            System.out.println("Autumn");
        } else if (x>0 && x<3 || x==12) {
            System.out.println("Winter");
        } else {
            System.out.println("INCORRECT MONTH");
        }

    }
}

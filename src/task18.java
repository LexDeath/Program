import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,a,b,c;
        x= scanner.nextInt();
        a = x % 10;
        b = x / 10 % 10;
        c = x / 100;

        if ((a<b) &&(b<c)) {
            System.out.println("Опускающее");
        } else {
            System.out.println("Не опускающее");
        }
    }
}

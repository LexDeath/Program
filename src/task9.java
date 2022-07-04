import java.util.Scanner;

class task9 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x, a, b, c;

        x = scanner.nextInt();

        a=x/100;
        b=(x%100)/10;
        c=x%10;

        System.out.println(c + " " + b + " " + a);
    }
}
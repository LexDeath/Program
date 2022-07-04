import java.util.Scanner;

class task10{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x, a, b;

        x = scanner.nextInt();

        a=x/10;
        b=x%10;

        System.out.println(a+b);

    }
}
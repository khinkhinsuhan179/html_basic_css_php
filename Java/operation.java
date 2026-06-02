import java.util.Scanner;

public class operation {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = myObj.nextInt();
        System.out.print("Input second number: ");
        int y = myObj.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " x " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " mod " + y + " = " + (x % y));

        myObj.close();
    }
}
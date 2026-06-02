import java.util.Scanner;

public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.print("Input first number:");
    int x = myObj.nextInt();
    System.out.print("Input second number:");
    int y = myObj.nextInt();
    System.out.println("1 for +, 2 for -, 3 for *, 4 for /");
    int b = myObj.nextInt();
    if (b == 1) {
        System.out.println(x + y);
    } else if (b == 2) {
        System.out.println(x - y);
    }

    System.out.println(x + "+" + y + "=" + (x + y));
    System.out.println(x + "-" + y + "=" + (x - y));
    myObj.close();

}

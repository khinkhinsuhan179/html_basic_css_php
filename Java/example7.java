import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i <= 10) {
            System.out.println("Iteration: " + i);
            i++;
        }
        scanner.close();
    }
}
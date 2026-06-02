import java.util.Scanner;

public class day4 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age, school name");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        myObj.nextLine();

        String schoolname = myObj.nextLine();
        System.out.println("Name:" + name);
        System.out.println("Age::" + age);
        System.out.println("Schoolname:" + schoolname);

    }
}
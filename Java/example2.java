import java.util.Scanner;

class example2{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input name, age and school name");
        String input= myObj.nextLine();

        int age = myObj.nextInt();

        String schoolname = myObj.nextLine();

        System.out.println("Name is " + input);
        System.out.println("Age is" + age );
        System.out.println("Schoolname is" + schoolname);
    }

}
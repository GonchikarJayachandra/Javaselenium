import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = scanner.nextInt();

        System.out.println("Enter your Name:");

        String name = scanner.next();

        System.out.println("Enter your Pincode:");
        int Pincode = scanner.nextInt();

        System.out.println("Hi" + name + "you are" + age + "years old");


    }
}

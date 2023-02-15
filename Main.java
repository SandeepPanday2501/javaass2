import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in); // for taking inputs
        System.out.println("Enter Your Name: ");
        String name = scannerObj.nextLine();
        System.out.println("Your name is " + name);

    }
}
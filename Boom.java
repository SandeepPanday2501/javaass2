import java.util.Scanner;

public class Boom {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("What is the total number of employees?");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("What is the name of supervisor?");
        String name = obj1.nextLine();
        System.out.println("How many times the Nuclear waste is removed from the core?");
        int b = obj.nextInt();
        System.out.println("What is the total weight of the waste(Kg) produced every 1 week?");
        float c = obj.nextInt();
        System.out.println("Is Electric Motor being replaced every 18 days?(y/n)");
        char f = obj.next().charAt(0);
        System.out.println("What is the core average temperature (celsius)of the Nuclear Reactor?");
        double d = obj.nextInt();
        double e = (d + 273.15);
        System.out.println("The total number of employees is " + a + ".");
        System.out.println("The name of the supervisor is " + name + ".");
        System.out.println("The Nuclear waste is removed from the core " + b + " times.");
        System.out.println("The total weight of the waste produced every 1 week is " + c + ".");
        if (f == 'y' || f != 'Y') {
            System.out.println("The Electric Motor being is replaced every 18 days.");
        } else if (f == 'n' || f != 'N') {
            System.out.println("The Electric Motor being is not replaced every 18 days.");
        } else {
            System.out.println("Please enter a valid input(y/n)!");
        }
        System.out.println(
                "The core average temperature of the Nuclear Reactor is : \n In Celcius " + d + "\n In Kelvin " + e);
    }
}
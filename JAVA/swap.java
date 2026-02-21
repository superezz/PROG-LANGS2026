
import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;


        System.out.println("Swapping Done");
        System.out.println("The value of A is: "+a);
        System.out.println("The value of B is: "+b);

        input.close();
    }
}

import java.util.Scanner;

class allArith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmatic Operations Viewer\n");
        System.out.print("Please Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Please Enter your second number: ");
        int b = input.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a*b;
        int div = a/b;

        System.out.println("Addition of Two numbers "+ add);
        System.out.println("The Substraction of two number is: "+sub);
        System.out.println("The Multiplication of two number is: "+mul);
        System.out.println("The Division of two number is: "+div);

        input.close();
    }
}

import java.util.Scanner;

class GreatOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int num1 = input.nextInt();
        System.out.print("Now,Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Now,Enter your third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1>=num3) {
            System.out.println(num1+" number is the Greatest number");
        }else if (num2>=num3) {
            System.out.println(num2+" number is the Greatest number ");
        } else{
            System.out.println(num3+" number is the Greatest number");
        }

        input.close();
    }
}

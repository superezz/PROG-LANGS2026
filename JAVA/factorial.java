import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        long fact = Factoral(num);
        System.out.println("The Factorial of number "+num+ " is "+fact);

        input.close();
    }

    public static long Factoral(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}

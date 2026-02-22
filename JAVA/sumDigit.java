import java.util.Scanner;

class sumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        int sum = SumDigit(num);
        System.out.println("Sum of digit "+num+" is "+sum);

        input.close();
    }

    public static int SumDigit(int num){
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

}

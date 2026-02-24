import java.util.Scanner;

class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese , Enter your number: ");
        int num = input.nextInt();
        int  reverse = reverse(num);
        System.out.println("The Reverse number is: "+reverse);

        input.close();
    }
    public static int reverse(int num){
        int newNum = 0;
        while (num>0) {
            int digit = num % 10;
            newNum = newNum*10+digit;
            num /=10;
        }
        return newNum;
    }
}

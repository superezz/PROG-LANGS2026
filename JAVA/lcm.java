import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number First number : ");
        int num1 = input.nextInt();
        System.out.print("Now , Enter your second number: ");
        int num2 = input.nextInt();
        int Lcm = LCM(num1,num2);
        System.out.println("LCM of the number is "+Lcm);

        input.close();
    }

    public static int LCM(int num1, int num2){
        int i = 1;
        while (i<=num2) {
            int factor = num1*i;
            if (factor%num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }
}

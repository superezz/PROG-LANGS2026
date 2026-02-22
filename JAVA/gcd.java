import java.util.Scanner;

class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese ,Enter your first number: ");
        int firstnum = input.nextInt();
        System.out.print("Now, Enter your second number: ");
        int secnum = input.nextInt();
        int GCD = GCD(firstnum, secnum);
        System.out.println("Greatest Common Divisor of numbers is "+GCD);


        input.close();
    }
    public static int GCD(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i<=least) {
            if (num1%i == 0 && num2%i ==0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if ( num1<num2) {
            return num1;
        }else{
            return num2;
        } 
    }
    
}

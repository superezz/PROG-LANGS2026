import java.util.Scanner;

class OddsumNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your number: ");
        int num = input.nextInt();
        int sum = sumOFoddnum(num);
        System.out.println("Odd sum till "+num+" is "+sum);

        input.close();
    }

    public static int sumOFoddnum(int num){
        int sum = 0;
        int i = 1;
        while (i<=num) {
            sum += i;
            // sum = sum + i;
            i +=2;
        }
        return sum;
    }
}

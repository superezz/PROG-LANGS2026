import java.util.Scanner;

class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please,Enter your number: ");
        int num = input.nextInt();
        boolean prime = prime(num);
        if (prime) {
            System.out.println("Your number is prime");
        }else{
            System.out.println("Your number is Not Prime");
        }

        input.close();
    }

    public static boolean prime(int num){
        int i = 2;
        while (i<num) {
            if (num%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}

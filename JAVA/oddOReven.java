import java.util.Scanner;

class oddOReven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter your number: ");
        int num = input.nextInt();

        if(num%2 == 1){
            System.out.println("You have Entered a Odd number");
        }else{
            System.out.println("You have entered an Even number");
        }

        input.close();
    }
}

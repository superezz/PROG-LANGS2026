import java.util.Scanner;

class numIdentifier {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nPlease Enter the number: ");
    int num = input.nextInt();

    if (num > 0) {
        System.out.println("Your number is Positive");
    }else if(num == 0){
        System.out.println("Your number is Zero");

    } else{
        System.out.println("Your number is negative");
    }


    input.close();
}    
}

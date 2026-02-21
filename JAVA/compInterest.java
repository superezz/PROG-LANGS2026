import java.util.Scanner;

class compInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Principle Amount: ");
        int PrincipleAmt = input.nextInt();
        System.out.print("Plese Tell me your Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, Tell me for how many years are you borrowed: ");
        int Tenure = input.nextInt();

        double CompoundInterest = PrincipleAmt * Math.pow((1+rate/100),Tenure);

        System.out.println("The Total Compound Interest is: "+CompoundInterest);

        input.close();
    }
}

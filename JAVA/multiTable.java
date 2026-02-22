import java.util.Scanner;

class multiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        
        MultiTable(num);


        input.close();
    }

    public static void MultiTable(int num){
        int i = 1;
        while (i<=10) {
            System.out.println(num+ " X "+i +" = " + num*i);
            i++;
        }
    }


}

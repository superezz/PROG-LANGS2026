import java.util.Scanner;

class IsShortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nHii, Enter your name: ");
        String name = input.nextLine();
        System.out.println("\nHi "+name+"\nThis is a Shorting Machine\nHere we will short the array\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean IaInc = IsIncreasing(numArr);
        boolean IsDec = IsDecreasing(numArr); 
        
        if (IsDec || IaInc) {
            System.out.println("Your Array is Shorted");
        }else{
            System.out.println("Your Array is not Shorted");
        }
    }

    public static boolean IsDecreasing(int[]numArr){
        int i = 1;
        while (i<numArr.length) {
            if (numArr[i]>numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean IsIncreasing(int[] numArr){
        int i = 1;
        while (i<numArr.length) {
            if (numArr[i]<numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

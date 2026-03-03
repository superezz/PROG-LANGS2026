import java.util.Scanner;

class OccurencesArray {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numArr = ArrayUtility.inputArray();
    System.out.print("Now Enter the number you want to find: ");
    int num = input.nextInt();
    int occurence = noOfOccurence(numArr, num);
    System.out.println("Your number was found "+occurence+" times in the array");
   }

   public static int noOfOccurence(int[] numArr, int num){
    int occ = 0;
    int i = 0;
    while (i<numArr.length) {
        if (numArr[i] == num) {
            occ++;
        }
        i++;
    }
    return occ;
   }
}

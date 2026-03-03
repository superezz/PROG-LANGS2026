import java.util.Arrays;
import java.util.Scanner;

class SortedArray {
    public static void main(String[] args) {
        int[] numArray = inputArray(); 
        int[] shortArray = shortArray(numArray);
        System.out.println(Arrays.toString(shortArray));
    }



      public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[] shortArray(int[] numArray){
        int n = numArray.length;
        int i = 0;
        int j = n-1;
        int[] newArray = new int[n];
        for(int k = j; k >= 0; k--){

            int Sqr_i = numArray[i]*numArray[i];
            int Sqr_j = numArray[j]*numArray[j];
            
            if (Sqr_i>Sqr_j) {
                newArray[k] = Sqr_i;
                i++;
            }else{
                newArray[k] = Sqr_j;
                j--;
            }

        }
        return newArray;
    }

  
}

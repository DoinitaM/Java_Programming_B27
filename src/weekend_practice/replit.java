package weekend_practice;

import java.util.Arrays;
import java.util.Scanner;

public class replit {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }


    public static int[] merge(int[] a,int[] b) {
  /*  int[] merge;

   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a, b));
*/
       // public static int[] merge(int[] a,int[] b){
           /* int size = (a.length + b.length);
            int count = 0;
            int[] newArray = new int[size];
            for (int i = 0; i < a.length; i++) {
                newArray[count++] = a[i];
            }
            for (int j = 0; j < b.length; j++) {
                newArray[count++] = b[j];
            }

            return newArray;

*/
    public static int[] merge(int[] a,int[] b) {

        int size = (a.length + b.length);
        int count = 0;
        int[] newArray = new int[size];
        for (int i = 0; i < a.length; i++) {
            newArray[count++] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            newArray[count++] = b[j];
        }

        return newArray;


    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }

}


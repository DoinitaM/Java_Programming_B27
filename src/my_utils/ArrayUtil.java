package my_utils;

public class ArrayUtil {
    /*
    -----------------------------------------------------------------------------------------
Work on these practices in a seperate file or direcly in the ArrayUtil class we made in our util package. If you do them in a seperate file copy & paste the final version of the method into the Util class

-----------------------------------------------------------------------------------------

     */

    /*

    Min Number

    create a method that will accept an int array and return the smallest number from the array

    -----------------------------------------------------------------------------------------
    */
    public static int min(int... arr) {  /// int[] arr is the same as int  ... arr  [] == ...
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;

            }
        }
        return min;
    }

    /*
Max Number

create a method that will accept an int array and return the biggest number from the array

     */
    public static int max(int... arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;

            }
        }
        return max;
    }

    /*
    Contains

    create a method that will accept an int array and an int number. Check and return if the given number is in the array.

     */
    public static boolean contains(int[] arr, int num) {
        for (int each : arr) {
            if (each == num) {
                return true;
            }
        }
        return false;
    }

    /*
    IndexOf

    create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index

     */
    //if you wanted to use var args : public static int indexOf(int num, int ...arr){
    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) { // every number from the array whith the number we are look for
                return i;
            }

        }

        return -1;
    }

    public static int indexOf(int[] arr, int
            target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) { // every number from the array whith the number we are look for
                return i;


            }

        }
        return -1;
    }
/*
Add Element

create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one

 */
    public static String[] addElements(String[] arr, String element){

        String[] newArr = new String[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element; // add new element to the end of the new array

        return newArr;

    }
    /*
    Add Element

overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.

Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}

output > [today, is, monday, no, softskills, today]
     */
    public static String[] addElement(String[] original, String[] other){

        String[] merged = new String[original.length + other.length];

        for(int i = 0; i< original.length; i++){ // coppy the element from the original array to the new array
         merged[i] = original[i];
        }
        //option : int i = 0; j = original.length; j ++
        for(int i = 0; i < other.length; i++){ // read the elements from the other array and store into merged array
            merged[original.length+i] = other[i];

        }
       //[today, is, monday, no, softskills, today];
        return merged;
    }




}





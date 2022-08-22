package day23_array;

public class EvenOrOdd {
    public static void main(String[] args) {

        int[] nums = {3, 5, 7, 12, 12, 5, 4, 2 };
        int even = 0, odd = 0;

        for(int each: nums){
            if(each%2 ==0){
                even++; // print( each + is even)
            }else{
                odd++;
            }
        }

    }
}

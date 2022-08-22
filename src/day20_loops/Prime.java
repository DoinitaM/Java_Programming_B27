package day20_loops;

public class Prime {
    public static void main(String[] args) {
        /*
        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime
         */
        int num = 11;
        boolean isPrime = true;

        // 2 because num cab be divided by 1
        for (int i = 2; i < num; i++){ // we can put i<num/2;

            if (num % i == 0) {
                isPrime = false;         //!isPrime;
            }

    }
        System.out.println( isPrime? "Prime" : "not prime");


}
}
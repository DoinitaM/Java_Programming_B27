package day21_nested_loop;

import java.util.Scanner;

public class Dublicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count = 0;
        String duplicat = "";

        for (int i = 0; i < str.length(); i++) { //4
            count = 0;


                for (int j = 0; j < str.length(); j++) { //4

                    if (str.charAt(i) == str.charAt(j))  {
                        count++;
                        duplicat = "" + str.charAt(i);

                }
            }

        }
        if (count > 1) {
            System.out.println(duplicat + " - " + count);
        }
        }
}

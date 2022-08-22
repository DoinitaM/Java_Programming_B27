package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        //counting how many times hi is in String
        String s = " afhiknaskjhillmdhimmhi";

        //approach 1 : whille loop and delete the first occurence each time
        int count = 0;
        while(s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi","");//replace first occurence

        }

        System.out.println(count);



        String s2 = "bhdhijhvdhiddhihi";
        int cont2 = 0;


        for(int i =0; i< s2.length()-1; i++) {
            if (s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i') {
                cont2++;
            }
        }
        System.out.println(cont2);

//
        String s3 = "bhdhijhvdhiddhihi";
        int cont3 = 0;


        for(int i =0; i< s3.length()-1; i++) {
            if (s3.substring(i,i+2).equals("hi")) {
                cont3++;
            }
        }
        System.out.println(cont3);
    }
}

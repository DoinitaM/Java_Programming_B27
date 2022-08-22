package day23_array;

public class Average {
    public static void main(String[] args) {

        double[] prices = {13.99, 19.14, 3.112, 65.786};
      double sum = 0;
        for(double eachprice : prices){
            sum+=eachprice;
        }
        System.out.println(sum / prices.length);
        System.out.println("sum= " + sum);


        
        /*
         double sum = 0;
        for(int i = 0; i< prices. length; i++){
            sum+=prices[i];
        }
        System.out.println(sum / prices.length);
      
         */
    }
}

package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browsers = "chrome";

        switch(browsers){
            case"chrome"://its different cases but will run the same answer
            case"CHROME":
            case"Chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("opening in safari");
                break;

            default:
                System.out.println("opening in chrome by default");

        }





    }
}

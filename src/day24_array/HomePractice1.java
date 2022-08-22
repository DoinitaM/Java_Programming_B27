package day24_array;

public class HomePractice1 {
    public static void main(String[] args) {
        /*
        Given two values:
app = "google"
& zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1"
deploy the app to each zone. Each zone is seperated by the # character
Ex:
Deploying etsy to us-east-1...
Deployment completed for us-east-1
Deploying etsy to us-west-1...
Deployment completed for us-west-1
etc...
         */
        String app = "google";
        String s = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
        String[] zone = s.split("#");

        for(String deploying :zone){
            System.out.println("Deploying " + app + " to " + deploying);
            System.out.println("Deployment completed for " + deploying);
        }
    }
}

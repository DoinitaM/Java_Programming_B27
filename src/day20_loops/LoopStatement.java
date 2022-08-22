package day20_loops;

public class LoopStatement {
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            if(i==2){
              //  break;
            }
            System.out.print(i+ " ");
        }
        System.out.println();


        for(int i = 1; i <=5; i++){
            if(i==2){
                 break;
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        for(int i = 1; i <=5; i++){
            if(i==2){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        for(int i = 1; i <=100; i++){
            if(i%2==0){
                continue; //50 will miss from console because continue omite the(i%2==0)or that is in the paranthese
            }
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}

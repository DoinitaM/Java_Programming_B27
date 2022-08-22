package day12_switch;

public class SwitchExemple {
    public static void main(String[] args) {

        int day = 4; // number from 1 to 7, where 1 is monday and 7 is sunday

        switch (day){
            default: // act like else, if  o other case matches the default case will run// we can put atb beggining aor middle or at the end
                System.out.println("Not a valid day number");
                break;
            case 1: // if the day == 1 //
                System.out.println("Monday");
                break;// the brak is shows what we dome and will print just what we need, with out break will be printet all intil the data we choose or all after
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


        }



    }
}

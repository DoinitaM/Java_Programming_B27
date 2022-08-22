package day07_scanner;

public class CastingExemple {
    public static void main(String[] args) {
        float averageScore = 20.5F;//20.5 IS DOUBLE BY DEFAULT, WE ARE TRYING TO STORE A DOUBLE TO A FLOAT, WICH is not ok because float is smaller but we can add F
        byte num1 = (byte)averageScore;//this is assignet to other variables
        short num2 = (short)averageScore;
        int num3 = (int)averageScore;
        long num4 = (long) averageScore;
        float num5 = averageScore;
        double num6 = averageScore;

        System.out.println(num1+"\n"+ num2+ "\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6);

    }
}

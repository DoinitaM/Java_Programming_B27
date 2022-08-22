package day35_costum_classes.carpet;

public class Carpet {
    double width;
    double lenght;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWidth, double inputUnitPrice, double inputLength, boolean inputPersian){
        width = inputWidth;
        lenght = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = width * lenght * unitPrice;

        if(isPersian){
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "Carpet: {" +
                "width=" + width +
                ", lenght=" + lenght +
                ", unitPrice= $" + unitPrice +
                "," + (isPersian? "Persian" : "Regular") + " carpet " +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}

package day36_custom_classes.Food;

public class Food {

   /*
    create a class called Food
        - data:
            name, quantity, unit price, total price
        - constructor
           - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
 */
   String name;
   int quantity;
   double unitPrice;
   double totalPrice;


   /*method
        calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information
    Create a separate class to create and test the Food objects
    */

public Food(String name){
    this.name = name;

}
    public Food(String name, int quantity){
        this(name);
this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice= unitPrice;
        calculcatePrice();
    }

/* method:

 calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information



 */

   public  boolean calculcatePrice(){

      if(quantity == 0 || unitPrice ==0){
          return false;
      }

       totalPrice = unitPrice * quantity;
       return true;
   }

   public String toString(){

       String str = "Name: " + name;
       if(quantity != 0){
           str +=", quantity: " + quantity;
       }
       if(unitPrice != 0){
           str += ", unitPrice: $" + unitPrice;
       }
       if(totalPrice!=0){
           str +=", totalPrice: $" + totalPrice;
       }
       return "<" +  str + ">";
   }
}

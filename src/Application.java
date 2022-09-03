/**
 * This class contains the main method. It calls the methods from the Item class and SmallBag class 
 * @author brentreynolds
 * @version 9/2/22 Fall 2022
 */
public class Application {
    public static void main(String[] args) {

        Item<String> stringItem = new Item<>("Brent Reynolds"); // Instantiates string item
        
        Item<Integer> numberItem = new Item<>(1); // instantiates number item
        
        //System.out.println(obj2.getE());
        
       // System.out.println(stringItem.getE());
        

        SmallBag<String> stringSmallbag = new SmallBag<>("Brent Reynolds");  // Instantiates a Smallbag of type String

        System.out.println(stringSmallbag.getX()); //prints out my name
       

       SmallBag<Integer> numberSmallbag = new SmallBag<>(1); // Instantiates a Smallbag of type Integer
       
       System.out.println(numberSmallbag.getX()); // prints out the number
       
    }
} 
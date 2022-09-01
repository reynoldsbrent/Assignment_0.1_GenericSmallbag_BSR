public class Application {
    public static void main(String[] args) {

        Item<String> obj = new Item<>("Brent"); // Instantiates new item
        //obj.setE("Brent");  // sets new item to my name
        Item<Integer> obj2 = new Item<>(1); // instantiates another item
        System.out.println(obj2);
        System.out.println(obj);
        //obj2.setE(1); // sets item to an integer

        SmallBag<String> obj3 = new SmallBag<>("Brent Reynolds");  // Instantiates a Smallbag of type String

        
        System.out.println(obj3); //prints out my name
       

       SmallBag<Integer> obj4 = new SmallBag<>(1);
       System.out.println(obj4);
       
    }
} 
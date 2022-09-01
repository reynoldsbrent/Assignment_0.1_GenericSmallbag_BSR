public class Application {
    public static void main(String[] args) {

        Item<String> obj = new Item<>(); // Instantiates new item
        obj.setE("Brent");  // sets new item to my name
        Item<Integer> obj2 = new Item<>(); // instantiates another item
        obj2.setE(1); // sets item to an integer

        SmallBag<Item> obj3 = new SmallBag<>();  // Instantiates a smallbag of type item

        obj3.setX(obj); // sets item in smallbag to my name
        System.out.println(obj3); // supposed to print out my name

        obj3.setX(obj2); // sets item in smallbag to an integer
        System.out.println(obj3); // supposed to print out the integer
    }
} // test commit. I am testing to see if commit is working
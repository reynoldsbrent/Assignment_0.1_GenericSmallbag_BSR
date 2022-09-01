public class Application {
    public static void main(String[] args) {

        Item<String> obj = new Item<>();
        obj.setE("Brent");
        Item<Integer> obj2 = new Item<>();
        obj2.setE(1);

        SmallBag<Item> obj3 = new SmallBag<>();

        obj3.setX(obj);
        System.out.println(obj3.getX());

        obj3.setX(obj2);
        System.out.println(obj3.getX());
    }
}
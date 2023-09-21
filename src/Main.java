// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fruit a = new Fruit("Apple", 150.90, 10);
        Fruit b = new Fruit("Banana", 48.52, 6);
        System.out.println(a);
        System.out.println(a.equal(b));
//        System.out.println(a.compareTo(b));

        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("Cherry", 85.179, 8);
        fc.addFruit("Date", 94.62, 9);
        System.out.println(fc);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93, 7);
        System.out.println(fc);
//        System.out.println(fc.searchForFruitName("Date"));
        int s = fc.searchForFruitName("Date");
        if (s>=0){
            System.out.println(fc.getFruitAt(s));
        }

////        System.out.println(fc);

    }
}
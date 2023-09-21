import java.util.Arrays;

public class FruitCollection {
    Fruit[] fruits;
    int count = 0;

    //constructor
    public FruitCollection(int size) {
        this.fruits = new Fruit[size];
    }

    //method
    public boolean isFull() {
        return count == fruits.length;
    }



    public boolean addFruit(String name, double price, int quality) {
        Fruit dummy = new Fruit(name, price, quality);
        if (this.isFull()){
            return false;
        }
        fruits[count] = dummy;
        count++;
        return true;
    }

    public Fruit getFruitAt(int slot){
        if (slot > 0 && slot < count){
            return fruits[slot-1];
        }
        return null;
    }

    public boolean expand(int size){
        if (size < 1) {
            return false;
        }

        Fruit[] newArrayFruits = new Fruit[size + fruits.length];
        for (int i = 0; i < fruits.length; i++) {
            newArrayFruits[i] = fruits[i];
        }
        //System.arraycopy(fruits, 0, newArrayFruits, 0, fruits.length);
        fruits = newArrayFruits;

        return true;
    }


    public int searchForFruitName(String name){

        for (int i= 0; i<fruits.length; i++ ){
            if(fruits[i].getName().equals(name)){
                return i+1;
            }
        }

        return -1;
    }


    //getter
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "FruitCollection{" +
                "fruits=" + Arrays.toString(fruits) +
                ", count=" + count +
                '}';
    }
}

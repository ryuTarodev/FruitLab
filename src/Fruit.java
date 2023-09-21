public class Fruit {
    //field
    String name;
    double price;
    int quality;
    //Constructor
    public Fruit(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }
    //function
    public boolean equal(Fruit f){
        return this.equals(f);
    }
    public int compareTo(Fruit f){
        if(quality > f.getQuality() || f == null){
            return 1;
        }
        else if(quality < f.getQuality()){
            return -1;
        }
        else{
            return 0;
        }

    }

    // getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return  name + " (price:" + price + ", quality:" + quality + ")";

    }
}

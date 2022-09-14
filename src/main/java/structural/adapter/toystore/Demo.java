package structural.adapter.toystore;

public class Demo {

    public static void main(String[] args){
        Sparrow sparrow = new Sparrow();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}

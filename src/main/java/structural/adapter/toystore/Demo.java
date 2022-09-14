package structural.adapter.toystore;

import structural.adapter.toystore.adaptee.Sparrow;
import structural.adapter.toystore.adapter.BirdAdapter;
import structural.adapter.toystore.target.ToyDuck;

public class Demo {

    public static void main(String[] args){
        Sparrow sparrow = new Sparrow();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}

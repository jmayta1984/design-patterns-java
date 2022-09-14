package structural.adapter.toystore.adapter;

import structural.adapter.toystore.adaptee.Bird;
import structural.adapter.toystore.target.ToyDuck;

public class BirdAdapter implements ToyDuck {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

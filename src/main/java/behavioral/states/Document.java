package behavioral.states;

public class Document {
    private State state;

    void render(){

    }

    void publish(){

    }

    void changeState(State state){
        this.state = state;
    }
}

package behavioral.states;

public class Draft implements State{
    private Document document;

    public Draft(Document document) {
        this.document = document;
    }

    @Override
    public void render() {

    }

    @Override
    public void publish() {

    }
}

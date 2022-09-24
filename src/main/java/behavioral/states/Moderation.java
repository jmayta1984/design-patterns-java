package behavioral.states;

public class Moderation implements State{

    private Document document;

    public Moderation(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        document.changeState(new Published(document));
    }

    @Override
    public void publish() {

    }
}

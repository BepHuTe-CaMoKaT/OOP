package patterns.behavioral.state.example;

public class Context {
    private State state;

    public void request(){
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }
}

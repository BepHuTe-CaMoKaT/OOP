package patterns.behavioral.chain.example;

abstract class Handler {
    protected Handler succesor;

    abstract void handleRequest();

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }
}

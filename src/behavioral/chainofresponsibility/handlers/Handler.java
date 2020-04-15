package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.Request;

public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

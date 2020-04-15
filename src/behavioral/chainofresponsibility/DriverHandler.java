package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handlers.Handler;
import behavioral.chainofresponsibility.handlers.HandlerRequestOne;
import behavioral.chainofresponsibility.handlers.HandlerRequestThree;
import behavioral.chainofresponsibility.handlers.HandlerRequestTwo;

public class DriverHandler {

    public static void main(String[] args) {
        Handler h1 = new HandlerRequestOne();
        Handler h2 = new HandlerRequestTwo();
        Handler h3 = new HandlerRequestThree();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handleRequest(new Request("Negative Value ", -1));
        h1.handleRequest(new Request("Negative Value ",  0));
        h1.handleRequest(new Request("Negative Value ",  1));
        h1.handleRequest(new Request("Negative Value ",  2));
        h1.handleRequest(new Request("Negative Value ", -5));
    }
}

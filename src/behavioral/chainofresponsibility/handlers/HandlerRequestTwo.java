package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.Request;

public class HandlerRequestTwo extends Handler{

    private Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getValue() > 0){
            System.out.println("HandlerRequestTwo : "+"value is : "+request.getValue()+" description : "+request.getDescription());
        }else{
            successor.handleRequest(request);
        }
    }

}

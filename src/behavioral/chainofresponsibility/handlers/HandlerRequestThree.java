package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.Request;

public class HandlerRequestThree extends Handler{

    private Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getValue() >=0 ){
            System.out.println("HandlerRequestThree : "+"value is : "+request.getValue()+" description : "+request.getDescription());
        }else{
            System.out.println("no able to handle request  ");
            //successor.handleRequest(request);
        }
    }
}

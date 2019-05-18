package structural.decorator;

public class PhoneDecorator implements Phone{

    protected Phone phone;

    public PhoneDecorator(Phone phone){
        this.phone = phone;
    }

    @Override
    public void printModel(){
        this.phone.printModel();
    }
}

package structural.decorator.simplepizzadesign;

public abstract class SimplePizza {

     String name;

     String description;

     boolean paneerTopping;

     boolean capsicumTopping;

     boolean mushroomTopping;

    int paneerToppingCost = 10;

    int capsicumToppingCost = 20;

    int mushroomToppingCost = 30;

     public int getCost(){
         int totalCostWithTopping = 0;
         if(isCapsicumTopping()){
             totalCostWithTopping += capsicumToppingCost;
         }
         if(isMushroomTopping()){
             totalCostWithTopping += mushroomToppingCost;
         }
         if(isPaneerTopping()){
             totalCostWithTopping += paneerToppingCost;
         }
         return totalCostWithTopping;
     }

    public abstract String getName();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPaneerTopping() {
        return paneerTopping;
    }

    public void setPaneerTopping(boolean paneerTopping) {
        this.paneerTopping = paneerTopping;
    }

    public boolean isCapsicumTopping() {
        return capsicumTopping;
    }

    public void setCapsicumTopping(boolean capsicumTopping) {
        this.capsicumTopping = capsicumTopping;
    }

    public boolean isMushroomTopping() {
        return mushroomTopping;
    }

    public void setMushroomTopping(boolean mushroomTopping) {
        this.mushroomTopping = mushroomTopping;
    }
}

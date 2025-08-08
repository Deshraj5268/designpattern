package behavioral.strategy.sortingstrategy;

public class SortContext {

    private SortStrategy sortStrategy;

    public void setStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void executeSort(int [] nums){
        sortStrategy.sort(nums);
    }
}

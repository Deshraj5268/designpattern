package behavioral.strategy.sortingstrategy;

public class SortStrategyDriver {

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1};

        SortContext context = new SortContext();

        context.setStrategy(new BubbleSort());
        context.executeSort(data);
    }
}

package behavioral.template.game;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("initializing Football game");
    }

    @Override
    protected void startPlay() {
        System.out.println("start Football game");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football game finished !");
    }
}

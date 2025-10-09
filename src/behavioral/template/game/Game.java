package behavioral.template.game;

public abstract class Game {

    public final void play(){
        initialize();
        startPlay();
        endPlay();
        System.out.println(" ----------");
    }

    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}

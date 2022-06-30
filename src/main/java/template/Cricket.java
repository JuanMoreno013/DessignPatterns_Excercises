package template;

//Concrete class
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");

    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Finished!");

    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");

    }
}

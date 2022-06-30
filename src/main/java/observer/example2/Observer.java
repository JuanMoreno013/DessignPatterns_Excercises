package observer.example2;

//Subscriber
public abstract class Observer {
    protected Subject subject;

    public abstract void update();

}

package proxy;

//Client
public class ProxyMain {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();

        object.process();
        object.process();
    }
}

/*
Note that we're calling the process() method twice. Behind the scenes, the settings part will occur only once – when the object is first initialized.

For every other subsequent call, this pattern will skip the initial configuration, and only processing will occur:
 */

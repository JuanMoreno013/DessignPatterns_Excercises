package observer.example1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsChannel implements Channel {
    //Concrete Subscriber

    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String)news);
    }
}

package memento;

import lombok.Getter;


@Getter
public class EditorState {
    //Memento
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

}

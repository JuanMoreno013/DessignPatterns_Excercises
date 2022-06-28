package memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {
    //Originator
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }


}

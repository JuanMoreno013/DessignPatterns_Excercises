package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    //Caretaker
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop (){
        var lastIndex = states.size()-1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }

    public void all(){
        for(EditorState state: states){
            System.out.println(state.getContent());
        }
    }
}

package visitor.computer;

import visitor.mall.ItemElement;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{

    List<ComputerPart> parts = new ArrayList<>();

//    ComputerPart[] parts;

    public Computer() {
//        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};

        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());


    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

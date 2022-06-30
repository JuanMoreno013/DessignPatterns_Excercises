package visitor.computer;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

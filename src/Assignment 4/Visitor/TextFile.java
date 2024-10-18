package BehavioralPatterns2.Visitor;

public class TextFile implements File {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

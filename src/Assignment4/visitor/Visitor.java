package Assignment4.visitor;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}

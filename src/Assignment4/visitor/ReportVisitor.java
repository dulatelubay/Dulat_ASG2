package Assignment4.visitor;

public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getFileName());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file: " + executableFile.getFileName());
    }
}

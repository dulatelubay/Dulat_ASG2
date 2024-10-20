package Assignment4.visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file: " + textFile.getFileName());
        System.out.println("No prohibited words found.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file: " + executableFile.getFileName());
        System.out.println("No malware found.");
    }
}

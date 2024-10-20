package Assignment4.templatemethod;

public abstract class QualityCheck {

    public final void checkQuality() {
        checkAppearance();
        checkSpecifics();
        generateReport();
    }

    private void checkAppearance() {
        System.out.println("Checking product appearance...");
    }

    protected abstract void checkSpecifics();

    private void generateReport() {
        System.out.println("Generating quality check report...");
    }
}

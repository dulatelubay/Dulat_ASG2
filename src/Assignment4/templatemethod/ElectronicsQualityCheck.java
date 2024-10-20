package Assignment4.templatemethod;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking functionality and warranty...");
    }
}

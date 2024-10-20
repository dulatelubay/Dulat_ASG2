package Assignment4.templatemethod;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking expiration date and ingredients...");
    }
}

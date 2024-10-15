package Assignment3.Mediator;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        System.out.println("Temperature data sent.");
        mediator.notify(this);
    }
}

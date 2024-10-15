package Assignment3.Mediator;

public class LightSensor extends Sensor {
    public LightSensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        System.out.println("Light data sent.");
        mediator.notify(this);
    }
}

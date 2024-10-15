package Assignment3.Mediator;

public class HumiditySensor extends Sensor {
    public HumiditySensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        System.out.println("Humidity data sent.");
        mediator.notify(this);
    }
}

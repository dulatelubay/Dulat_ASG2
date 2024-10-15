package Assignment3.Mediator;

public abstract class Sensor {
    protected HomeMediator mediator;

    public Sensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendData();
}

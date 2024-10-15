package Assignment3.Mediator;

public class HomeMediatorImpl implements HomeMediator {
    private TemperatureSensor tempSensor;
    private HumiditySensor humiditySensor;
    private LightSensor lightSensor;

    public void setTemperatureSensor(TemperatureSensor sensor) {
        this.tempSensor = sensor;
    }

    public void setHumiditySensor(HumiditySensor sensor) {
        this.humiditySensor = sensor;
    }

    public void setLightSensor(LightSensor sensor) {
        this.lightSensor = sensor;
    }

    @Override
    public void notify(Sensor sensor) {
        System.out.println(sensor.getClass().getSimpleName() + " sent data.");
    }

    @Override
    public void printReport() {
        System.out.println("Report: All sensors have sent data.");
    }
}

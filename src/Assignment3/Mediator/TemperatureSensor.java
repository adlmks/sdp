package Assignment3.Mediator;

/**
 Отправляет данные о температуре медиатору
 */
public class TemperatureSensor implements Sensor{
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "30°C";
        System.out.println("TemperatureSensor: sending data - " + data);
        mediator.collectData(data, this);
    }
}

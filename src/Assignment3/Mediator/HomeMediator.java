package Assignment3.Mediator;

/**
 Mediator для сбора данных с датчиков
 */
public interface HomeMediator {
    /**
     Собирает данные с датчиков и сохраняет их
     */
    void collectData(String data, Sensor sensor);

    /**
     Вывод данных с датчиков
     */
    void printReport();

}

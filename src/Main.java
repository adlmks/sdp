import Assignment3.Chain.*;
import Assignment3.Command.*;
import Assignment3.Iterator.*;
import Assignment3.Mediator.*;
import Assignment3.Memento.*;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        // Цепочка обязанностей
        System.out.println("Chain of Responsibility:");
        PaymentA paymentA = new PaymentA();
        PaymentB paymentB = new PaymentB();
        PaymentC paymentC = new PaymentC();

        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        int amountToPay = 210;
        paymentA.handlePayment(amountToPay);

        // Команда
        System.out.println("\nCommand:");
        Television television = new Television();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, new TurnOnCommand(television));
        remote.setCommand(1, new TurnOffCommand(television));
        remote.setCommand(2, new VolumeUpCommand(television));
        remote.setCommand(3, new VolumeDownCommand(television));
        remote.setCommand(4, new NextChannelCommand(television));
        remote.setCommand(5, new PreviousChannelCommand(television));

        remote.pressButton(0);
        remote.pressButton(2);
        remote.pressButton(4);
        remote.pressButton(1);

        // Итератор
        System.out.println("\nIterator:");
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Movie A");
        listCollection.addMovie("Movie B");
        listCollection.addMovie("Movie C");

        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(new String[]{"Movie D", "Movie E", "Movie F"});

        Iterator<String> listIterator = listCollection.createIterator();
        while (listIterator.hasNext()) {
            System.out.println("List Movie: " + listIterator.next());
        }

        Iterator<String> arrayIterator = arrayCollection.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println("Array Movie: " + arrayIterator.next());
        }

        // Посредник
        System.out.println("\nMediator:");
        HomeMediator mediator = new HomeMediatorImpl();
        TemperatureSensor temperatureSensor = new TemperatureSensor(mediator);
        HumiditySensor humiditySensor = new HumiditySensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);

        // Отправляем данные от сенсоров
        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        mediator.printReport();


        // Снимок
        System.out.println("\nMemento:");
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Hello, ");
        caretaker.save(editor);

        editor.addText("World!");
        System.out.println("Current Text: " + editor.getText());

        caretaker.restore(editor);
        System.out.println("After restoring: " + editor.getText());
    }
}
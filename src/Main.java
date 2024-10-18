package BehavioralPatterns2;

import BehavioralPatterns2.Observer.*;
import BehavioralPatterns2.State.Player;
import BehavioralPatterns2.Strategy.CardPaymentStrategy;
import BehavioralPatterns2.Strategy.CashOnDeliveryStrategy;
import BehavioralPatterns2.Strategy.Order;
import BehavioralPatterns2.Strategy.WalletPaymentStrategy;
import BehavioralPatterns2.Template.ElectronicsQualityCheck;
import BehavioralPatterns2.Template.FoodQualityCheck;
import BehavioralPatterns2.Template.QualityCheck;
import BehavioralPatterns2.Visitor.*;

public class Main {

    public static void main(String[] args) {
        // Паттерн Observer
        observerPattern();

        // Паттерн State
        statePattern();

        // Паттерн Strategy
        strategyPattern();

        // Паттерн Template Method
        templateMethodPattern();

        // Паттерн Visitor
        visitorPattern();
    }

    // Observer (Наблюдатель).
    // Публикуется новости, и устройства (смартфон, ноутбук, планшет) получают уведомления.
    private static void observerPattern() {
        NewsPublisherImpl publisher = new NewsPublisherImpl();
        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        publisher.subscribe(smartphone);
        publisher.subscribe(laptop);
        publisher.subscribe(tablet);

        // Публикуются новости по категориям
        publisher.publishNews("Sports", "Team wins the championship!");
        publisher.publishNews("Science", "New planet discovered!");
    }

    // State (Состояние).
    // Демонстрируется изменение состояния плеера (воспроизведение, пауза, остановка).
    private static void statePattern() {
        Player player = new Player();
        player.play();   // Начинаем воспроизведение
        player.pause();  // Приостанавливаем воспроизведение
        player.play();   // Возобновляем воспроизведение
        player.stop();   // Останавливаем плеер
    }

    // Strategy (Стратегия).
    // Применение разных способов оплаты для заказа.
    private static void strategyPattern() {
        Order order1 = new Order(new CardPaymentStrategy());
        System.out.println("Card payment: " + order1.processOrder(1000));

        Order order2 = new Order(new WalletPaymentStrategy());
        System.out.println("Wallet payment: " + order2.processOrder(1000));

        Order order3 = new Order(new CashOnDeliveryStrategy());
        System.out.println("Cash on delivery: " + order3.processOrder(1000));
    }

    // Template Method (Шаблонный метод).
    // Классы для проверки качества товаров используют общий алгоритм с вариациями.
    private static void templateMethodPattern() {
        QualityCheck foodCheck = new FoodQualityCheck();
        foodCheck.check();  // Проверка продуктов питания

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        electronicsCheck.check();  // Проверка электроники
    }

    // Visitor (Посетитель).
    // Обработчики (антивирус и отчет) выполняют действия с файлами (текстовыми и исполняемыми).
    private static void visitorPattern() {
        File textFile = new TextFile();
        File executableFile = new ExecutableFile();

        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        textFile.accept(antivirus);  // Проверка текстового файла антивирусом
        executableFile.accept(antivirus);  // Проверка исполняемого файла антивирусом

        textFile.accept(report);  // Генерация отчета для текстового файла
        executableFile.accept(report);  // Генерация отчета для исполняемого файла
    }
}

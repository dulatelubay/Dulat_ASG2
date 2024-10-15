// public static void main(String[] args) throws CloneNotSupportedException {
//        // Singleton: CoffeeShop instance
//        CoffeeShopSingleton coffeeShop = CoffeeShopSingleton.getInstance();
//
//        // Factory Method: Create coffee (Cappuccino or Espresso)
//        CoffeeFactoryMethod espressoFactory = new EspressoFactory();
//        CoffeeProduct espresso = espressoFactory.createCoffee();
//
//        // Abstract Factory: Create ingredients for Cappuccino
//        CoffeeIngredientsFactory ingredientsFactory = new CappuccinoIngredientsFactory();
//        MilkProduct milk = ingredientsFactory.createMilk();
//        SyrupProduct syrup = ingredientsFactory.createSyrup();
//
//        // Builder: Create custom CoffeeOrder
//        CoffeeOrderBuilder builder = new CoffeeOrderBuilder();
//        CoffeeOrderPrototype order = builder
//                .selectCoffee(espresso)
//                .addMilk(milk)
//                .addSyrup(syrup)
//                .build();
//
//        coffeeShop.placeOrder(order);
//        coffeeShop.serveOrder(order);
//
//        // Prototype: Clone the order
//        CoffeeOrderPrototype clonedOrder = order.clone();
//        coffeeShop.placeOrder(clonedOrder);
//        coffeeShop.serveOrder(clonedOrder);
//    }
//}

//Assigment2
//package Assignment2;
//import Assignment2.Adapter.PDFDocumentAdapter;
//import Assignment2.Bridge.HighlightRenderEngine;
//import Assignment2.Bridge.RenderEngine;
//import Assignment2.Bridge.SimpleRenderEngine;
//import Assignment2.Composite.DocumentGroup;
//import Assignment2.Facade.DocumentFacade;
//import Assignment2.*;
//import Assignment2.Flyweight.DocumentFactory;
//public class Main{
//    public static void main(String[] args) {
//
//        DocumentFacade facade = new DocumentFacade();

// 1. Использование Proxy для ленивой загрузки
//        System.out.println("1. Ленивая загрузка документов:");
//        facade.displayDocument("Report");

// 2. Использование декоратора для добавления водяного знака
//        System.out.println("\n2. Добавление водяного знака:");
//        facade.displayDocumentWithWatermark("Report");

// 3. Использование Flyweight для повторного использования документа
//        System.out.println("\n3. Повторное использование документа:");
//        facade.displayDocument("Report");

// 4. Использование Composite для работы с группой документов
//        System.out.println("\n4. Работа с группами документов:");
//        DocumentGroup group = new DocumentGroup();
//        group.addDocument(DocumentFactory.getDocument("Report"));
//        group.addDocument(DocumentFactory.getDocument("Presentation"));
//        group.display();

// 5. Использование Adapter для работы с PDF
//        System.out.println("\n5. Работа с PDF документами через Adapter:");
//        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
//        pdfDocument.display();

// 6. Использование Bridge для рендеринга
//        System.out.println("\n6. Рендеринг документа через движок:");
//        RenderEngine simpleEngine = new SimpleRenderEngine();
//        facade.renderDocument("Report", simpleEngine);

//        RenderEngine highlightEngine = new HighlightRenderEngine();
//        facade.renderDocument("Report", highlightEngine);
//    }
//}

//Assignment3
//import
import Assignment3.Chain.PaymentA;
import Assignment3.Chain.PaymentB;
import Assignment3.Chain.PaymentC;
import Assignment3.Command.RemoteControl;
import Assignment3.Command.*;
import Assignment3.Iterator.*;
import Assignment3.Mediator.*;
import Assignment3.Memento.*;

public class Main {
    public static void main(String[] args) {
        // Test Chain of Responsibility
        PaymentA paymentA = new PaymentA();
        PaymentB paymentB = new PaymentB();
        PaymentC paymentC = new PaymentC();

        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        System.out.println("Testing payment chain:");
        paymentA.pay(150); // should process with PaymentB
        paymentA.pay(350); // should process with PaymentC
        paymentA.pay(1000); // should fail

        // Test Command pattern
        System.out.println("\nTesting command pattern:");
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, new TurnOnCommand(tv));
        remote.setCommand(1, new TurnOffCommand(tv));
        remote.setCommand(2, new VolumeUpCommand(tv));
        remote.setCommand(3, new VolumeDownCommand(tv));
        remote.setCommand(4, new NextChannelCommand(tv));
        remote.setCommand(5, new PreviousChannelCommand(tv));

        remote.pressButton(0); // Turn on
        remote.pressButton(2); // Volume up
        remote.pressButton(4); // Next channel
        remote.pressButton(1); // Turn off

        // Test Iterator pattern
        System.out.println("\nTesting iterator pattern:");
        ListMovieCollection listMovies = new ListMovieCollection();
        listMovies.addMovie("Inception");
        listMovies.addMovie("The Matrix");
        listMovies.addMovie("Interstellar");

        Iterator<String> listIterator = listMovies.createIterator();
        while (listIterator.hasNext()) {
            System.out.println("Movie: " + listIterator.next());
        }

        String[] arrayMovies = {"Avatar", "Titanic", "Star Wars"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(arrayMovies);
        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println("Movie: " + arrayIterator.next());
        }

        // Test Mediator pattern
        System.out.println("\nTesting mediator pattern:");
        HomeMediatorImpl mediator = new HomeMediatorImpl();

        TemperatureSensor tempSensor = new TemperatureSensor(mediator);
        HumiditySensor humiditySensor = new HumiditySensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);

        mediator.setTemperatureSensor(tempSensor);
        mediator.setHumiditySensor(humiditySensor);
        mediator.setLightSensor(lightSensor);

        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        mediator.printReport();

        // Test Memento pattern
        System.out.println("\nTesting memento pattern:");
        TextEditor editor = new TextEditor();
        editor.setText("Version 1");
        TextMemento memento1 = editor.save();

        editor.setText("Version 2");
        TextMemento memento2 = editor.save();

        editor.restore(memento1);
        System.out.println("Restored to: " + editor.getText()); // Should print Version 1
    }
}

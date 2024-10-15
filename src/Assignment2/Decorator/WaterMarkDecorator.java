package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {

    // Конструктор, который принимает декорируемый документ
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Переопределяем метод display() для добавления водяного знака
    @Override
    public void display() {
        // Сначала отображаем декорируемый документ
        decoratedDocument.display();

        addWatermark();
    }

    // Метод для добавления водяного знака
    private void addWatermark() {
        System.out.println("Adding watermark to the document."); // Вывод сообщения о добавлении водяного знака
    }
}



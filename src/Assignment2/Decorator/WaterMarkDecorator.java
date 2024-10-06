package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public WatermarkDecorator extends DocumentDecorator {
    // Конструктор принимает документ, который нужно украсить водяным знаком
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument); // Передаём украшенный документ в родительский класс
    }

    // Реализуем логику, которая сначала отображает документ, а затем добавляет к нему водяной знак
    @Override
    public void display() {
        decoratedDocument.display(); // Сначала отображаем оригинальный документ
        addWatermark(); // Затем добавляем водяной знак
    }

    // Метод для добавления водяного знака
    private void addWatermark() {
        System.out.println("Adding watermark to the document..."); // Выводим сообщение о добавлении водяного знака
    }
}

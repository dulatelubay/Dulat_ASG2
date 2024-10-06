package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument; // Ссылка на реальный документ
    private String title; // Заголовок документа

    public ProxyDocument(String title) {
        this.title = title; // Инициализация заголовка
    }

    @Override
    public void display() {
        // Проверяем, загружен ли реальный документ
        if (realDocument == null) {
            // Если документ не загружен, создаем его
            realDocument = new RealDocument(title);
        }
        // Вызываем метод отображения реального документа
        realDocument.display();
    }
}


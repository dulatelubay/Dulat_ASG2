package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument; // Импортируем класс RealDocument

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument; // Реальный документ, который будет загружен
    private String title; // Заголовок документа

    public ProxyDocument(String title) {
        this.title = title; // Сохраняем заголовок документа
    }

    // Задача: Вам нужно реализовать логику для создания документа только при первом обращении к методу display().
    // Если документ уже был загружен, он не должен загружаться заново.

    @Override
    public void display() {
        // Проверяем, загружен ли уже реальный документ
        if (realDocument == null) {
            // Если не загружен, создаем его
            realDocument = new RealDocument(title); // Создаем новый реальный документ
        }
        realDocument.display(); // Вызываем метод отображения у реального документа
    }
}



package Assignment2.Facade;

import Assignment2.Document;
import Assignment2.DocumentFactory;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.RenderEngine; // Импортируйте нужные классы
import Assignment2.SimpleDocumentRenderer; // Импортируйте нужные классы

// Фасад для работы с документами
public class DocumentFacade {
    private DocumentFactory documentFactory; // Фабрика для создания документов

    public DocumentFacade() {
        this.documentFactory = new DocumentFactory(); // Инициализация фабрики
    }

    // Метод для отображения документа
    public void displayDocument(String title) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        document.display(); // Вызываем метод для отображения документа
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        Document watermarkDocument = new WatermarkDecorator(document); // Оборачиваем документ декоратором
        watermarkDocument.display(); // Вызываем метод для отображения обёрнутого документа
    }

    // Метод для рендеринга документа
    public void renderDocument(String title, RenderEngine engine) {
        Document document = documentFactory.getDocument(title); // Получаем документ по заголовку
        SimpleDocumentRenderer renderer = new SimpleDocumentRenderer(engine); // Создаем рендерер с выбранным движком
        renderer.render(document); // Вызываем метод рендеринга для заданного документа
    }
}


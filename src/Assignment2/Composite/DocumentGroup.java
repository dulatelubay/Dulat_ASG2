package Assignment2.Composite;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Facade.DocumentFacade;
import Assignment2.*;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>(); // Список для хранения документов в группе

    // Задача: Реализуйте методы для добавления и удаления документов из группы,
    // а также отображение всех документов в группе через метод display().

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document); // Добавляем документ в список
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document document) {
        documents.remove(document); // Удаляем документ из списка
    }

    // Метод для отображения всех документов в группе
    @Override
    public void display() {
        for (Document document : documents) { // Проходим по каждому документу в группе
            document.display(); // Вызываем метод display для каждого документа
        }
    }
}


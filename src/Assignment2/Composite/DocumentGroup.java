package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>(); // Список документов в группе

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document); // Добавляем документ в список
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document document) {
        documents.remove(document); // Удаляем документ из списка, если он есть
    }

    // Метод для отображения всех документов в группе
    @Override
    public void display() {
        System.out.println("Documents in the group:"); // Сообщение о начале отображения
        for (Document document : documents) {
            document.display(); // Вызываем метод display() для каждого документа
        }
    }
}



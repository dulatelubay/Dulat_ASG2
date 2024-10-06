package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument; // Импортируйте реализацию документа

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>(); // Хранит документы

    // Метод для получения документа по заголовку
    public Document getDocument(String title) {
        // Проверяем, существует ли документ с таким заголовком
        Document document = documentMap.get(title);

        // Если документ не существует, создаем новый и добавляем в карту
        if (document == null) {
            document = new RealDocument(title); // Создаем новый реальный документ
            documentMap.put(title, document); // Сохраняем документ в карте
        }

        return document; // Возвращаем документ (существующий или новый)
    }
}



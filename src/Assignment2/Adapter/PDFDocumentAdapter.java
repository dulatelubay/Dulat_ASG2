package Assignment2.Adapter;

import Assignment2.Document;

// Адаптер для интеграции PDF документов
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument; // Экземпляр класса PDFDocument

    // Конструктор, который инициализирует PDFDocument с именем файла
    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName); // Инициализация PDF документа
    }

    // Реализация метода display() из интерфейса Document
    @Override
    public void display() {
        // Вызов метода отображения на экземпляре PDFDocument
        pdfDocument.show(); // Предполагается, что у PDFDocument есть метод show()
    }

    // Если в интерфейсе Document есть другие методы, реализуйте их здесь
    // Например, если есть метод getTitle():
    public String getTitle() {
        return pdfDocument.getTitle(); // Предполагается, что у PDFDocument есть метод getTitle()
    }
}


package Assignment2.Adapter;

import Assignment2.Document;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument; // Экземпляр PDF-документа

    // Конструктор, который инициализирует PDF-документ с именем файла
    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    // Реализация метода display() из интерфейса Document
    public void display(){
        // Открываем PDF-документ
        pdfDocument.openPDF();
        // Отображаем содержимое PDF-документа
        pdfDocument.showPDF();
    }
}



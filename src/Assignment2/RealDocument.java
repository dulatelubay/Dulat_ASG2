package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Вывод сообщения о загрузке документа
        System.out.println("Загрузка документа: " + title);
    }

    @Override
    public void display() {
        // Вывод сообщения об отображении документа
        System.out.println("Отображение документа: " + title);
    }
}
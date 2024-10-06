package Assignment2.Bridge;

// Задание: Реализовать рендеринг документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine); // Вызов конструктора родительского класса с движком рендеринга
    }

    // Задача: Реализуйте рендеринг документа, используя предоставленный движок рендеринга
    @Override
    public void render(Document document) {
        // Вызов метода рендеринга на движке для рендеринга данного документа
        engine.renderDocument(document); // Предполагается, что у движка есть метод для рендеринга документа
    }
}


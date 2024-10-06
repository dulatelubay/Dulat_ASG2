package Assignment2.Bridge;

// ЗАДАНИЕ: Реализовать рендеринг документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {

    // Конструктор, принимающий движок рендеринга
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine); // Вызываем конструктор родительского класса с переданным движком
    }

    // Задача: Реализуйте вызов метода рендеринга документа через переданный движок
    // (например, SimpleRenderEngine или HighlightRenderEngine).
    @Override
    public void render(String content) {
        // Вызываем метод рендеринга документа через выбранный движок
        engine.render(content); // Предполагается, что у движка есть метод для рендеринга документа
    }
}



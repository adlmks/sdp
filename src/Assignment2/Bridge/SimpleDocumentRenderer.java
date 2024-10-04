package Assignment2.Bridge;

// Реализация рендеринга документа через выбранный движок
public class SimpleDocumentRenderer extends DocumentRenderer {
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    // Задача: Реализуйте вызов метода рендеринга документа через переданный движок
    @Override
    public void render(String content) {
        engine.render(content);
    }
}

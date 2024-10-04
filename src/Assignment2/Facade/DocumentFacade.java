package Assignment2.Facade;

import Assignment2.Document;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;

// Фасад для работы с документами
public class DocumentFacade {
    // Метод для отображения документа
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    // Метод для рендеринга документа
    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        SimpleDocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}

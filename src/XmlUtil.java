import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlUtil {

    public static void createXml() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();


        Element rootElement = document.createElement("notes");
        document.appendChild(rootElement);

        Element noteElement = document.createElement("note");
        rootElement.appendChild(noteElement);


        Element toElement = document.createElement("to");
        toElement.appendChild(document.createTextNode("Tove"));
        noteElement.appendChild(toElement);

        Element fromElement = document.createElement("from");
        fromElement.appendChild(document.createTextNode("Jani"));
        noteElement.appendChild(fromElement);

        Element headingElement = document.createElement("heading");
        headingElement.appendChild(document.createTextNode("Reminder"));
        noteElement.appendChild(headingElement);


        Element bodyElement = document.createElement("body");
        bodyElement.appendChild(document.createTextNode("Don't forget me this weekend!"));
        noteElement.appendChild(bodyElement);


        Element note2Element = document.createElement("note");
        rootElement.appendChild(note2Element);


        Element to2Element = document.createElement("to");
        to2Element.appendChild(document.createTextNode("Nick"));
        noteElement.appendChild(to2Element);

        Element from2Element = document.createElement("from");
        from2Element.appendChild(document.createTextNode("Janion"));
        noteElement.appendChild(from2Element);

        Element heading2Element = document.createElement("heading");
        heading2Element.appendChild(document.createTextNode("Reminder"));
        noteElement.appendChild(heading2Element);


        Element body2Element = document.createElement("body");
        body2Element.appendChild(document.createTextNode("Don't forget to eat"));
        noteElement.appendChild(body2Element);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        DOMSource domSource = new DOMSource(document);

        StreamResult streamResult = new StreamResult(new File("C:/exam/xmlTest.xml"));
        transformer.transform(domSource, streamResult);
    }
}

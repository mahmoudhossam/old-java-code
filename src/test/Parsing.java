package test;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parsing {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("http://mahmoudhossam.tumblr.com/api/read?num=50");
        doc.getDocumentElement().normalize();
        NodeList Nodes = doc.getDocumentElement().getChildNodes();
        Node node = Nodes.item(1);
        Node first = node.getFirstChild();
        Node last = node.getLastChild();
        System.out.println(first.getTextContent());
        Node firsts = first.getLastChild();
        System.out.println(firsts.getTextContent());
    }

}

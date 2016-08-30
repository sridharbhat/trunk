
 
import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
 
public class XmlDomDocument {
 
    private Document m_doc;
 
    public void XmlDomDocument(String xmlfile) throws Exception 
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        m_doc = builder.parse(new FileInputStream(new File(xmlfile)));
    }
 
    public int getChildCount(String parentTag, int parentIndex, String childTag)
    {
        NodeList list = m_doc.getElementsByTagName(parentTag);
        Element parent = (Element) list.item(parentIndex);
        NodeList childList = parent.getElementsByTagName(childTag);
        return childList.getLength();
    }
 
    public String getChildValue(String parentTag, int parentIndex, String childTag,
                                int childIndex)
    {
        NodeList list = m_doc.getElementsByTagName(parentTag);
        Element parent = (Element) list.item(parentIndex);
        NodeList childList = parent.getElementsByTagName(childTag);
        Element field = (Element) childList.item(childIndex);
        Node child = field.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";
    }
 
    public String getChildAttribute(String parentTag, int parentIndex, 
                                  String childTag, int childIndex,
                                  String attributeTag) {
        NodeList list = m_doc.getElementsByTagName(parentTag);
        Element parent = (Element) list.item(parentIndex);
        NodeList childList = parent.getElementsByTagName(childTag);
        Element element = (Element) childList.item(childIndex);
        return element.getAttribute(attributeTag);
    }
}
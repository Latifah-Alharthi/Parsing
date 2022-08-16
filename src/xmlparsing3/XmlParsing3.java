/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparsing;
import java.io.File;  
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;  
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;  
import org.w3c.dom.Node;  
import org.w3c.dom.NodeList;  
/**
 *
 * @author latifahalharthi
 */
public class XmlParsing3 {




public static void main(String[] args) throws SAXException, IOException,
        ParserConfigurationException, TransformerException, org.xml.sax.SAXException {

    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
    Document document = docBuilder.parse(new File("/Users/latifahalharthi/NetBeansProjects/XMLParsing3/src/xmlparsing3/f.xml.xml"));

    reverseXml(document.getDocumentElement());
}

public static void reverseXml(Node node) {
    

    NodeList nodeList = node.getChildNodes();
    for (int i = 0; i < nodeList.getLength(); i++) {
        Node currentNode = nodeList.item(i);
        if (currentNode.getNodeType() == Node.ELEMENT_NODE ) {
           {
         
             
                // do something with the current node instead of System.out
    System.out.println("<"+currentNode.getNodeName()+">"+"\t");
    System.out.println("     <"+currentNode.getParentNode().getNodeName()+">");
   
     System.out.println("             <"+currentNode.getParentNode().getParentNode().getNodeName()+">");
         System.out.println("     <"+currentNode.getParentNode().getNodeName()+">");
     
    System.out.println("<"+currentNode.getNodeName()+">"+"\t");
   
            reverseXml(currentNode);
               
           }
        }
        }
    }
}

 
//}  

 

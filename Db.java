import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.*;

public class Db {
	//static Document doc=null;

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		String prop="001716";
		File filesXML = new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\GetDBdetails\\app-IPS"+prop+"-ds.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(filesXML);


	NodeList nList = doc.getElementsByTagName("local-tx-datasource");
	System.out.println("length "+nList.getLength());

	for (int i= 0; i< nList.getLength(); i++) {

	    org.w3c.dom.Node nNode = nList.item(i);

	    if (nNode.getNodeType() == Node.ELEMENT_NODE) {



	        Element eElement = (Element) nNode;

	            //System.out.println("File: " + eElement.getAttribute("user-name"));
	        	String IPS= eElement.getElementsByTagName("security-domain").item(i).getTextContent();
	            System.out.println("File: " + eElement.getElementsByTagName("security-domain").item(i).getTextContent());
	           // System.out.println("File: " + eElement.getElementsByTagName("password").item(i).getTextContent());
	            File fileXML = new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\GetDBdetails\\app-IPS"+prop+"-ds.xml");
	    	    DocumentBuilderFactory dbFactorys = DocumentBuilderFactory.newInstance();
	    	    DocumentBuilder dBuilders = dbFactory.newDocumentBuilder();
	    	    Document docs = dBuilder.parse(filesXML);


	    	NodeList List = doc.getElementsByTagName("local-tx-datasource");
	    	System.out.println("length "+nList.getLength());
	    	
	    	 
/*
	    	for (int j= 0; j< List.getLength(); j++) {

	    	    org.w3c.dom.Node mNode = List.item(j);

	    	    if (mNode.getNodeType() == Node.ELEMENT_NODE) {



	    	        Element Element = (Element) mNode;

	    	            //System.out.println("File: " + eElement.getAttribute("user-name"));
	    	        	String PSI= eElement.getElementsByTagName("security-domain").item(i).getTextContent();
	    	            System.out.println("File: " + eElement.getElementsByTagName("security-domain").item(i).getTextContent());
	    	           // System.out.println("File: " + eElement.getElementsByTagName("password").item(i).getTextContent());
	    	            
	    	            
	    	            
	    	        }
	            
	            
	        }*/
	    	}	}
	}
	}
/*	    String filePath = "C:\\PSI\\Tickets\\R82\\Auto_deployments\\VP10.xml";
	    File xmlFile = new File(filePath);
	    
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder;
	    try {
	        dBuilder = dbFactory.newDocumentBuilder();
	         doc = dBuilder.parse(xmlFile);
	        doc.getDocumentElement().normalize();
	        printElement(doc);
	        System.out.println("XML file updated successfully");
	    } catch (SAXException | ParserConfigurationException e1) {
	        e1.printStackTrace();
	    }
	}
	private static void printElement(Document someNode) {
	    NodeList nodeList = someNode.getElementsByTagName("choiceInteraction");
	    System.out.println("Choice Interaction Id:"+nodeList.getLength());
	    for(int z=0,size= nodeList.getLength();z<size; z++) {
	            String Value = nodeList.item(z).getAttributes().getNamedItem("id").getNodeValue();
	            System.out.println("Choice Interaction Id:"+Value);
	        }
	    }*/
	/*
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	DocumentBuilder db = dbf.newDocumentBuilder();
	Document document = db.parse(new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\VP10.xml"));
	NodeList nodeList = document.getElementsByTagName("user-name");{
		System.out.println(nodeList.getLength());
	for(int x=0,size= nodeList.getLength(); x<size; x++) {
	    System.out.println(nodeList.item(x).getNodeName().charAt(size));//getAttributes());//getNamedItem("password"));//.getNodeValue());
	} 
	}
}}*/
		
		
		/*String sCurrentLine;

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\PSI\\Tickets\\R82\\Auto_deployments\\VP10.xml")))
		{

			

			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.contains("user-name")){
				//System.out.println(sCurrentLine);
				String username=sCurrentLine;
				System.out.println(username);
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document document = db.parse(new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\VP10.xml"));
				NodeList nodeList = document.getElementsByTagName("user-name");
				for (int i = 0; i < nodeList.getLength(); i++) {           
					  System.out.println(nodeList.getLength());     
					  Node n= nodeList.item(i);                            
					  System.out.println("\nCurrent Element :" + n.getNodeName());


					  if (n.getNodeType() == Node.ELEMENT_NODE) {
					    eElement = (Element) n.getChildNodes();
				}				
			
			
			try {
				File manifestfile=null;
				String userNmae=null;
				manifestfile= new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\VP10.xml");
				Manifest mf= new Manifest();
				sCurrentLine = br.readLine();
				InputStream is = new ByteArrayInputStream(sCurrentLine.getBytes());

				
					mf.read(is);
					Attributes atts = mf.getMainAttributes(); 
					userNmae =  atts.getValue("user-name");
					
					System.out.println(userNmae);

			}catch (Exception e) {
				e.printStackTrace();
			}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML
{
	static Person p;
	static List<Person> list = new ArrayList<Person>();
	static Document doc;

	public static void main(String[] args)
	{

		File f = new File("/media/jack_killer/work/my.xml");
		try
		{
			doc = parserXML(f);
			reader(doc, 0);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		for (Person person : list)
		{
			System.out.println(person.toString());
		}
	}

	private static void reader(Node node, int level)
	{
		NodeList nl = node.getChildNodes();
		String parent = "";
		String txt = "";
		for (int i = 0; i < nl.getLength(); i++)
		{
			if (nl.item(i).getNodeType() == Node.TEXT_NODE)
			{
				parent = nl.item(i).getParentNode().getNodeName();
				if (parent.equals("FName"))
				{
					p.setFName(nl.item(i).getNodeValue());
				}
				if (parent.equals("LName"))
				{
					p.setLName(nl.item(i).getNodeValue());
				}
				if (parent.equals("Age"))
				{
					p.setAge(Integer.parseInt(nl.item(i).getNodeValue()));
				}
			} else
			{
				if (nl.item(i).getNodeName().equals("person"))
				{
					p = new Person();
					p.setId(Integer.parseInt(nl.item(i).getAttributes().item(0)
							.getNodeValue()));
					list.add(p);
				}
			}
			reader(nl.item(i), level + 1);
		}
	}

	public static Document parserXML(File file) throws SAXException,
			IOException, ParserConfigurationException
	{
		return DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(file);
	}
}

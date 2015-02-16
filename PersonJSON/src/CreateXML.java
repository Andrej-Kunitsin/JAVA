import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
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

public class CreateXML
{
	static Document doc = null;
	public static void main(String[] args) throws ParserConfigurationException,
			FileNotFoundException, TransformerException
	{
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Dash1", "Solo1", 10));
		list.add(new Person(2, "Dash2", "Solo2", 20));
		list.add(new Person(3, "Dash3", "Solo3", 30));
		list.add(new Person(4, "Dash4", "Solo4", 40));
		list.add(new Person(5, "Dash5", "Solo5", 50));
		list.add(new Person(6, "Dash6", "Solo6", 60));
		list.add(new Person(7, "Dash7", "Solo7", 70));
		list.add(new Person(8, "Dash8", "Solo8", 80));

		File f = new File("/media/jack_killer/work/my.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		db = dbf.newDocumentBuilder();
		doc = db.newDocument();
		Element rootElement = doc.createElement("Persons");

		for (Person p : list)
		{
			rootElement.appendChild(addElement(p));
		}
		doc.appendChild(rootElement);

		Transformer t = TransformerFactory.newInstance().newTransformer();
		t.setOutputProperty(OutputKeys.METHOD, "xml");
		t.setOutputProperty(OutputKeys.INDENT, "yes");
		t.transform(new DOMSource(doc), new StreamResult(
				new FileOutputStream(f)));
	}

	private static Node addElement(Person p)
	{
		Element NameElementPerson = doc.createElement("person");
		NameElementPerson.setAttribute("id", Integer.toString(p.getId()));
		Element childElement = doc.createElement("FName");
		childElement.appendChild(doc.createTextNode(p.getFName()));
		NameElementPerson.appendChild(childElement);
		childElement = doc.createElement("LName");
		childElement.appendChild(doc.createTextNode(p.getLName()));
		NameElementPerson.appendChild(childElement);
		childElement = doc.createElement("Age");
		childElement
				.appendChild(doc.createTextNode(Integer.toString(p.getAge())));
		NameElementPerson.appendChild(childElement);
		return NameElementPerson;
	}
}

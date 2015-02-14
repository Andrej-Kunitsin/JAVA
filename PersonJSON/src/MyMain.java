import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.Elements;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class MyMain
{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException
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
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		Document doc = null;
			db = dbf.newDocumentBuilder();
			doc = db.parse("/media/jack_killer/work/qqq.xml");
		Element q =(Element) doc.getDocumentElement();
		Elements Q=  (Elements) q.getAttributes();
		System.out.println(Q);
	}

}

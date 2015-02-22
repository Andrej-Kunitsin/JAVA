package qwe;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class XX 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		List <Person> list = new ArrayList<Person>();
//		list.add(new Person(1, "Dash1", "Solo1", 10));
//		list.add(new Person(2, "Dash2", "Solo2", 20));
//		list.add(new Person(3, "Dash3", "Solo3", 30));
//		list.add(new Person(4, "Dash4", "Solo4", 40)); 
//		list.add(new Person(5, "Dash5", "Solo5", 50));
//		list.add(new Person(6, "Dash6", "Solo6", 60));
//		list.add(new Person(7, "Dash7", "Solo7", 70));
//		list.add(new Person(8, "Dash8", "Solo8", 80));
		
		
		
//		System.out.print("[");
//		for(Person p:list)
//		{
//			System.out.println(p.toJsonString());			
//		}
//		System.out.print("]");
		
		
//------------------------------------------------------
//		System.out.print("[");
//		for(Person p:list)
//		{
//			System.out.println(p.toXMLString());			
//		}
//		System.out.print("]");
//--------------------------------------------------------	
		
		 // String str = "{\"Id\":10,\"FName\":\"Vasia\",\"LName\":\"Pupkin\",\"Age\":16}";
		
		 String str = "<Person>\n    <Id>10</Id>\n    <FName>Vasia</FName>\n    <LName>Pupkin</LName>\n    <Age>16</Age>\n</Person>";
		  System.out.println(str);
		  Person p = new Person();
		  
		 
		  p.FromXMLString(str);
		  //p.fromJsonString(str);
		  System.out.println(p.toString());
		
		
		
//		Gson gs = new Gson();
//		String str = gs.toJson(list); //����� JSON
//		System.out.println(str);
//		ArrayList<Person> pp = gs.fromJson(str, new TypeToken<ArrayList<Person>>(){}.getType());
//		for(Person p:pp)
//		{
//			System.out.println(p);
//		}
		//----------------------------------------------------------------------		  
		//		  FileOutputStream zz = new FileOutputStream(new File("test.xml"));
		//		  XMLEncoder xe = new XMLEncoder (zz);
		//		  xe.writeObject(list);
		//		  xe.flush();

		//		FileInputStream zz = new FileInputStream(new File("test.xml"));
		//		XMLDecoder de = new XMLDecoder(zz);
		//		ArrayList<Person> pp = (ArrayList<Person>) de.readObject();
		//		for(Person p:pp)
		//		{
		//			System.out.println(p);
		//		}
	}
}

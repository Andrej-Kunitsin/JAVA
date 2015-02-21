package serialize;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Serializ {

	public List<Person> getListOfXML(String string) {
		List<Person> list = new ArrayList<Person>();
		
		return list;
	}
	public void saveInFile(File file, List<Person> list) {
		FileWriter outputStream;
		try {
			outputStream = new FileWriter(file);
			if (getFileExtention(file.getAbsolutePath()).equals("xml")) {
				outputStream.write(createXML(list));
			} else if (getFileExtention(file.getAbsolutePath()).equals("json")) {
				outputStream.write(createJSON(list));
			} else {
				System.out.println("не тупи!!!");
			}
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private String createXML(List<Person> list) {
		String string = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		string = string.concat("<Persons>\n");
		for (Person p : list) {
			string = string.concat("\t<person>\n");
			Field[] fields = p.getClass().getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				try {
					string = string.concat("\t\t<" + f.getName() + ">"
							+ f.get(p) + "</" + f.getName() + ">\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			string = string.concat("\t</person>\n");
		}
		string = string.concat("</Persons>");
		// System.out.println(string);
		return string;
	}

	private String createJSON(List<Person> list) {
		String string = "[";
		for (Person p : list) {
			string = string.concat("{");
			Field[] fields = p.getClass().getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				try {
					string = string.concat("\"" + f.getName() + "\":"
							+ f.get(p) + ",");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			string = string.substring(0, string.length() - 1) + "},";
		}
		string = string.substring(0, string.length() - 1) + "]";
		// System.out.println(string);
		return string;
	}

	private String getFileExtention(String fullPath) {
		int sepPos = fullPath.lastIndexOf(File.separator);
		String nameAndExt = fullPath.substring(sepPos + 1, fullPath.length());
		int dotPos = nameAndExt.lastIndexOf(".");
		return dotPos != -1 ? nameAndExt.substring(dotPos + 1) : "";
	}
}

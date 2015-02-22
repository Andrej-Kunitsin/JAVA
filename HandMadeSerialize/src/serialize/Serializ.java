package serialize;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Serializ
{
	public List<Person> getListOfJSON(File f)
	{
		List<Person> list = new ArrayList<Person>();
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader(f));
			String str = reader.readLine();
			str = str.substring(1, str.length() - 1);
			
			String[] personArr = str.split("[},{]");
			for (int i = 0; i < personArr.length; i++)
			{
				System.out.println(personArr[i]);
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<Person> getListOfXML(File f)
	{
		String string;
		List<Person> list = new ArrayList<Person>();
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader(f));
			while ((string = reader.readLine()) != null)
			{
				if (string.endsWith("<person>"))
				{
					Person p = new Person();
					string = reader.readLine();
					int start = string.indexOf("<Id>");
					int end = string.indexOf("</Id>");
					String str = string.substring(start + 4, end);
					p.setId(Integer.parseInt(str));

					string = reader.readLine();
					start = string.indexOf("<FName>");
					end = string.indexOf("</FName>");
					str = string.substring(start + 7, end);
					p.setFName(str);

					string = reader.readLine();
					start = string.indexOf("<LName>");
					end = string.indexOf("</LName>");
					str = string.substring(start + 7, end);
					p.setLName(str);

					string = reader.readLine();
					start = string.indexOf("<Age>");
					end = string.indexOf("</Age>");
					str = string.substring(start + 5, end);
					p.setAge(Integer.parseInt(str));
					System.out.println(p.toString());
					list.add(p);
				}
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try
			{
				reader.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

	public void saveInFile(File file, List<Person> list)
	{
		FileWriter outputStream;
		try
		{
			outputStream = new FileWriter(file);
			if (getFileExtention(file.getAbsolutePath()).equals("xml"))
			{
				outputStream.write(createXML(list));
			} else if (getFileExtention(file.getAbsolutePath()).equals("json"))
			{
				outputStream.write(createJSON(list));
			} else
			{
				System.out.println("не тупи!!!");
			}
			outputStream.flush();
			outputStream.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String createXML(List<Person> list)
	{
		String string = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		string = string.concat("<Persons>\n");
		for (Person p : list)
		{
			string = string.concat("\t<person>\n");
			Field[] fields = p.getClass().getDeclaredFields();
			for (Field f : fields)
			{
				f.setAccessible(true);
				try
				{
					string = string.concat("\t\t<" + f.getName() + ">"
							+ f.get(p) + "</" + f.getName() + ">\n");
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			string = string.concat("\t</person>\n");
		}
		string = string.concat("</Persons>");
		// System.out.println(string);
		return string;
	}

	private String createJSON(List<Person> list)
	{
		String string = "[";
		for (Person p : list)
		{
			string = string.concat("{");
			Field[] fields = p.getClass().getDeclaredFields();
			for (Field f : fields)
			{
				f.setAccessible(true);
				try
				{
					string = string.concat("\"" + f.getName() + "\":"
							+ f.get(p) + ",");
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			string = string.substring(0, string.length() - 1) + "},";
		}
		string = string.substring(0, string.length() - 1) + "]";
		// System.out.println(string);
		return string;
	}

	private String getFileExtention(String fullPath)
	{
		int sepPos = fullPath.lastIndexOf(File.separator);
		String nameAndExt = fullPath.substring(sepPos + 1, fullPath.length());
		int dotPos = nameAndExt.lastIndexOf(".");
		return dotPos != -1 ? nameAndExt.substring(dotPos + 1) : "";
	}
}

package myNew;

import java.awt.Component;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serializ
{
	public Serializ()
	{
	}

	public void saveXML(File file, List<Component> list)
	{
		FileOutputStream zz = null;
		XMLEncoder xe = null;
		try
		{
			zz = new FileOutputStream(file);
			xe = new XMLEncoder(zz);
			xe.writeObject(list);
			xe.flush();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{

			try
			{
				xe.close();
				zz.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public List<Component> openXML(File file)
	{
		FileInputStream reader = null;
		List<Component> list = null;
		XMLDecoder decoder = null;
		try
		{
			reader = new FileInputStream(file);
			decoder = new XMLDecoder(reader);
			list = (ArrayList<Component>) decoder.readObject();

		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try
			{
				reader.close();
				decoder.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public void saveJSON(File file, List<PanelFigure> list)
	{
		FileWriter fileWriter;
		try
		{
			fileWriter = new FileWriter(file);
			// Gson gson = new Gson();
			// String string = gson.toJson(list);
			// fileWriter.write(string);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

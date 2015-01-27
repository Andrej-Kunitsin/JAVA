package MyExplorer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jack-killer
 *
 */
public class Main implements Comparator<File>
{

	public static void main(String[] args) throws IOException
	{
		File inFile = new File("/home/jack-killer/Відео/1/");
		// File outFile = new File("/tmp/2.txt");
		readFolders(inFile, 0);
		// readConsol(inFile);
		// copyFile(inFile,outFile);
	}

	public static void readConsol(File inFile) throws IOException
	{
		FileReader reader = new FileReader(inFile);
		while (reader.ready())
		{
			System.out.print((char) reader.read());
		}

		reader.close();
	}

	public static void copyFile(File inFile, File outFile) throws IOException
	{
		FileInputStream inputStream = new FileInputStream(inFile);
		FileOutputStream outputStream = new FileOutputStream(outFile);
		while (inputStream.available() > 0)
		{
			outputStream.write(inputStream.read());
		}
		inputStream.close();
		outputStream.close();
	}

	static void readFolders(File patch, int depth)
	{
		File folder = patch;
		File[] files = folder.listFiles();
		Arrays.sort(files);
		for (File i : files)
		{
			toSpace(depth);
			if (i.isDirectory())
			{
				System.out.println(i.getAbsolutePath());
				toSpace(depth);
				readFolders(i, depth + 1);
			} else
			{
				System.out.println(i.getAbsolutePath());
			}
		}
	}

	public static void toSpace(int i)
	{
		for (int j = i; j > 0; j--)
		{
			System.out.print(" ");
		}
	}

	@Override
	public int compare(File o1, File o2)
	{
		int res = 0;
		if (o1.isDirectory() && o2.isDirectory())
		{
			res = o1.getName().compareTo(o2.getName());
		} else if (o1.isDirectory())
		{
			res = 1;
		} else if (o2.isDirectory())
		{
			res = -1;
		} else
		{
			res = o1.getName().compareTo(o2.getName());
		}
		return res;
	}

}
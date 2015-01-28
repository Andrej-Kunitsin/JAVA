package pain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SaveFile
{

	public SaveFile(BufferedImage draw, File selectedFile)
	{
		try
		{
			ImageIO.write(draw, "png", selectedFile);
		} catch (IOException io)
		{
			io.printStackTrace();
		}
	}

}

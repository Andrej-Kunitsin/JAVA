package pain;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SaveFile {

	public SaveFile(PanelDraw draw, File selectedFile) {
		BufferedImage image = (BufferedImage) draw.createImage(draw.getWidth(),
				draw.getHeight());
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		draw.paint(g2);
		g2.dispose();
		try {
			ImageIO.write(image, "jpeg", selectedFile);
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}

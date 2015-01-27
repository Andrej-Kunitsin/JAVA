package pain;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OpenFile {

	public OpenFile(PanelDraw draw, File file) {
		Image image = setImage(file);
		if(image!=null){
			Graphics2D g=(Graphics2D)draw.getGraphics();
			g.drawImage(image,0,0,400,600,draw);
		}
	}

	private Image setImage(File file) {
		Image resImage = null;
			try {
				resImage = ImageIO.read(file);
			} catch (IOException e) {
				System.out.println("Чтото с чтением файла не так!");
				e.printStackTrace();
			}
		return resImage;
	}

}

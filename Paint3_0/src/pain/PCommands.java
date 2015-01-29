package pain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PCommands {
	FSets sets = null;
	PanelDraw draw;

	ColorCmd colCmd = new ColorCmd();
	ColorCmdRed colCmdRed = new ColorCmdRed();
	ColorCmdGreen colCmdGreen = new ColorCmdGreen();
	ColorCmdBlue colCmdBlue = new ColorCmdBlue();

	WidthCmd_1 wCmd1 = new WidthCmd_1();
	WidthCmd_3 wCmd3 = new WidthCmd_3();
	WidthCmd_5 wCmd5 = new WidthCmd_5();
	WidthCmd_7 wCmd7 = new WidthCmd_7();
	WidthCmd_10 wCmd10 = new WidthCmd_10();

	Rectangle rect = new Rectangle();
	Circle circle = new Circle();
	Triangle triangl = new Triangle();
	FRectangle fRectangle = new FRectangle();
	Free free = new Free();

	OpenCmd openFile = new OpenCmd();
	SaveCmd saveFile = new SaveCmd();

	class OpenCmd implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			chooser.showOpenDialog(draw);
			
			new OpenFile(draw, chooser.getSelectedFile());
		}
	}

	class SaveCmd implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			chooser.showSaveDialog(draw);
			File file = new File(chooser.getSelectedFile().getAbsolutePath()
					+ ".jpg");
			new SaveFile(sets.image, file);
		}
	}

	class ColorCmd implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.col = JColorChooser.showDialog(null, "Select Color", sets.col);
		}
	}

	class ColorCmdRed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.col = Color.red;
		}
	}

	class ColorCmdGreen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.col = Color.green;
		}
	}

	class ColorCmdBlue implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.col = Color.blue;
		}
	}

	class WidthCmd_1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.width = 1;
		}
	}

	class WidthCmd_3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.width = 3;
		}
	}

	class WidthCmd_5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.width = 5;
		}
	}

	class WidthCmd_7 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.width = 7;
		}
	}

	class WidthCmd_10 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.width = 10;
		}
	}

	class Rectangle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.mFigure = new FigureRect(draw);
			draw.addMListener(sets.mFigure);
			draw.addMyMotionListener(sets.mFigure);

		}
	}

	class Circle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.mFigure = new FigureCircle(draw);
			draw.addMListener(sets.mFigure);
			draw.addMyMotionListener(sets.mFigure);
		}
	}

	class Triangle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.mFigure = new FigureTriangl(draw);
			draw.addMListener(sets.mFigure);
			draw.addMyMotionListener(sets.mFigure);
		}
	}

	class FRectangle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.mFigure = new FigureFRect(draw);
			draw.addMListener(sets.mFigure);
			draw.addMyMotionListener(sets.mFigure);
		}
	}

	class Free implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sets.mFigure = new FigureFree(draw);
			draw.addMListener(sets.mFigure);
			draw.addMyMotionListener(sets.mFigure);
		}
	}
}

package myNew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Menu extends JMenuBar
{
	JMenu jMenu;
	JMenuItem itemLoad;
	JMenuItem itemSave;
	JMenuItem itemClose;
	PanelDraw panel;

	public Menu(PanelDraw panelDraw)
	{
		panel = panelDraw;
		jMenu = new JMenu("File");

		itemLoad = new JMenuItem("Load");
		itemSave = new JMenuItem("Save");
		itemClose = new JMenuItem("Exit");

		jMenu.add(itemLoad);
		jMenu.add(itemSave);
		jMenu.addSeparator();
		jMenu.add(itemClose);

		add(jMenu);

		itemLoad.addActionListener(new ActionListener()
		{
			Serializ serializ = new Serializ();

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Serializ serializ = new Serializ();
				JFileChooser fileChooser = new JFileChooser();
				int r = fileChooser.showOpenDialog(null);
				if (r == JFileChooser.APPROVE_OPTION)
				{
					File file = fileChooser.getSelectedFile();
					if (file.getAbsolutePath().endsWith(".xml"))
					{
						List<PanelFigure> figures = serializ.openXML(file);
						for (PanelFigure figure : figures)
						{
							panel.add(figure);
						}
						panel.repaint();
					}
				}
			}
		});
		itemSave.addActionListener(new ActionListener()
		{
			Serializ serializ = new Serializ();

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fileChooser = new JFileChooser();

				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(
						"*.json", "json"));
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(
						"*.xml", "xml"));
				int r = fileChooser.showSaveDialog(null);
				if (r == JFileChooser.APPROVE_OPTION)
				{
					FileFilter ff = fileChooser.getFileFilter();
					System.out.println(ff.getDescription());
					String format = "";
					File file;
					switch (ff.getDescription())
					{
					case "*.json":
						format = "json";
						file = new File(fileChooser.getSelectedFile()
								.getAbsolutePath() + "." + format);
						serializ = new Serializ();
						//serializ.saveJSON(file,sets.list);
						break;

					case "*.xml":
						format = "xml";
						file = new File(fileChooser.getSelectedFile()
								.getAbsolutePath() + "." + format);
						serializ = new Serializ();
						//serializ.saveXML(file, sets.list);
						break;
					case "All Files":
						file = fileChooser.getSelectedFile();
						if (file.getAbsolutePath().endsWith(".xml"))
						{
							serializ = new Serializ();
						//	serializ.saveXML(file, sets.list);
						} else if (file.getAbsolutePath().endsWith(".json"))
						{
							serializ = new Serializ();
							//serializ.saveJSON(file, sets.list);
						} else
						{
							throw new IllegalArgumentException();
						}
					}
				}

			}
		});

		itemClose.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
}

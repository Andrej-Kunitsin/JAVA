package myNew;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelFigure extends JPanel implements MouseListener,
		MouseMotionListener, FocusListener {
	private static final long serialVersionUID = 1L;

	public Figures fig;
	private int dx = 0;
	private int dy = 0;

	public PanelFigure() {
	}

	public PanelFigure(Sets sets) {
		fig = sets.mFigure;
		setOpaque(false);
		setBackground(Color.LIGHT_GRAY);
		addMouseListener(this);
		addMouseMotionListener(this);
		addFocusListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (isFocusable()) {
			((Graphics2D) g).setStroke(new BasicStroke(5));
		} else {
			((Graphics2D) g).setStroke(new BasicStroke(2));
			removeAll();
		}
		if (fig == Figures.Rectangl) {
			g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		} else if (fig == Figures.Cicle) {
			g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		dx = e.getX();
		dy = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point pp = getLocation();
		pp.translate(e.getX() - dx, e.getY() - dy);
		setLocation(pp);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocusInWindow();
		repaint();
	}

	@Override
	public void focusGained(FocusEvent e) {
		setOpaque(true);
		repaint();
	}

	@Override
	public void focusLost(FocusEvent e) {
		setOpaque(false);
		for (Component cc : getComponents()){
			cc.setVisible(false);
		}
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		setFocusable(true);
		new ResizePanelButton(this);
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}

package myNew;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ResizePanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	final JButton top = new JButton();
	JButton bottom = new JButton();
	JButton left = new JButton();
	JButton rigth = new JButton();
	JButton centr = new JButton();
	JButton topLeft = new JButton();
	JButton topRigth = new JButton();
	JButton bottomLeft = new JButton();
	JButton bottomRigth = new JButton();
	int dx;
	int dy;
	private PanelFigure figure;

	public ResizePanel(PanelFigure figure) {
		this.figure = figure;
		createPoints();
	}

	private void createPoints() {
		top.setBounds(figure.getWidth() / 2 - 5, 0, 10, 10);
		bottom.setBounds(figure.getWidth() / 2 - 5, figure.getHeight() - 10,
				10, 10);
		left.setBounds(0, figure.getHeight() / 2 - 5, 10, 10);
		rigth.setBounds(figure.getWidth() - 10, figure.getHeight() / 2 - 5, 10,
				10);
		topLeft.setBounds(0, 0, 10, 10);
		topRigth.setBounds(figure.getWidth() - 10, 0, 10, 10);
		bottomLeft.setBounds(0, figure.getHeight() - 10, 10, 10);
		bottomRigth.setBounds(figure.getWidth() - 10, figure.getHeight() - 10,
				10, 10);
		centr.setBounds(figure.getWidth() / 2 - 5, figure.getHeight() / 2 - 5,
				10, 10);

		figure.add(top);
		figure.add(bottom);
		figure.add(rigth);
		figure.add(left);
		figure.add(centr);
		figure.add(topLeft);
		figure.add(topRigth);
		figure.add(bottomLeft);
		figure.add(bottomRigth);

		top.addMouseListener(this);
		top.addMouseMotionListener(this);
		bottom.addMouseListener(this);
		bottom.addMouseMotionListener(this);
		left.addMouseListener(this);
		left.addMouseMotionListener(this);
		rigth.addMouseListener(this);
		rigth.addMouseMotionListener(this);
		topLeft.addMouseListener(this);
		topLeft.addMouseMotionListener(this);
		topRigth.addMouseListener(this);
		topRigth.addMouseMotionListener(this);
		bottomLeft.addMouseListener(this);
		bottomLeft.addMouseMotionListener(this);
		bottomRigth.addMouseListener(this);
		bottomRigth.addMouseMotionListener(this);
		centr.addMouseListener(this);
		centr.addMouseMotionListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		dx = e.getX();
		dy = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int hash = e.getSource().hashCode();
		Point pp = figure.getLocation();
		if (hash == top.hashCode()) {
			pp.translate(0, e.getY() - dy);
			figure.setSize(figure.getWidth(),
					dy - e.getY() + figure.getHeight());
		} else if (hash == bottom.hashCode()) {
			figure.setSize(figure.getWidth(),
					e.getY() - dy + figure.getHeight());
			dy = e.getY();
		} else if (hash == left.hashCode()) {
			pp.translate(e.getX() - dx, 0);
			figure.setSize(dx - e.getX() + figure.getWidth(),
					figure.getHeight());
		} else if (hash == rigth.hashCode()) {
			figure.setSize(e.getX() - dx + figure.getWidth(),
					figure.getHeight());
			dx = e.getX();
		} else if (hash == topLeft.hashCode()) {
			pp.translate(e.getX() - dx, e.getY() - dy);
			figure.setSize(dx - e.getX() + figure.getWidth(), dy - e.getY()
					+ figure.getHeight());
		} else if (hash == topRigth.hashCode()) {
			pp.translate(0, e.getY() - dy);
			figure.setSize(e.getX() - dx + figure.getWidth(), dy - e.getY()
					+ figure.getHeight());
			dx = e.getX();
		} else if (hash == bottomLeft.hashCode()) {
			pp.translate(e.getX() - dx, 0);
			figure.setSize(dx - e.getX() + figure.getWidth(), e.getY() - dy
					+ figure.getHeight());
			dy = e.getY();
		} else if (hash == bottomRigth.hashCode()) {
			figure.setSize(e.getX() - dx + figure.getWidth(), e.getY() - dy
					+ figure.getHeight());
			dx = e.getX();
			dy = e.getY();
		} else if (hash == centr.hashCode()) {
			pp.translate(e.getX() - dx, e.getY() - dy);
		}

		figure.setLocation(pp);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
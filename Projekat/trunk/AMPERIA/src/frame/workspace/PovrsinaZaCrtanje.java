package frame.workspace;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import frame.helpers.ImageFilter;
import frame.popupmenu.WorkSpacePopupMenu;

public class PovrsinaZaCrtanje extends JPanel {

	private static final long serialVersionUID = 1L;
	private WorkSpacePopupMenu workSpacePopupMenu = new WorkSpacePopupMenu();
	private int skalabilnost = 10;
	private String dijagram;

	public PovrsinaZaCrtanje(String dijagram) {

		setPreferredSize(new Dimension(15000, 15000));
		setBackground(Color.WHITE);
		setComponentPopupMenu(workSpacePopupMenu);
		
		this.dijagram = dijagram;

	}

	public void paint(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g.create();

		for (int i = 0; i < getWidth(); i += skalabilnost) {
			for (int j = 0; j < getHeight(); j += skalabilnost) {
				g.setColor(new Color(151, 171, 215));
				g.drawRect(i, j, 1, 1);
			}
		}

		g2d.drawImage(ImageFilter.getTestDiagram(dijagram), 7780, 7650, 450, 450, this);

		g2d.dispose();

	}

}
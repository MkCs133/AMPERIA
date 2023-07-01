package frame.workspace;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class RadnaPovrsina extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PanelTab pnlTab1 = null;
	PanelTab pnlTab2 = null;
	JScrollPane sp1 = null;
	JScrollPane sp2 = null;

	public RadnaPovrsina() {

		Rectangle bounds1 = null;
		Dimension size1 = null;

		Rectangle bounds2 = null;
		Dimension size2 = null;
		
		
		int x = 0;
		int y = 0;

		pnlTab1 = new PanelTab("Dijagram 1");
		pnlTab2 = new PanelTab("Dijagram 2");

		sp1 = new JScrollPane(new PovrsinaZaCrtanje("Dijagrami/dijagram1.png"));
		sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		bounds1 = sp1.getViewport().getViewRect();
		size1 = sp1.getViewport().getViewSize();
		x = (size1.width - bounds1.width) / 2;
		y = (size1.height - bounds1.height) / 2;
		sp1.getViewport().setViewPosition(new Point(x, y));

		sp2 = new JScrollPane(new PovrsinaZaCrtanje("Dijagrami/dijagram2.png"));
		sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		bounds2 = sp2.getViewport().getViewRect();
		size2 = sp2.getViewport().getViewSize();
		x = (size2.width - bounds2.width) / 2;
		y = (size2.height - bounds2.height) / 2;
		sp2.getViewport().setViewPosition(new Point(x, y));

		addTab("", sp1);
		setTabComponentAt(0, pnlTab1);
		addTab("", sp2);
		setTabComponentAt(1, pnlTab2);
	}
}

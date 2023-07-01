package frame.popupmenu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import listeneri.PopupMenuListener;

public class WorkSpacePopupMenu extends JPopupMenu {

	private static final long serialVersionUID = 1L;

	JMenuItem menuItemPonistiPrethodniKorak = null;
	JMenuItem menuItemPovratiPonisteniKorak = null;
	JMenuItem menuItemIsjecanje = null;
	JMenuItem menuItemKopiranje = null;
	JMenuItem menuItemLijepljenje = null;
	JMenuItem menuItemOznaciSve = null;
	JCheckBoxMenuItem cbMreza = null;
	JMenuItem menuItemObrisiOznaceneElemente = null;
	JMenuItem menuItemUrediElement = null;
	JMenuItem menuItemSkalabilnostMreze = null;
	JMenuItem menuItemBojaPozadine = null;
	JMenuItem menuPodesavanjaRadnePovrsine = null;
	JMenuItem menuItemZatvori = null;

	public WorkSpacePopupMenu() {

		PopupMenuListener popupMenuListener = new PopupMenuListener();
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		menuItemPonistiPrethodniKorak = new JMenuItem("Poništi prethodni korak");
		menuItemPonistiPrethodniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		Image undoImage = toolkit.getImage("Ikonice/undo.png");
		menuItemPonistiPrethodniKorak.setIcon(new ImageIcon(undoImage));
		menuItemPonistiPrethodniKorak.setActionCommand("popupMenuItem");
		menuItemPonistiPrethodniKorak.addActionListener(popupMenuListener);
		add(menuItemPonistiPrethodniKorak);

		menuItemPovratiPonisteniKorak = new JMenuItem("Povrati poništeni korak");
		menuItemPovratiPonisteniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		Image redoImage = toolkit.getImage("Ikonice/redo.png");
		menuItemPovratiPonisteniKorak.setIcon(new ImageIcon(redoImage));
		menuItemPovratiPonisteniKorak.setActionCommand("popupMenuItem");
		menuItemPovratiPonisteniKorak.addActionListener(popupMenuListener);
		add(menuItemPovratiPonisteniKorak);

		addSeparator();

		menuItemIsjecanje = new JMenuItem("Isjeci");
		menuItemIsjecanje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		Image cutImage = toolkit.getImage("Ikonice/cut.png");
		menuItemIsjecanje.setIcon(new ImageIcon(cutImage));
		menuItemIsjecanje.setActionCommand("popupMenuItem");
		menuItemIsjecanje.addActionListener(popupMenuListener);
		add(menuItemIsjecanje);

		menuItemKopiranje = new JMenuItem("Kopiraj");
		menuItemKopiranje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		Image copyImage = toolkit.getImage("Ikonice/copy.png");
		menuItemKopiranje.setIcon(new ImageIcon(copyImage));
		menuItemKopiranje.setActionCommand("popupMenuItem");
		menuItemKopiranje.addActionListener(popupMenuListener);
		add(menuItemKopiranje);

		menuItemLijepljenje = new JMenuItem("Zalijepi");
		menuItemLijepljenje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		Image pasteImage = toolkit.getImage("Ikonice/paste.png");
		menuItemLijepljenje.setIcon(new ImageIcon(pasteImage));
		menuItemLijepljenje.setActionCommand("popupMenuItem");
		menuItemLijepljenje.addActionListener(popupMenuListener);
		add(menuItemLijepljenje);

		addSeparator();
		
		cbMreza = new JCheckBoxMenuItem("Prikaz mreže za crtanje");
		cbMreza.setState(true);
		cbMreza.setActionCommand("popumMenuItem");
		cbMreza.addActionListener(popupMenuListener);
		
		
		menuItemSkalabilnostMreze = new JMenuItem("Skalabilnost mreže");
		Image scaleImage = toolkit.getImage("Ikonice/scale.png");
		menuItemSkalabilnostMreze.setIcon(new ImageIcon(scaleImage));
		menuItemSkalabilnostMreze.setActionCommand("popupMenuItem");
		menuItemSkalabilnostMreze.addActionListener(popupMenuListener);
		
		menuItemBojaPozadine = new JMenuItem("Promijeni boju pozadine");
		Image paintImage = toolkit.getImage("Ikonice/paint.png");
		menuItemBojaPozadine.setIcon(new ImageIcon(paintImage));
		menuItemBojaPozadine.setActionCommand("popupMenuItem");
		menuItemBojaPozadine.addActionListener(popupMenuListener);

		menuPodesavanjaRadnePovrsine = new JMenu("Podešavanja radne površine");
		menuPodesavanjaRadnePovrsine.add(menuItemSkalabilnostMreze);
		menuPodesavanjaRadnePovrsine.add(cbMreza);
		addSeparator();
		menuPodesavanjaRadnePovrsine.add(menuItemBojaPozadine);
		add(menuPodesavanjaRadnePovrsine);
		
		


		addSeparator();

		menuItemObrisiOznaceneElemente = new JMenuItem("Obriši označene elemente");
		menuItemObrisiOznaceneElemente.setActionCommand("popupMenuItem");
		menuItemObrisiOznaceneElemente.addActionListener(popupMenuListener);
		add(menuItemObrisiOznaceneElemente);
		
		menuItemUrediElement = new JMenuItem("Uredi element");
		Image editImage = toolkit.getImage("Ikonice/edit.png");
		menuItemUrediElement.setIcon(new ImageIcon(editImage));
		menuItemUrediElement.setActionCommand("popupMenuItem");
		menuItemUrediElement.addActionListener(popupMenuListener);
		add(menuItemUrediElement);


		add(menuItemUrediElement);

		addSeparator();

		menuItemZatvori = new JMenuItem("Zatvori");
		menuItemZatvori.setActionCommand("popupMenuItem");
		menuItemZatvori.addActionListener(popupMenuListener);
	}
}

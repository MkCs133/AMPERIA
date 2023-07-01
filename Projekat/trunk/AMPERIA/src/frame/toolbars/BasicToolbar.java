package frame.toolbars;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeneri.ToolbarListener;

public class BasicToolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	private JButton newButton = null;
	private JButton openButton = null;
	private JButton deleteButton = null;
	private JButton saveButton = null;

	ToolbarListener fileMenuListener = new ToolbarListener();

	public BasicToolbar() {

		setName("Basic toolbar");
		newButton = new JButton();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image documentImage = toolkit.getImage("Ikonice/new.png");
		newButton.setIcon(new ImageIcon(documentImage));
		newButton.setToolTipText("Dodaj");
		newButton.setActionCommand("toolbarButton");
		newButton.addActionListener(fileMenuListener);
		add(newButton);

		openButton = new JButton();
		Image openImage = toolkit.getImage("Ikonice/open.png");
		openButton.setIcon(new ImageIcon(openImage));
		openButton.setToolTipText("Otvori");
		openButton.setActionCommand("toolbarButton");
		openButton.addActionListener(fileMenuListener);
		add(openButton);
		
		deleteButton = new JButton();
		Image deleteImage = toolkit.getImage("Ikonice/delete.png");
		deleteButton.setIcon(new ImageIcon(deleteImage));
		deleteButton.setToolTipText("Izbrisi");
		deleteButton.setActionCommand("toolbarButton");
		deleteButton.addActionListener(fileMenuListener);
		add(deleteButton);
		
		saveButton = new JButton();
		Image saveImage = toolkit.getImage("Ikonice/save.png");
		saveButton.setIcon(new ImageIcon(saveImage));
		saveButton.setToolTipText("Sačuvaj");
		saveButton.setActionCommand("toolbarButton");
		saveButton.addActionListener(fileMenuListener);
		add(saveButton);
	}
}

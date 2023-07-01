package frame.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeneri.ToolbarListener;

public class EditToolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	private JButton cutButton = null;
	private JButton copyButton = null;
	private JButton pasteButton = null;
	private JButton undoButton = null;
	private JButton redoButton = null;

	ToolbarListener fileMenuListener = new ToolbarListener();
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	public EditToolbar() {

		cutButton = new JButton();
		Image cutImage = toolkit.getImage("Ikonice/scissors.png");
		cutButton.setIcon(new ImageIcon(cutImage));
		cutButton.setToolTipText("Isjeci");
		cutButton.setActionCommand("toolbarButton");
		cutButton.addActionListener(fileMenuListener);
		add(cutButton);

		copyButton = new JButton();
		Image copyImage = toolkit.getImage("Ikonice/copy.png");
		copyButton.setIcon(new ImageIcon(copyImage));
		copyButton.setToolTipText("Kopiraj");
		copyButton.setActionCommand("toolbarButton");
		copyButton.addActionListener(fileMenuListener);
		add(copyButton);

		pasteButton = new JButton();
		Image pasteImage = toolkit.getImage("Ikonice/paste.png");
		pasteButton.setIcon(new ImageIcon(pasteImage));
		pasteButton.setToolTipText("Nalijepi");
		pasteButton.setActionCommand("toolbarButton");
		pasteButton.addActionListener(fileMenuListener);
		add(pasteButton);

		addSeparator();

		undoButton = new JButton();
		Image undoImage = toolkit.getImage("Ikonice/undo.png");
		undoButton.setIcon(new ImageIcon(undoImage));
		undoButton.setToolTipText("Povratak na prethodni korak");
		undoButton.setActionCommand("toolbarButton");
		undoButton.addActionListener(fileMenuListener);
		add(undoButton);

		redoButton = new JButton();
		Image redoImage = toolkit.getImage("Ikonice/redo.png");
		redoButton.setIcon(new ImageIcon(redoImage));
		redoButton.setActionCommand("toolbarButton");
		redoButton.setToolTipText("Povratak na ponisteni korak");
		redoButton.addActionListener(fileMenuListener);
		add(redoButton);
	}
}

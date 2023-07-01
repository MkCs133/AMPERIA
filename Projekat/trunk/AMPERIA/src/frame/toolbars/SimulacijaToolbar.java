package frame.toolbars;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import listeneri.ToolbarListener;

public class SimulacijaToolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	private JButton startPauseButton = null;
	private JButton stopButton = null;
	private JButton saveDataButton = null;

	ToolbarListener fileMenuListener = new ToolbarListener();
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	public SimulacijaToolbar() {

		startPauseButton = new JButton();
		Image startPauseImage = toolkit.getImage("Ikonice/startPause.png");
		startPauseButton.setIcon(new ImageIcon(startPauseImage));
		startPauseButton.setToolTipText("Pokreni/Pauziraj simulaciju");
		startPauseButton.setActionCommand("toolbarButton");
		startPauseButton.addActionListener(fileMenuListener);
		add(startPauseButton);

		addSeparator();

		stopButton = new JButton();
		Image stopImage = toolkit.getImage("Ikonice/stop.png");
		stopButton.setIcon(new ImageIcon(stopImage));
		stopButton.setToolTipText("Zaustavi simulaciju");
		stopButton.setActionCommand("toolbarButton");
		stopButton.addActionListener(fileMenuListener);
		add(stopButton);

		addSeparator();

		saveDataButton = new JButton();
		Image saveDataImage = toolkit.getImage("Ikonice/saveData.png");
		saveDataButton.setIcon(new ImageIcon(saveDataImage));
		saveDataButton.setToolTipText("Sacuvaj podatke simulacije");
		saveDataButton.setActionCommand("toolbarButton");
		saveDataButton.addActionListener(fileMenuListener);
		add(saveDataButton);
	}
}

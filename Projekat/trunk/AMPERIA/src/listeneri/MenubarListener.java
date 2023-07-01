package listeneri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.MainFrame;

public class MenubarListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "menubarButton":
			JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}

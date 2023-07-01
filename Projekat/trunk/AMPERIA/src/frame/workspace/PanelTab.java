package frame.workspace;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTab extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lblNaslov = null;
	JButton btnClose = null;

	GridBagConstraints gbc = null;

	public PanelTab() {
		setLayout(new GridBagLayout());
		setOpaque(false);

		lblNaslov = new JLabel();

		btnClose = new JButton("X");
		btnClose.setOpaque(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorderPainted(false);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;

		add(lblNaslov, gbc);

		gbc.gridx += 1;
		gbc.weightx = 0;
		add(btnClose, gbc);
	}

	public PanelTab(String naslov) {
		setLayout(new GridBagLayout());
		setOpaque(false);

		lblNaslov = new JLabel(naslov);

		btnClose = new JButton("X");
		btnClose.setOpaque(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorderPainted(false);

		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;

		add(lblNaslov, gbc);

		gbc.gridx += 1;
		gbc.weightx = 0;
		add(btnClose, gbc);
	}

}

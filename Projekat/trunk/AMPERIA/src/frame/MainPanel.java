package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.panels.RadnaPovrsinaPanel;
import frame.panels.StatubarPanel;
import frame.panels.ToolbarPanel;
import frame.panels.ToolboxPanel;
import frame.panels.TreeViewPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainPanel() {

		setLayout(new BorderLayout());

		add(new RadnaPovrsinaPanel(), BorderLayout.CENTER);

		add(new ToolbarPanel(), BorderLayout.NORTH);

		add(new TreeViewPanel(), BorderLayout.WEST);

		add(new StatubarPanel(), BorderLayout.SOUTH);
		
		add(new ToolboxPanel(), BorderLayout.EAST);
		
	

		JLabel toolbox = new JLabel("Toolbox");
		toolbox.setFont(new Font("Arial", Font.CENTER_BASELINE, 24));
		toolbox.setForeground(Color.black);

		/*JPanel toolboxPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		toolboxPanel.setBackground(Color.yellow);
		toolboxPanel.add(toolbox);
		toolboxPanel.setPreferredSize(new Dimension(250, 0));
		add(toolboxPanel, BorderLayout.EAST);
		//add(new ToolboxPanel(), BorderLayout.EAST);*/
		
		

		setBackground(Color.WHITE);
	}

}

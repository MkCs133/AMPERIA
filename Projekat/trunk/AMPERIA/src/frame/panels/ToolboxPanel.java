package frame.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.nio.ByteOrder;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.grid_layout.CustomGridLayout;
import frame.toolbox.Toolbox;

public class ToolboxPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private CustomGridLayout gridLayout;

    public ToolboxPanel() {
    	
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 300));
        
        gridLayout = new CustomGridLayout(3, 3, 3); 
        JPanel toolboxContainer = new JPanel(gridLayout);
        toolboxContainer.add(new Toolbox());
        

        
        JLabel label = new JLabel("Komponente");
        label.setFont(new Font("Arial", 1, 14));
        label.setForeground(Color.white);
		
        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(new Color(151, 171, 215));
        labelPanel.add(label);
       // add(labelPanel);
        
        JPanel label2Panel = new JPanel();
        label2Panel.setBackground(new Color(0, 171, 215));
 
        
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(labelPanel);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(toolboxContainer);
        verticalBox.add(Box.createVerticalGlue());
     

        add(verticalBox, BorderLayout.NORTH);
    }
}
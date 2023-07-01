package frame.popupmenu;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import listeneri.PopupMenuListener;

public class ProjectPopupMenu extends JPopupMenu {

	private JMenuItem project = null;
	private JMenuItem diagram= null;
	private JMenuItem newProject = null;
	private JMenuItem openProject = null;
	private JMenu save = null;
	private JMenuItem deleteProject = null;
	private JMenuItem cutProject = null;
	private JMenuItem copyProject = null;
	private JMenuItem pasteProject = null;
	private JMenuItem renameProject = null;

	private static final long serialVersionUID = 1L;

	public ProjectPopupMenu() {

		PopupMenuListener popupMenuListener = new PopupMenuListener();

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		newProject = new JMenuItem("Novi dijagram");
		Image newImage = toolkit.getImage("Ikonice/new.png");
		newProject.setIcon(new ImageIcon(newImage));
		newProject.setActionCommand("popupMenuItem");
		newProject.addActionListener(popupMenuListener);
		add(newProject);
		
		project = new JMenuItem("Projekat");
		Image projectImage = toolkit.getImage("Ikonice/puProject.png");
		project.setIcon(new ImageIcon(projectImage));
		project.setActionCommand("popupMenuItem");
		project.addActionListener(popupMenuListener);


		diagram = new JMenuItem("Dijagram");
		Image diagramImage = toolkit.getImage("Ikonice/puDiagram.png");
		diagram.setIcon(new ImageIcon(diagramImage));
		diagram.setActionCommand("popupMenuItem");
		diagram.addActionListener(popupMenuListener);
		
		
		save = new JMenu("Sačuvaj");
		Image saveImage = toolkit.getImage("Ikonice/save.png");
		save.setIcon(new ImageIcon(saveImage));
		save.setActionCommand("popupMenuItem");
		save.addActionListener(popupMenuListener);
		
		save.add(project);
		save.add(diagram);
		add(save);

		openProject = new JMenuItem("Otvori projekat");
		Image openImage = toolkit.getImage("Ikonice/open.png");
		openProject.setIcon(new ImageIcon(openImage));
		openProject.setActionCommand("popupMenuItem");
		openProject.addActionListener(popupMenuListener);
		add(openProject);

		deleteProject = new JMenuItem("Obrisi projekat");
		Image deleteImage = toolkit.getImage("Ikonice/delete.png");
		deleteProject.setIcon(new ImageIcon(deleteImage));
		deleteProject.setActionCommand("popupMenuItem");
		deleteProject.addActionListener(popupMenuListener);
		add(deleteProject);

		addSeparator();

		cutProject = new JMenuItem("Isjeci");
		Image cutImage = toolkit.getImage("Ikonice/scissors.png");
		cutProject.setIcon(new ImageIcon(cutImage));
		cutProject.setActionCommand("popupMenuItem");
		cutProject.addActionListener(popupMenuListener);
		add(cutProject);

		copyProject = new JMenuItem("Kopiraj");
		Image copyImage = toolkit.getImage("Ikonice/copy.png");
		copyProject.setIcon(new ImageIcon(copyImage));
		copyProject.setActionCommand("popupMenuItem");
		copyProject.addActionListener(popupMenuListener);
		add(copyProject);

		pasteProject = new JMenuItem("Nalijepi");
		Image pasteImage = toolkit.getImage("Ikonice/paste.png");
		pasteProject.setIcon(new ImageIcon(pasteImage));
		pasteProject.setActionCommand("popupMenuItem");
		pasteProject.addActionListener(popupMenuListener);
		add(pasteProject);

		renameProject = new JMenuItem("Preimenuj");
		Image renameImage = toolkit.getImage("Ikonice/rename.png");
		renameProject.setIcon(new ImageIcon(renameImage));
		renameProject.setActionCommand("popupMenuItem");
		renameProject.addActionListener(popupMenuListener);
		add(renameProject);
	}
}

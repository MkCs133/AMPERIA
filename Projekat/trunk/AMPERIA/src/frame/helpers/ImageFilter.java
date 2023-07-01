package frame.helpers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.filechooser.*;

public class ImageFilter extends FileFilter {

	// Accept all directories and all gif, jpg, tiff, or png files.
	public boolean accept(File f) {
		if (f.isDirectory()) {
			return true;
		}

		String extension = Utils.getExtension(f);
		if (extension != null) {
			if (extension.equals(Utils.tiff) || extension.equals(Utils.tif) || extension.equals(Utils.gif)
					|| extension.equals(Utils.jpeg) || extension.equals(Utils.jpg) || extension.equals(Utils.png)) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	// The description of this filter
	public String getDescription() {
		return "Just Images";
	}

	public static BufferedImage getTestDiagram(String slika) {
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File(slika));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return myPicture;
	}

}
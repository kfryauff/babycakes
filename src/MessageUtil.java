

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 * @author kfryauff
 *
 */
public class MessageUtil {
    public static void showAlert(Component parent, String message) {
        System.out.println("ALERT: " + message);
		JOptionPane.showMessageDialog(parent, message, "Alert", JOptionPane.DEFAULT_OPTION);
    }
    
    public static void showError(Component parent, String message, Exception e) {
		System.out.printf("ERROR: %s :: %s%n",  message, e.toString());
		System.out.printf("       %s -L%d%n", e.getStackTrace()[0].getFileName(), e.getStackTrace()[0].getLineNumber());
		JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
        //e.printStackTrace();
    }
	
	public static final int FILES_AND_DIRECTORIES = JFileChooser.FILES_AND_DIRECTORIES;
	public static final int DIRECTORIES_ONLY = JFileChooser.DIRECTORIES_ONLY;
	public static final int FILES_ONLY = JFileChooser.FILES_ONLY;
	public static final int SAVE = -8;
	public static final int OPEN = -13;
	
	public static File getPath(Component parent, int disp, int selection) {
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(selection);
		int r;
		
		if(disp==SAVE) {
			r = jfc.showSaveDialog(parent);
		} else if(disp==OPEN) {
			r = jfc.showOpenDialog(parent);
		} else {
			throw new IllegalArgumentException("Invalid display mode!");
		}
		
		if(r==JFileChooser.APPROVE_OPTION) {
			return jfc.getSelectedFile();
		} else {
			return null;
		}
	}
    public static File getPath(Component parent, int disp, int selection, String path) {
        JFileChooser jfc = new JFileChooser(path);
        jfc.setFileSelectionMode(selection);
        int r;
        
        if(disp==SAVE) {
            r = jfc.showSaveDialog(parent);
        } else if(disp==OPEN) {
            r = jfc.showOpenDialog(parent);
        } else {
            throw new IllegalArgumentException("Invalid display mode!");
        }
        
        if(r==JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile();
        } else {
        return null;
        }
    }
}
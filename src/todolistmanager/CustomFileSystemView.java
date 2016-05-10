package todolistmanager;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

/**
 * @author Tyler Cromwell
 * 
 * Forces JFileChooser to stay within a certain directory.
 */
public class CustomFileSystemView extends FileSystemView {
    File root;
    File[] roots = new File[1];

    public CustomFileSystemView(File root) {
        super();
        this.root = root;
        this.roots[0] = root;
    }

    @Override
    public File createNewFolder(File containingDir) {
        File folder = new File(containingDir, "New Folder");
        folder.mkdir();
        return folder;
    }

    @Override
    public File getDefaultDirectory() {
        return this.root;
    }

    @Override
    public File getHomeDirectory() {
        return this.root;
    }

    @Override
    public File[] getRoots() {
        return this.roots;
    }
}
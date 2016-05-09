package todolistmanager;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Tyler Cromwell
 */
public class TaskListPrinter implements Printable {
    private final int PAGE_WIDTH = 612;
    private final int PAGE_HEIGHT = 792;
    private final int IMAGEABLE_WIDTH = 468;
    private final int IMAGEABLE_HEIGHT = 648;
    private int[] pageBreaks;
    private ArrayList<String> textLines;
    private File file;

    public TaskListPrinter(File file) {
        this.textLines = new ArrayList();
        this.file = file;
    }

    private boolean readfile() {
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                this.textLines.add(line);
            }

            fileReader.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException: "+ fnfe.getMessage());
            return false;
        }
        catch (IOException ioe) {
            System.out.println("IOException: "+ ioe.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        Font font = new Font("Serif", Font.PLAIN, 12);
        FontMetrics metrics = g.getFontMetrics(font);
        int lineHeight = metrics.getHeight();

        Paper p = pf.getPaper();
        p.setSize(this.PAGE_WIDTH, this.PAGE_HEIGHT);
        p.setImageableArea(72, 72, this.IMAGEABLE_WIDTH, this.IMAGEABLE_HEIGHT);

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(p.getImageableX(), p.getImageableY());

        if (this.pageBreaks == null) {
            if (readfile() == false) {
                return Printable.NO_SUCH_PAGE;
            }

            int linesPerPage = (int) (p.getImageableHeight() / lineHeight) + 1;
            int breaks = (this.textLines.size()-1) / linesPerPage;
            this.pageBreaks = new int[breaks];

            for (int b = 0; b < breaks; b++) {
                this.pageBreaks[b] = (b+1) * linesPerPage; 
            }
        }

        if (page > this.pageBreaks.length) {
            return Printable.NO_SUCH_PAGE;
        }

        int y = 0; 
        int start = (page == 0) ? 0 : this.pageBreaks[page-1];
        int end = (page == this.pageBreaks.length) ? this.textLines.size() : this.pageBreaks[page];

        for (int line = start; line < end; line++) {
            int width = metrics.stringWidth(this.textLines.get(line));

            if (width > this.IMAGEABLE_WIDTH) {
                String data = new String(this.textLines.get(line)); /* Create a deep copy of the original */
                int lines = (int) Math.ceil(width / (double) this.IMAGEABLE_WIDTH);
                int first = 0;
                int last = 0;

                /* Remove original from list */
                this.textLines.remove(line);

                /* Chunk the original line */
                for (int l = 0; l < lines; l++) {
                    int sum = 0;

                    for (last = first; last < data.length(); last++) {
                        if (sum >= this.IMAGEABLE_WIDTH) {
                            break;
                        }

                        sum += metrics.charWidth(data.charAt(last));
                    }

                    String temp = data.substring(first, last);
                    this.textLines.add(line + l, temp);
                    first = last;
                }
            }

            g.drawString(this.textLines.get(line), 0, y);
            y += lineHeight;
        }

        return Printable.PAGE_EXISTS;
    }
}
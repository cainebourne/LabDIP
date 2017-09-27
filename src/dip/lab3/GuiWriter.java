
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Cainebourne
 */
public class GuiWriter implements Writer{
    @Override
    public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}


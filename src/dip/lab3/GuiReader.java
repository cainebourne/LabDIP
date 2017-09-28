
package dip.lab3;


import javax.swing.JOptionPane;

/**
 *
 * @author Cainebourne
 */
public class GuiReader implements Reader {
    

    @Override
    public String readln() {
        
        
        
        String message = JOptionPane.showInputDialog("Enter your message");
         
        return message;
    
    }
    
}

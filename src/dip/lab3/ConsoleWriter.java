
package dip.lab3;

/**
 *
 * @author Cainebourne
 */
public class ConsoleWriter implements Writer {
    
        @Override
	public void writeln( String line ) {
            System.out.println("Here is the message you entered.");
            System.out.println( line );
	}
}
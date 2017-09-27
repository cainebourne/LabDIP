/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Cainebourne
 */
public class Messenger {
        private Reader reader;
	private Writer writer;

	public Messenger( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}
	
	public void showMessage() {
            String line = reader.readln();
            writer.writeln( line );
	}
}

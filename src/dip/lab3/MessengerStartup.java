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
public class MessengerStartup {
    public static void main(String[] args) {
                Reader reader = new  KeyboardReader();
		Writer writer = new ConsoleWriter();
                
                Messenger messenger = new Messenger( reader, writer );
		messenger.showMessage();
    }
}
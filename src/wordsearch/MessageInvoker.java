/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 *
 * @author Marius
 */
public class MessageInvoker {
    public Command command;

    public MessageInvoker(Command c){
        this.command = c;
    }

    public void execute(){
        this.command.execute();
    }
}

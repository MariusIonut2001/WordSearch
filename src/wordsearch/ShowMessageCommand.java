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
public class ShowMessageCommand implements Command{
    private MessageCommand mes;
    BoardDisplay UI;
    int level;
    
    public ShowMessageCommand(MessageCommand mess, BoardDisplay UI, int level) {
        this.mes = mess;
        this.UI = UI;
        this.level = level;
    }
    
    @Override
    public void execute() {
        mes.showMessage(UI, level);
    }
}

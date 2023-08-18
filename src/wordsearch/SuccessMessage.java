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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SuccessMessage implements MessageCommand{
private JFrame frame=null;
BoardDisplay buildGridBoardDisplay = new BoardDisplay(8, 15);
    @Override
   
    public void showMessage(BoardDisplay UI, int level) {
        Object[] options = {"Play Again", "Quit"};
             int n = JOptionPane.showOptionDialog(frame, "You Win!", "Congratulations", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
             if(n == 0){
				frame.getContentPane().removeAll();
				buildGridBoardDisplay.buildGrid();
			}else{
				frame.dispose();
			}
    }
    
}

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
public class WordSearch {
	private static Dialog dialog;
	public static void main(String args[]){
			configure();
			runBusinessLogic();
		}
	static void configure() {
		dialog = new WindowsDialog();
	}

	static void runBusinessLogic() {
		dialog.renderWindow();

	}
}

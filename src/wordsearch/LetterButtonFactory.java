///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package wordsearch;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Insets;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
///**
// *
// * @author Marius
// */
//class LetterButtonFactory {
//    private String letter;
//    private boolean selected;
//    private int xPos;
//    private int yPos;
//    private boolean foundWord;
//    String[] randLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",  "N", "O", "P", "Q",
//				 "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
//		Random r = new Random();
//    private Map<String, LetterButton> letterButtons = new HashMap<>();
//
//    public LetterButtonFactory() {
//        for (String letter : randLetters) {
//            letterButtons.put(letter, new LetterButton(letter,xP,yP));
//        }
//    }
//
//    public LetterButton getLetterButton(String letter) {
//        return letterButtons.get(letter);
//    }
//    public void toggle(){
//		setSelected(!selected);
//	}
//	
//	public void setLetter(String l){
//		letter = l.substring(0,1);
//		setText(letter);
//	}
//	
//	/**
//	 * Accessor of the letter variable
//	 * @return the letter variable
//	 */
//	public String getLetter(){
//		return letter;
//	}
//	
//	/**
//	 * Modifier of the selected variable
//	 * Set if the button was selected or not
//	 * If button is selected, the colour of it is darker
//	 * Otherwise if not, then the button would be white or cyan, 
//	 * depending if it's part of a found word or not
//	 * @param s - the boolean variable of selected
//	 */
//	public void setSelected(boolean s){
//		this.selected = s;
//		if(s)
//			setBackground(new Color(0xe6, 0xe6, 0xe6));
//		else if(foundWord)
//			setBackground(Color.CYAN);
//		else
//			setBackground(Color.WHITE);
//	}
//	
//	/**
//	 * Accessor of the selected variable
//	 * @return selected variable
//	 */
//	public boolean getSelected(){
//		return selected;
//	}
//	
//	/**
//	 * Accessor of the xPos variable
//	 * @return xPos - the x position of the button
//	 */
//	public int getXPos(){
//		return xPos;
//	}
//	
//	/**
//	 * Modifier of the xPos variable
//	 * @param x,  the new value of xPos
//	 */
//	public void setXPos(int x){
//		xPos = x;
//	}
//	
//	/**
//	 * Accessor of the yPos variable
//	 * @return yPos - the y position of the button
//	 */
//	public int getYPos(){
//		return yPos;
//	}
//	
//	/**
//	 * Modifier of the yPos variable
//	 * @param y,  the new value of yPos
//	 */
//	public void setYPos(int y){
//		yPos = y;
//	}
//
//	/**
//	 * Accessor for the found word variable
//	 * @return foundWord variable
//	 */
//	public boolean isFoundWord() {
//		return foundWord;
//	}
//
//	/**
//	 * Modifier for the found word variable
//	 * If the new value is true, change the button colour into cyan
//	 * @param foundWord - the new value of the foundWord variable
//	 */
//	public void setFoundWord(boolean foundWord) {
//		this.foundWord = foundWord;
//		if(foundWord)
//			setBackground(Color.CYAN);
//	}
//}

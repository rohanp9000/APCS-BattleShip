import BreezySwing.*;

import java.awt.Color;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.swing.*;
import javax.swing.border.*;

import javax.swing.*;

public class Board extends GBFrame{
	JButton [][] arrayButtons = new JButton[11][11];
	
	public Board(){
		for(int i =0; i < arrayButtons.length; i++){
			for(int j = 1; j < arrayButtons[0].length; j++){
				JButton b = new JButton();
				
                
				b =  addButton("", i, j, 1, 1);
				
                b.setIcon(new ImageIcon("src/img4.jpg"));
                
                b.setBackground(Color.BLUE);
                arrayButtons[i][j] = b;
			}
		}
	}

	public void buttonClicked(JButton buttonObj){
		for(int i =0; i < arrayButtons.length; i++){
			for(int j = 0; j < arrayButtons[0].length; j++){
				if(buttonObj == arrayButtons[i][j]){
					
					if(Math.random()<.5){
						arrayButtons[i][j].setIcon(new ImageIcon("src/img2.jpg"));
						arrayButtons[i][j].setBackground(Color.RED);
					}
					else{
					
		                ImageIcon icon = new ImageIcon(new BufferedImage(299, 168, BufferedImage.TYPE_INT_ARGB));
		                arrayButtons[i][j].setIcon(icon);
		                arrayButtons[i][j].setBackground(Color.WHITE);
					}	
				}
			}
		}
	}
	
	/**
	 * Main Method
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		Board GUI = new Board();
		GUI.setSize(700, 700);
		GUI.setVisible(true);
		
		Board GUI2 = new Board();
		GUI2.setSize(700, 700);
		GUI2.setVisible(true);


	}

}






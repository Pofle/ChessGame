package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Init a window with the game title
		JFrame window = new JFrame("Chess Game");
		// Close the window shut down the program
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		//Add GamePanel to the window
		GamePanel gp = new GamePanel();
		window.add(gp);
		window.pack(); // window adjusts its size to the GamePanel
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		//After creating window start a thread
		gp.launchGame();
	}
	
}

package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	// Parameters
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;
	final int FPS = 60;
	Thread gameThread; // To run the game loop
	Board board = new Board(); // Instanciate the board class
		
	// Constructor
	public GamePanel() {
		// Set the window size & background color
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
	}
	
	// Methods
	public void launchGame() {
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	@Override
	public void run() {
		//GAME LOOP
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long LastTime = System.nanoTime();
		long currentTime;
		
		while (gameThread != null) 
			{
				currentTime = System.nanoTime();
				delta += (currentTime - LastTime)/drawInterval;
				LastTime = currentTime;
				
				if (delta >= 1) 
				{
					update();
					repaint();
					delta --;
				}
			}
		}
	
	// Methods
	private void update() {
		
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g); // Use to draw objects on GamePanel
	}

	
	
	


}

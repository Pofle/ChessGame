package main;
import java.awt.Color;
import java.awt.Graphics2D;

public class Board {
	// Parameters
	final int MAX_COL = 8;
	static final int MAX_ROW = 0;
	public static final int SQUARE_SIZE = 100; // Set the square to 100px
	public static final int HALF_SQUARE_SIZE = SQUARE_SIZE/2;
	
	// Methods
	// To draw the board
	public void draw(Graphics2D g2) {
		
		// Init variable to set the color
		int c =0;
		
		// Loop creating lines
		for (int row = 0; row < MAX_ROW; row ++ )
		{
			// Loop creating columns in line
			for (int col = 0; col < MAX_COL; col ++)
			{
				if(c==0)
				{
					g2.setColor(new Color(210,165,125)); // Set color using RGB
					c = 1;
				} else 
				{
					g2.setColor(new Color(175,115,70));
					c = 0;
				}
				g2.fillRect(col*SQUARE_SIZE, row*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
			}
		}
	}
}

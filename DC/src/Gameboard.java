//
/**
 * A chinese checkers gameboard
 * 
 * @author lecomtel
 *
 *
 */
public class Gameboard extends ChineseCheckers
{
	// TODO write comment
	 private int[][] gameBoard = null;

	 // TODO write comment
	 // TODO initialize field in constructore, not here
	 private final int X = 0;

	 // TODO write comment
	 // TODO initialize field in constructore, not here
	 private final int Y = 0;
	
	 /**
		* Creates a new gameboard is in its starting configuration
		*		                  1					row 1
		*		                 1 1 				row 2
		*		                1 1 1				row 3
		*		               1 1 1 1				row 4
		*		      2 2 2 2 x x x x x 6 6 6 6		row 5
		*	column1--/ 2 2 2 x x x x x x 6 6 6  	row 6
		*	column2---/ 2 2 x x x x x x x 6 6 		row 7 
		*	column3----/ 2 x x x x x x x x 6 		row 8
		*   column4-----/ x x x x x x x x x 		row 9
		*	             3 x x x x x x x x 5  		row 10
		*		        3 3 x x x x x x x 5 5  		row 11
		*		       3 3 3 x x x x x x 5 5 5     	row 12
		*		      3 3 3 3 x x x x x 5 5 5 5   	row 13
		*	 column5-/ / / / / 4 4 4 4              row 14   
		*	 column6--/ / / / / 4 4 4    			row 15
		*	 column7---/ / / / / 4 4				row 16
		*	 column8----/ / / / / 4					row 17
		*	 column9-----/ / / / / 
		*	 column10-----/ / / / 
		*    column11------/ / / 
		*    column12-------/ / 
		*    column13--------/ 
		* 
		*/ 
	public Gameboard()
	{
		
		while(X<=17)
		{
			while(Y <= 21)
			{
				
			}
		}
		
		
	}

}

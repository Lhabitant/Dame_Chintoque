//
/**
 * A chinese checkers gameboard
 * 
 * @author lecomtel
 *
 *
 */
public class Gameboard
{
	/**
	 *  We create a gameboard  
	 */
	 private int[][] gameBoard;

	
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
		*	 column5-/ / / / / 4 4 4 4 / / / /      row 14   
		*	 column6--/ / / / / 4 4 4 / / /	/		row 15
		*	 column7---/ / / / / 4 4 / / / /		row 16
		*	 column8----/ / / / / 4	/ /	/ /			row 17
		*	 column9-----/ / / / / / / / /
		*	 column10-----/ / / / / / / /
		*    column11------/ / / / / / /
		*    column12-------/ / / / / /
		*    column13--------/ / / / /
		*	 column14---------/ / / /
		* 	 column15----------/ / /
		* 	 column16-----------/ /
		*  	 column17------------/
		*/ 
	public Gameboard()
	{
		int X = 0;
		int Y = 0;
		
		while(X<=17)
		{
			while(Y <= 17)
			{
				gameBoard[X][Y] = 0;
			}
		}
		 X = 0;
		 Y = 0;
		
		while(X<=17)
		{
			while(Y <= 17)
			{
				if(X<5)
				{
					gameBoard[X][Y] = 1;
				}
				if(X>17)
				{
					gameBoard[X][Y] = 4;
				}
				if(Y<4)
				{
					gameBoard[X][Y] = 2;
				}
				if(X==10 && Y==5 || X==11 && Y>4 && Y<7 || X==12 && Y>4 && Y<8 || X==13 && Y>4 && Y<9)
				{
					gameBoard[X][Y] = 3;
				}
				if(Y<13)
				{
					gameBoard[X][Y] = 5;
				}
				if(X==5 && Y>9 && Y<14 || X==6 && Y>10 && Y<14 || X==7 && Y>11 && Y<14 || X==8 && Y==13)
				{
					gameBoard[X][Y] = 6;
				}

			}
		}		
		
	}

	public void PrintGameBoard()
	{
		int X = 0;
		int Y = 0;
		
		while(X<=17)
		{
			while(Y <= 17)
			{
				System.out.println(gameBoard[X][Y]);
			}
	}
	}
}

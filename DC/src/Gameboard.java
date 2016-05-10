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
		 this.gameBoard = new int [17][17];
		int X = 0;
		int Y = 0;
		
		while(X<17)
		{
			while(Y < 17)
			{
				gameBoard[X][Y] = 0;
				Y++;
			}
			X++;
		}
		 X = 0;
		 Y = 0;
		
		while(X<17)
		{
			Y = 0;
			while(Y < 17)
			{
				if(X==3 && Y<8 && Y>3 || X==2 && Y<7 && Y>3 || X==1 && Y<6 && Y>3 || X==0 && Y==4)
				{
					gameBoard[X][Y] = 1;
				}
				if(X==13 && Y<13 && Y>8 || X==14 && Y<13 && Y>9 || X==15 && Y<13 && Y>10 || X==16 && Y==12)
				{
					gameBoard[X][Y] = 4;
				}
				if(X==4 && Y<4 || X==5 && Y>0 && Y<4 || X==6 && Y>1 && Y<4 || X==7 && Y==3 )
				{
					gameBoard[X][Y] = 2;
				}
				if(X==9 && Y==4 || X==10 && Y>3 && Y<6 || X==11 && Y>3 && Y<7 || X==12 && Y>3 && Y<8)
				{
					gameBoard[X][Y] = 3;
				}
				if(X==9 && Y==13 || X==10 && Y<15 && Y>12 || X==11 && Y<16 && Y>12 || X==12 && Y>12)
				{
					gameBoard[X][Y] = 5;
				}
				if(X==4 && Y>8 && Y<13 || X==5 && Y>9 && Y<13 || X==6 && Y>10 && Y<13 || X==7 && Y==12)
				{
					gameBoard[X][Y] = 6;
				}
				Y++;
				System.out.println(Y);
			}
			X++;
			System.out.println(X+"X");
		}		
		
	}
/*
	public void printGameBoard()
	{
		int X = 0;
		int Y = 0;
		
		
		while(X<=16)
		{
			while(Y<=16)
			{
				System.out.println(gameBoard[X][Y]);
				Y++;
			}
			X++;
		}
	}
*/	
	public String toString()
	{
		String display = "";
		int t = 16;
		for (int i = 0; i < this.gameBoard.length; i++)
		{
			for(int s = 0; s < t-i; s++)
			{
				display+=" ";
			}
			//display+=this.gameBoard[i];
			for (int j = 0; j < this.gameBoard[i].length; j++)
			{
				display+=this.gameBoard[i][j] + " ";
			}
			display+="\n";
		}
		System.out.println(display);
		return display;
	}
}



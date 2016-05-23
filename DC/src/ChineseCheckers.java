import java.util.Scanner;


/**
 * this class represents a chinese checkers
 * 
 * @author lecomtel
 */
public class ChineseCheckers 
{
	// TODO declare as constant	
	/**
	 * the number of player who can play 
	 */
	private final static int NUMBER_OF_PLAYERS = 6; 
	
	/**
	 * it's the gameboard
	 */
	private Gameboard gameBoard;
	
	/**
	 * Create a keyboard's reader
	 */
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Create a new game ready to be played 
	 * (the gameboard is in its starting configuration)
	 */
	public ChineseCheckers()
	{
		this.gameBoard = new Gameboard();
	}
	
	/**
	 * this method is use for calculate the movement of a piece in X
	 * @param X
	 * @param X0
	 * @return X0
	 */
	public int playerMoveX(int X, int X0)	
	{
		X0 = X;
		return X0; 
	}
	/**
	 * this method is use for calculate the movement of a piece in Y
	 * @param Y
	 * @param Y0
	 * @return Y0
	 */
	public int playerMoveY(int Y, int Y0)
	{
		Y0 = Y;
		return Y0; 
	}

	// TODO detail comment (algorithm)
	/**
	 * plays the game (...)
	 *  <current player is player1>
	 *	while (<game is not over>)
	 *  {
	 *  	do
	 * 		{
	 *  		<ask current player for a move>
	 * 		}
	 * 		while (<move is not valid>)
	 * 		<process move>
	 *      <update current player>
	 *  }
	 *  	
	 */
	public void play() 
	{	
		int currentPlayerNumber = 1;
		boolean won = false;
		
		int X;
		int Y;
		int Y0;
		int X0;
		while (!won) 
		{
				X = sc.nextInt();
				Y = sc.nextInt();
				
				X0 = sc.nextInt();
				Y0 = sc.nextInt();
		}
			while ((X0 != 0) && (Y0 != 0))
			
			{
					X = sc.nextInt();
					Y = sc.nextInt();
					
					X0 = sc.nextInt();
					Y0 = sc.nextInt();
					
					
					this.gameBoard[X][Y] ;
					this.gameBoard[X0][Y0] = currentPlayerNumber;
			}
			currentPlayerNumber++;
		}
	}
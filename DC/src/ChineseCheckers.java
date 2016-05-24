import java.util.Scanner;


/**
 * this class represents a chinese checkers
 * 
 * @author lecomtel
 */
public class ChineseCheckers 
{
	/**
	 * the number of player who can play 
	 */
	private final static int NUMBER_OF_PLAYERS = 6; 
	public static int currentPlayerNumber = 1;
	
	/**
	 * it's the gameboard
	 */
	private Gameboard gameBoard;
	
	/**
	 * Create a keyboard's reader
	 */
	static Scanner sc = new Scanner(System.in);
	
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
	 * @return x
	 */
	public static int playerMoveX()	
	{
		int x = sc.nextInt();
		return x; 
	}
	/**
	 * this method is use for calculate the movement of a piece in Y
	 * @return y
	 */
	public static int playerMoveY()
	{
		int y = sc.nextInt();
		return y; 
	}
	
	public static int getCurrentplayer()
	{
		
		return currentPlayerNumber;
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
	public void move(Gameboard game)
	{
		boolean won = false;
		while (!won) 
		{
			game.modGameBoard();
			currentPlayerNumber++;
			if(currentPlayerNumber >= 7)
			{
				currentPlayerNumber = 1;
			}	
			
		}
		
	}
	
	
	
	}
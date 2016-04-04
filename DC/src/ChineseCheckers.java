
/**
 * this class is use for make a new game
 * 
 * @author lecomtel
 */
public class ChineseCheckers
{
	// TODO fix comment (ask for advice)	
	/**
	 * this attribut is for the number of player who can play 
	 */
	private final int nbrPlayer = 6; 

	// TODO write comment
	private int turn;

	// TODO write "javadoc" comment
	// it's the gameboard
	private Gameboard gameBoard;
	
	/**
	 * Create a new game ready to be played 
	 * (the gameboard is in its starting configuration)
	 */
	public ChineseCheckers()
	{
		this.gameBoard = new Gameboard();
	}


	// TODO detail comment (algorithm)
	/**
	 * plays the game (...)
	 */
	public void play() 
	{	
		while(/* Conditon : the game isn't won */) 
		{
				if(Turn == 0) // it's the turn of the player 1
				{
					/*
					 * if a piece jump over a other piece it isn't incremented
					 * else if a piece don't jump over a other piece it's incremented
					 */
				}
				else if(Turn == 1) // it's the turn of the player 2
				{
				
				}
				else if(Turn == 2) // it's the turn of the player 3
				{
				
				}
				else if(Turn == 3) // it's the turn of the player 4
				{
				
				}
				else if(Turn == 4) // it's the turn of the player 5
				{
				
				}
				else if(Turn == 5) // it's the turn of the player 6
				{
					
				}
		
		}
	}//

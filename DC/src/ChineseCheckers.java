// TODO write comment DONE
// TODO rewrite this class according to the Main (a constuctor and a method called play) DONE
/**
 * this class is use for make a new game
 * 
 * @author lecomtel
 */
public class ChineseCheckers
{
	// TODO write comment DONE
	// TODO rename field (not compliant with coding conventions) DONE
	/**
	 * this attribut is for the number of player who can play 
	 */
	private final int nbrPlayer = 6; 
	
	// TODO rename field (not compliant with coding conventions) DONE
	private int turn;
	
	// it's the gameboard
	private Gameboard gameBoard;
	
	
	// TODO rewrite comment (english), explain what means "a game ready to be played"
	// TODO think DONE ?
	/**
	 * a game ready to be played
	 * the gameboard is in its starting configuration
	 */
	public ChineseCheckers()
	{
		this.gameBoard = new Gameboard();
		
	}


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

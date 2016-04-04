
/**
 * this class is use for make a new game
 * 
 * @author lecomtel
 */
public class ChineseCheckers
{
	// TODO declare as constant	
	/**
	 * the number of player who can play 
	 */
	private final int NBRPLAYER = 6; 
 
	/**
	 * Number of the player currently playing
	 */
	private int currentNumberPlayer;
	
	/**
	 * current position of a piece
	 */
	private int X;
	private int Y;
	/**
	 * the futur position
	 */
	private int X0;
	private int Y0;
	
	/**
	 *  if a piece can jumpOver a other piece
	 */
	private boolean jumpOver;
	/**
	 * it's the gameboard
	 */
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
	 *while win == 0 do
	 *	while currentNumberPlayer < nbrPlayer do
	 *			do currentNumberPlayer++
	 *		jumpOver = true
	 *		if currentNumberPlayer == 1
	 *			entrer les coordonnées du pion sélectionné X Y
	 *			entrer ou il va aller X0 Y0
	 *			if gameBoard[X0][Y0] == 0
	 *				X = X0
	 *				Y = Y0
	 *			endif 
	 *			if gameBoard[X0][Y0] != 0
	 *				X0 = X0+(X0 - X)
	 *				Y0 = Y0+(Y0 - Y)
	 *				if gameBoard [X0][Y0] != 0
	 *					X = X0
	 *					Y = Y0
	 *					jumpOver == true
	 *				endif
	 *			endif
	 *		endif 
	 *	endwhile
	 *endwhile
	 */
	public void play() 
	{	
		while(win = 0) 
		{
			while (currentNumberPlayer < NBRPLAYER)
			{
				currentNumberPlayer++;
				jumpOver = true;
				if(currentNumberPlayer == 0) // it's the turn of the player 1
				{
					/*
					 * get piece XY
					 * get XY movement
					 */
					if (this.gameBoard[this.X][this.Y] == 0)
					{
						this.X = this.X0;
						this.Y = this.Y0;
					}
					if (this.gameBoard[this.X0][this.Y0] != 0)
					{
						this.X0 = this.X0+(this.X0 - this.X);
						this.Y0 = this.Y0+(this.Y0 - this.Y);
						if (this.gameBoard [this.X0][this.Y0] != 0)
						{
							this.X = this.X0;
							this.Y = this.Y0;
							this.jumpOver = true;
						}
					}
				}
				else if(currentNumberPlayer == 1) // it's the turn of the player 2
				{
				
				}
				else if(currentNumberPlayer == 2) // it's the turn of the player 3
				{
				
				}
				else if(currentNumberPlayer == 3) // it's the turn of the player 4
				{
				
				}
				else if(currentNumberPlayer == 4) // it's the turn of the player 5
				{
				
				}
				else if(currentNumberPlayer == 5) // it's the turn of the player 6
				{
					
				}
		
		}
	}//

// TODO write comment
// TODO rewrite this class according to the Main (a constuctor and a method called play)
public class ChineseCheckers
{
	// TODO write comment
	// TODO rename field (not compliant with coding conventions)
	private final int Nbrplayer = 6;
	
	// TODO rename field (not compliant with coding conventions)	
	private int Turn;
	
	// it's the gameboard
	private Gameboard gameBoard;
	
	
	// TODO rewrite comment (english), explain what means "a game ready to be played"
	// TODO think 
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
	public void play() {
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

	
	/* RULE IN FRENCH // We need to translate that 
	 * Chaque joueur dispose de dix pions repartis dans leurs branches
	 * respectives. Ils possedent une couleur diff�rente en fonction du joueur.
	 *
	 * Le jeu ce joue a six joueur chacun leur tour. Le but du jeu est
	 * d'atteindre la branche opoose. Les pions peuvent ce deplacer dans six
	 * directions. Pour eliminer un autre pion, on doit etre juxtaposer a ce
	 * dernier, si apres avoir eliminer un piont on se retrouve encore
	 * juxtaposer a un autre pion on peut encore l'eliminer, ainsi de suite.
	 */

}

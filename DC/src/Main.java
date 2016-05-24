import java.util.Scanner;


/**
 * The class main is used for starting a game
 * @author PC_Loic
 *
 */
public class Main
{
	// Is use for read the keyboard
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		Gameboard game= new Gameboard(); 
		game.toString();//trying to diplay the gameboard
		new ChineseCheckers().move(game);
		//new ChineseCheckers().play(); // it call the lunch of a new party
		// ...
	
	}

}

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
		System.out.println("test");
		new Gameboard(); 
		System.out.println("toast");
		new Gameboard().toString();//trying to diplay the gameboard
		//new ChineseCheckers().play(); // it call the lunch of a new party
		// ...
		System.out.println("TEST");
	}

}

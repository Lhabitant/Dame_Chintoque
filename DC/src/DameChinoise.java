public class DameChinoise {
	private final int NmbreJoueur = 6;
	private int Tour;
	/* 
	 *  La methode table permet de creer le plateau de jeu. Ce dernier a une forme 
	 *  d'etoile de David, dans chaque branche il y a les pions des differents joueurs.
	 *  Chaque case est de forme hexagonale.
	 */
	public void Table()
	{
		new Table();
	}
	/*
	 *  Chaque joueur dispose de dix pions repartis dans leurs branches respectives.
	 *  Ils possedent une couleur différente en fonction du joueur.
	 */
	public void pion()
	{
		pion pionJ1 = new pion();
		pion pionJ2 = new pion();
		pion pionJ3 = new pion();
		pion pionJ4 = new pion();
		pion pionJ5 = new pion();
		pion pionJ6 = new pion();
	}
	/*
	 * Le jeu ce joue a six joueur chacun leur tour.
	 * Le but du jeu est d'atteindre la branche opoose.
	 * Les pions peuvent ce deplacer dans six directions.
	 * Pour eliminer un autre pion, on doit etre juxtaposer a ce dernier, si apres avoir
	 * eliminer un piont on se retrouve encore juxtaposer a un autre pion on peut encore 
	 * l'eliminer, ainsi de suite.
	 */
	public void regle()
	{
		new deplacement();
	}
}

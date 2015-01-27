package api;

public class MainSolution
{

	public static void main(String[] args)
	{
		Panel p = new Panel();
		System.out.println("Исходное поле");
		p.toPrint();
		System.out.println("Необходимые ходы: ");
		Game game = new Game(p);
		game.printStepGame();
	}
}

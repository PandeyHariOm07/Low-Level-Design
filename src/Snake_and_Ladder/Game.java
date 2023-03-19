package Snake_and_Ladder;
import java.util.*;
public class Game {
	Board board;
	Dice dice;
	Deque<Player> playersList = new LinkedList<>();
	Player winner;
	public Game() {
		initializeGame();
	}
	private void initializeGame() {
		board = new Board(10,9,4);
		dice = new Dice(1);
		winner = null;
		addPlayers();
	}
	private void addPlayers() {
		Player player1 = new Player("p1",0);
		Player player2 = new Player("p2",0);
		playersList.add(player1);
		playersList.add(player2);

	}
	public void startGame() {
		while(winner ==null) {
			Player playerTurn = findPlayerTurn();
			System.out.println("Player Turn is: "+playerTurn.id + " Current Position is: "+playerTurn.currentPosition);
			
			int diceNumbers = dice.rollDice();
			int playerNewPosition = playerTurn.currentPosition + diceNumbers;
			playerNewPosition = jumpCheck(playerNewPosition);
			playerTurn.currentPosition = playerNewPosition;
			
			System.out.println("Player Turn is: "+ " New Position is: "+playerNewPosition);
			if(playerNewPosition >=board.cells.length * board.cells.length-1) {
				winner = playerTurn;
			}
		}
		System.out.println("Winner Is: "+ winner.id);
	}
	private Player findPlayerTurn() {
		Player playerTurns  = playersList.removeFirst();
		playersList.addLast(playerTurns);
		return playerTurns;
	}
	private int jumpCheck(int playerNewPosition) {
		if(playerNewPosition>board.cells.length*board.cells.length-1) {
			return playerNewPosition;
		}
		Cell cell = board.getCell(playerNewPosition);
		if(cell.jump !=null && cell.jump.start == playerNewPosition) {
			String jumpBy = (cell.jump.start<cell.jump.end)?"Ladder":"snake";
			System.out.println("Jump Done by: "+jumpBy);
			return cell.jump.end;
		}
		return playerNewPosition;
	}
}

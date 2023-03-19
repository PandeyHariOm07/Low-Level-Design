package Snake_and_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell[][] cells;
	Board(int bs,int snake,int ladder){
		initializeCell(bs);
		addSnakesLadders(cells,snake,ladder);
	}
	private void addSnakesLadders(Cell[][] cells, int snake, int ladder) {
		while(snake>0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			if(snakeTail>snakeHead) {
				continue;
			}
			Jump snakeObj = new Jump();
			snakeObj.start = snakeHead;
			snakeObj.end = snakeTail;
			
			Cell cell = getCell(snakeHead);
			cell.jump = snakeObj;
			snake--;
		}
		while(ladder>0) {
			int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			if(ladderStart>ladderEnd) {
				continue;
			}
			Jump ladderObj = new Jump();
			ladderObj.start = ladderStart;
			ladderObj.end = ladderEnd;
			
			Cell cell = getCell(ladderStart);
			cell.jump = ladderObj;
			ladder--;
		}
	}
	
	Cell getCell(int playerPosition) {
		int boardRow = playerPosition / cells.length;
		int boardCol = (playerPosition % cells.length);
		return cells[boardRow][boardCol];
	}
	private void initializeCell(int bs) {
		cells= new Cell[bs][bs];
		for(int i=0;i<bs;i++) {
			for(int j=0;j<bs;j++) {
				Cell cellobj = new Cell();
				cells[i][j] = cellobj;
			}
		}
	}
}

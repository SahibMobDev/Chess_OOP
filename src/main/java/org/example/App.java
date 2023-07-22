package org.example;

/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args ) {

        Board board = new Board();
        board.setupDefaultPeacesPositions();

        BoardConsoleRenderer boardConsoleRenderer = new BoardConsoleRenderer();
        boardConsoleRenderer.render(board);
    }
}

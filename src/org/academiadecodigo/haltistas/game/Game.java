package org.academiadecodigo.haltistas.game;

public class Game {



    public Game(){

    }

    public void init(){

        Board board = new Board();
        board.init ();

        Cursor cursor = new Cursor();
        cursor.init();

    }
}

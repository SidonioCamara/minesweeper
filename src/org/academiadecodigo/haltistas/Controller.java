package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.game.Game;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler{


    private Game game;


    public Controller(Game game){
        this.game = game;
    }


    public void init(){





    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

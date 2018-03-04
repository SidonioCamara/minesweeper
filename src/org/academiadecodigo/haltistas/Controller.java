package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.game.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {


    private Game game;


    public Controller(Game game) {
        this.game = game;
    }


    public void init() {

        Keyboard k = new Keyboard(this);

        int[] keys = new int[]{
                KeyboardEvent.KEY_UP,
                KeyboardEvent.KEY_DOWN,
                KeyboardEvent.KEY_LEFT,
                KeyboardEvent.KEY_RIGHT,
        };

        for (int key : keys) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKey(key);
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event);
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:

                break;

            case KeyboardEvent.KEY_DOWN:

                break;

            case KeyboardEvent.KEY_LEFT:

                break;

            case KeyboardEvent.KEY_RIGHT:

                break;

            default:
                System.out.println("keyPressed() problem");
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

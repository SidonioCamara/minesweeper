package org.academiadecodigo.haltistas;

import org.academiadecodigo.haltistas.game.Game;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.init();

        Controller controller = new Controller(game);
        controller.init();
    }
}

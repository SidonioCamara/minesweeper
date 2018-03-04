package org.academiadecodigo.haltistas.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cursor {

    private int row;
    private int col;


    public Cursor(int row, int col) {

        this.row = row;
        this.col = col;


        //Todo: Set cursor initial position in newRectangle
        Rectangle rectangle = new Rectangle();

        rectangle.setColor(Color.BLUE);
        rectangle.fill();

    }


}

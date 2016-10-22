package ru.jedai86.xo.model;

import java.awt.*;

/**
 * Created by Jedai86 on 22.10.2016.
 */
public class Field {
    private final int FIELD_SIZE = 3;
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) {
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) {
        field[point.x][point.y] = figure;
    }

}

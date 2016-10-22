package ru.jedai86.xo.model;

/**
 * Created by Jedai86 on 22.10.2016.
 */
public class Player {

    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}

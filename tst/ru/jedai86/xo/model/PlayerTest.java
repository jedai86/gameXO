package ru.jedai86.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jedai86 on 22.10.2016.
 */
public class PlayerTest {
    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Test";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}
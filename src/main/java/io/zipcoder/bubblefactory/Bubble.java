package io.zipcoder.bubblefactory;

import java.awt.*;

/**
 * Created by Leon Hunter on 01/22/2018.
 */
public class Bubble {
    private Color color;

    public Bubble(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object bubble) {
        return this.getColor().equals(((Bubble) bubble).getColor());
    }
}


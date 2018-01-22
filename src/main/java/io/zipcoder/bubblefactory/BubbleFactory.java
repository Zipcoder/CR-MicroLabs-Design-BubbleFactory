package io.zipcoder.bubblefactory;

import io.zipcoder.tools.logging.LoggerHandler;
import io.zipcoder.tools.logging.LoggerWarehouse;

import java.awt.*;
import java.util.stream.Stream;

/**
 * Created by Leon Hunter on 01/22/2018.
 */
public class BubbleFactory {
    public static final LoggerHandler log = LoggerWarehouse.getLogger(BubbleFactory.class);
    private final Color color;

    public BubbleFactory(Color color) {
        this.color = color;
    }

    public Bubble makeBubble() {
        String logInformation = "%s colored bubbles erupt from the bubble factory...";
        Bubble bubble = new Bubble(color);
        log.info(logInformation, color);

        return bubble;
    }

    public Bubble[] makeBubbles(int numberOfBubbles) {
        return Stream
                .generate(this::makeBubble)
                .limit(numberOfBubbles)
                .toArray(Bubble[]::new);
    }

    public Color getColor() {
        return color;
    }
}

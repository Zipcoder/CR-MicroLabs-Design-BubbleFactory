package test.zipcoder.BubbleFactory;

import io.zipcoder.bubblefactory.Bubble;
import io.zipcoder.bubblefactory.BubbleFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.stream.Stream;

/**
 * Created by Leon Hunter on 01/22/2018.
 */
public class BubbleFactoryTester {
    BubbleFactory bf = new BubbleFactory(Color.blue);
    Color expectedColor = Color.blue;


    @Before
    public void testConstructor() {
        // : Given
        Color expected = this.expectedColor;
        this.bf = new BubbleFactory(expected);

        // : When
        Color actual = bf.getColor();

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCreateBubble() {
        // : Given
        Bubble expected = new Bubble(expectedColor);

        // : When
        Bubble actual = bf.makeBubble();

        // : Then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testCreateBubbles() {
        // : Given
        Bubble expected = new Bubble(expectedColor);

        // : When
        Bubble[] array = bf.makeBubbles(999);

        // : Then
        Stream.of(array).forEach(actual -> Assert.assertEquals(actual, expected));
    }
}


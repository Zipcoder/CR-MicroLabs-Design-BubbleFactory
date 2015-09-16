package test.zipcoder.BubbleFactory;

import io.zipcoder.BubbleFactory.Bubble;
import io.zipcoder.BubbleFactory.BubbleFactory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by thook on 9/16/15.
 */
public class BubbleFactoryTester {
    BubbleFactory bf = new BubbleFactory();

    @Test
    public void bubbleShouldReturnColor(){

        Bubble bubble = bf.makeBubbles("blue");
        assertEquals("Color must be yellow","yellow", bubble.getBubbleColor());
    }
}


package io.zipcoder.BubbleFactory;

/**
 * Created by thook on 9/16/15.
 */
public class BubbleFactory {

    public Bubble makeBubbles(String color){
        Bubble tinyBubbles = new Bubble(color);
        return tinyBubbles;
    }

    public static void main(String[] args){
        BubbleFactory factory = new BubbleFactory();
        Bubble myBubble = factory.makeBubbles("red");
    }

}

package com.lti;

/**
 * Created by busis on 2020-12-01.
 */
public class Square {
    private int side;
    public int calculateArea(int side){
        return side*side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

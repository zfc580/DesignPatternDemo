package com.example.factory;

import com.example.factory.color.Color;
import com.example.factory.shape.Shape;

/**
 * Created by fucai.zhou on 17/6/27.
 */

public abstract class SimpleFactory {


    abstract Shape createShape(int type);

    abstract Color createColor(int type);



    public void draw(int type){
        Shape mShape = createShape(type);
        mShape.draw();
    }

    public void fill(int type){
        Color mColor = createColor(type);
        mColor.fill();
    }

}

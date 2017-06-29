package com.example.factory;

import com.example.factory.color.Color;
import com.example.factory.shape.Circle;
import com.example.factory.shape.Rectangle;
import com.example.factory.shape.Shape;
import com.example.factory.shape.Square;

/**
 * Created by fucai.zhou on 17/6/27.
 */

public class ShapeFactory extends SimpleFactory {

    public final static int TYPE_RECTANGLE = 0;
    public final static int TYPE_SQUARE = 1;
    public final static int TYPE_CIRLE = 2;

    @Override
    Shape createShape(int type) {

        Shape mShape = null;

        switch (type){

            case TYPE_RECTANGLE:
                mShape = new Rectangle();
                break;

            case TYPE_SQUARE:
                mShape = new Square();
                break;

            case TYPE_CIRLE:
                mShape = new Circle();
                break;
        }
        return mShape;
    }

    @Override
    Color createColor(int type) {
        return null;
    }
}

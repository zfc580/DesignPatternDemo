package com.example.factory;

import com.example.factory.color.Blue;
import com.example.factory.color.Color;
import com.example.factory.color.Green;
import com.example.factory.color.Red;
import com.example.factory.shape.Shape;

/**
 * Created by fucai.zhou on 17/6/27.
 */

public class ColorFactory extends SimpleFactory {

    public final static int TYPE_RED = 0;
    public final static int TYPE_BLUE = 1;
    public final static int TYPE_GREEB = 2;

    @Override
    Shape createShape(int type) {

        return null;
    }

    @Override
    Color createColor(int type) {
        Color mColor = null;

        switch (type){

            case TYPE_RED:
                mColor = new Red();
                break;

            case TYPE_BLUE:
                mColor = new Blue();
                break;

            case TYPE_GREEB:
                mColor = new Green();
                break;
        }
        return mColor;
    }
}

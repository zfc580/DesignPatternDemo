package com.example.factory;

/**
 * Created by fucai.zhou on 17/6/28.
 */

public class FactoryCreator {

    public static final int FAC_COLOR = 0x11;
    public static final int FAC_SHAPE = 0x12;

    public static SimpleFactory getFactory(int type){

        SimpleFactory mFactory = null;
        switch (type){
            case FAC_COLOR:
                mFactory = new ColorFactory();
                break;

            case FAC_SHAPE:
                mFactory = new ShapeFactory();
                break;
        }
        return mFactory;
    }

}

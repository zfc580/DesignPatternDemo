package com.example.factory;

import com.example.factory.color.Blue;
import com.example.factory.color.Green;
import com.example.factory.color.Red;
import com.example.factory.shape.Circle;
import com.example.factory.shape.Rectangle;
import com.example.factory.shape.Square;

/**
 * Created by fucai.zhou on 17/6/27.
 *
 * 工厂模式，减少依赖
 */

public class FactoryPartternDemo {

    public static void main(String[] args){

        SimpleFactory mShapeFactory = FactoryCreator.getFactory(FactoryCreator.FAC_SHAPE);
        mShapeFactory.draw(ShapeFactory.TYPE_RECTANGLE);
        mShapeFactory.draw(ShapeFactory.TYPE_SQUARE);
        mShapeFactory.draw(ShapeFactory.TYPE_CIRLE);

        SimpleFactory mColorFactory = FactoryCreator.getFactory(FactoryCreator.FAC_COLOR);
        mColorFactory.fill(ColorFactory.TYPE_RED);
        mColorFactory.fill(ColorFactory.TYPE_BLUE);
        mColorFactory.fill(ColorFactory.TYPE_GREEB);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Square square = new Square();
        square.draw();
        Circle circle = new Circle();
        circle.draw();
        Red red = new Red();
        red.fill();
        Blue blue = new Blue();
        blue.fill();
        Green green = new Green();
        green.fill();
    }
}

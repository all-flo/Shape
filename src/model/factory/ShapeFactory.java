package model.factory;

import model.contract.IShape2D;
import model.implementation.Rectangle;

/**
 * Created by flallard on 06/11/2017.
 */
public final class ShapeFactory {

    public static final ShapeFactory INSTANCE = new ShapeFactory();

    private ShapeFactory (){

    }

    public IShape2D createRectangle (double length, double width){
        return new Rectangle(length, width);
    }
}

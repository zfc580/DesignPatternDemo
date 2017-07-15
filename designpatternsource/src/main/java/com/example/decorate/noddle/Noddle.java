package com.example.decorate.noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 *
 * 面抽象类
 */

public abstract class Noddle {

    public String mDescription = "Unknow Noddle";

    public float mPrice = 0.0f;

    public String getDescription(){
        return mDescription;
    }
    public float cost(){
        return mPrice;
    }
}

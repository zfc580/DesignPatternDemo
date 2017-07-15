package com.example.decorate.burdening;

import com.example.decorate.noddle.Noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 *
 * 装饰者抽象类
 */

abstract class DecorateNoddle extends Noddle {

    public Noddle mNoddle;

    public DecorateNoddle(Noddle noddle){
        mNoddle = noddle;
    }

    @Override
    public String getDescription() {
        return mNoddle.getDescription() + mDescription;
    }

    @Override
    public float cost() {
        return mNoddle.cost() + mPrice;
    }
}

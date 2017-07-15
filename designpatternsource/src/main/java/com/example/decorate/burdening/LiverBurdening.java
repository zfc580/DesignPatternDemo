package com.example.decorate.burdening;

import com.example.decorate.noddle.Noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 */

public class LiverBurdening extends DecorateNoddle {

    public LiverBurdening(Noddle noddle) {
        super(noddle);
    }

    @Override
    public String getDescription() {
        mDescription = " + Liver";
        return super.getDescription();
    }

    @Override
    public float cost() {
        mPrice = 2.0f;
        return super.cost();
    }
}

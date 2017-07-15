package com.example.decorate.burdening;

import com.example.decorate.noddle.Noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 */

public class LeanBurdening extends DecorateNoddle {

    public LeanBurdening(Noddle noddle) {
        super(noddle);
    }

    @Override
    public String getDescription() {
        mDescription = " + Lean";
        return super.getDescription();
    }

    @Override
    public float cost() {
        mPrice = 1.5f;
        return super.cost();
    }
}

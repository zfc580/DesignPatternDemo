package com.example.decorate.noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 *
 * 被装饰者：清汤面
 */

public class LightSoupNoddle extends Noddle {

    @Override
    public String getDescription() {
        return "LightSoupNoddle";
    }

    @Override
    public float cost() {
        return 10.0f;
    }
}

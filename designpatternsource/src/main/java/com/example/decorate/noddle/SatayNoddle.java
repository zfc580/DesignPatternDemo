package com.example.decorate.noddle;

/**
 * Created by fucai.zhou on 17/7/15.
 *
 *  被装饰者：沙茶面
 */

public class SatayNoddle extends Noddle {

    @Override
    public String getDescription() {
        return "SatayNoddle";
    }

    @Override
    public float cost() {
        return 15.0f;
    }
}

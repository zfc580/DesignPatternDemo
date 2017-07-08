package com.example.strategy.hero;

import com.example.strategy.skill.GunSkill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 * 英雄角色：鲁班七号
 */
public class LuBanQiHao extends Hero {

    public LuBanQiHao() {
        super();
        System.out.println("鲁班七号：魔法大师，智障250，@￥%*&￥# ");
        mBehavior = new GunSkill();
    }

}

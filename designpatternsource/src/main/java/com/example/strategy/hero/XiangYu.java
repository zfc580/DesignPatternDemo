package com.example.strategy.hero;

import com.example.strategy.skill.KnifeSkill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  英雄角色：项羽
 */

public class XiangYu extends Hero {

    public XiangYu(){
        super();
        System.out.println("项羽：我命由我... ");
        mBehavior = new KnifeSkill();
    }
}

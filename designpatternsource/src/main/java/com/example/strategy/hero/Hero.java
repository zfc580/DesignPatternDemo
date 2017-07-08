package com.example.strategy.hero;

import com.example.strategy.skill.SkillBehavior;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  英雄抽象类
 */

public abstract class Hero {

    public SkillBehavior mBehavior;

    public Hero(){
        System.out.print("英雄出生 ");
    }

    public void performSkill(){
        if(mBehavior != null){
            mBehavior.useSkill();
        }
    }

    public void setSkillBehavior(SkillBehavior behavior){
        mBehavior = behavior;
    }

}

package com.example.strategy.hero;

import com.example.strategy.skill.ArrowSkill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  英雄角色：狄仁杰
 */

public class DiRenJie extends Hero {

    public DiRenJie(){
        super();
        System.out.println("狄仁杰：代表法律制裁你...");
        mBehavior = new ArrowSkill();
    }
}

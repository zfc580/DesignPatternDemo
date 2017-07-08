package com.example.strategy;

import com.example.strategy.hero.DiRenJie;
import com.example.strategy.hero.Hero;
import com.example.strategy.hero.LuBanQiHao;
import com.example.strategy.hero.XiangYu;
import com.example.strategy.skill.GunSkill;
import com.example.strategy.skill.SkillBehavior;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  王者峡谷
 */

public class KingGorgeDemo {

    public static void main(String[] args){

        Hero mDi = new DiRenJie();
        SkillBehavior gunSkill = new GunSkill();
        mDi.setSkillBehavior(gunSkill);
        mDi.performSkill();
    }
}

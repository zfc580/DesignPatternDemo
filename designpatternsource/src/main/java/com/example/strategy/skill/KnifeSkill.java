package com.example.strategy.skill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  长刀技能
 */

public class KnifeSkill implements SkillBehavior {

    @Override
    public void useSkill() {
        System.out.println("释放长刀技能");
    }
}

package com.example.strategy.skill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  手枪技能
 */

public class GunSkill implements SkillBehavior {

    @Override
    public void useSkill() {
        System.out.println("释放手枪技能");
    }
}

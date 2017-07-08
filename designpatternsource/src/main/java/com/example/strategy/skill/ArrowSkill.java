package com.example.strategy.skill;

/**
 * Created by fucai.zhou on 17/7/8.
 *
 *  箭技能
 */

public class ArrowSkill implements SkillBehavior{

    @Override
    public void useSkill() {
        System.out.println("释放暗箭技能");
    }
}

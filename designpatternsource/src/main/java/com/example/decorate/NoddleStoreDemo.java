package com.example.decorate;

import com.example.decorate.burdening.LeanBurdening;
import com.example.decorate.burdening.LiverBurdening;
import com.example.decorate.noddle.LightSoupNoddle;
import com.example.decorate.noddle.Noddle;
import com.example.decorate.noddle.SatayNoddle;

/**
 * Created by fucai.zhou on 17/7/15.
 */

public class NoddleStoreDemo {

    public static void main(String[] args){

        Noddle satayNoddle = new SatayNoddle();
        satayNoddle = new LiverBurdening(satayNoddle);
        satayNoddle = new LeanBurdening(satayNoddle);
        System.out.println(satayNoddle.getDescription() + ", price: " + satayNoddle.cost());

        Noddle lightSoupNoddle = new LightSoupNoddle();
        lightSoupNoddle = new LiverBurdening(lightSoupNoddle);
        lightSoupNoddle = new LeanBurdening(lightSoupNoddle);
        System.out.println(lightSoupNoddle.getDescription() + ", price: " + lightSoupNoddle.cost());
    }
}

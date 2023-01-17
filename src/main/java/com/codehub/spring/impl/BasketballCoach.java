package com.codehub.spring.impl;

import com.codehub.spring.Coach;
import org.springframework.beans.factory.InitializingBean;

public class BasketballCoach implements Coach, InitializingBean {

    private String prop;

    public void init(){

        System.out.println("init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("afterPropertiesSet");
    }

    public static final String PERFORM_BASKET_BALL_30_MIN_WORKOUT = "perform BasketBall 30 min workout";

    @Override
    public String performDailyWorkout() {
        return PERFORM_BASKET_BALL_30_MIN_WORKOUT;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {

        System.out.println("set prop:"+prop);
        this.prop = prop;
    }
}

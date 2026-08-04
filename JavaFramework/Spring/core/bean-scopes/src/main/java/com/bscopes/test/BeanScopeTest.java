package com.bscopes.test;

import com.bscopes.beans.Game;
import com.bscopes.config.ScopeJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeJavaConfig.class);
        Game game1 = applicationContext.getBean("chess", Game.class);
        Game game2 = applicationContext.getBean("chess", Game.class);

        Game game3 = applicationContext.getBean("carom", Game.class);
        Game game4 = applicationContext.getBean("carom", Game.class);

        System.out.println("game1==game2 ? :" + (game1==game2));
        System.out.println("game3==game4 ? :" + (game4==game3));
    }
}

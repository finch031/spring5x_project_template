package com.yee.spring5x;

import com.yee.spring5x.entity.Axe;
import com.yee.spring5x.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yusheng
 * @version 1.0.0
 * @datetime 2020/10/3 12:35
 */

public class Spring5xApplication {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println(ctx.getId());
        System.out.println(ctx.getStartupDate());
        System.out.println(ctx.getDisplayName());
        System.out.println(ctx.getApplicationName());

        Axe axe = ctx.getBean(Axe.class);
        System.out.println(axe.chop());

        Person person = (Person) ctx.getBean("person");
        person.useAxe();
    }
}

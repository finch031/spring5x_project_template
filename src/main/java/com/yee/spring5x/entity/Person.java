package com.yee.spring5x.entity;

/**
 * @author yusheng
 * @version 1.0.0
 * @datetime 2020/10/3 12:40
 */
public class Person {
    private Axe axe;

    public void setAxe(Axe axe){
        this.axe = axe;
    }

    public void useAxe(){
        System.out.println("person use axe: " + axe.chop());
    }
}

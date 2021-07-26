package org.cochise.Point05_polymorphism;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 对象向上转型（多态）
 * 格式： 父类名称 对象名 = new 子类名称（）
 * 格式： 接口名称 对象名 = new 实现类名称（）
 *
 * 对象向下转型 (还原)
 * 格式： 子类名称 对象名 = （子类名称）父类对象
 */
public class Son extends Parent{
    int age = 10;

    @Override
    public void showAge(){
        System.out.println(this.age);
    }

    public void paly(){
        System.out.println(super.getClass().getName());
    }
    public static void main(String[] args) {
        Parent parent = new Son();

        // 成员变量看左
        System.out.println(parent.age);

        // 成员方法看右
        parent.showAge();
        // 只能调用子类从父类继承的方法，子类特定的方法无法调用
        // parent.play();

        // 向下转型的对象必须是向上转型过来的，且只能转型成向上转型前的类型
        Son son = (Son)parent;
        son.paly();

    }


}

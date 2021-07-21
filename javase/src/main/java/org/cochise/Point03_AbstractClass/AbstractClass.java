package org.cochise.Point03_AbstractClass;

/**
 * 1，抽象类不能创建对象。只能创建其非抽象子类的对象。
 * 2，抽象类中可以有构造方法，仅供子类创建对象时自动调用。
 * 3，抽象类中不一定包含抽象方法，但是有抽象方法的类一定是抽象类。
 * 4，抽象类的子类，必须重写所有抽象方法，否则该子类还得是抽象类。
 */
public abstract class AbstractClass {
    // 无参构造方法
    public AbstractClass() {
    }

    public abstract void test01();
    public abstract void test02();
}

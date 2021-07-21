package org.cochise.Point04_Interface;

/**
 * 1.JDK8以后，接口中可以定义默认方法和静态方法。
 * 2.接口默认方法可以被继承也可以被重写.
 * 3.接口静态方法由接口直接调用。
 * 4.JDK9以后，接口中的默认方法和静态方法可以被定义成私有private
 * 5.实现类必须实现接口的所有抽象方法，除非实现类是抽象类。
 * 6.接口不能有构造方法
 * 7.类与类之间是单继承，类与接口之间是多实现，接口与接口之间是多继承的。
 */
public interface MyInterface {
    public static final String str1 = "常量";
    public abstract void method01();
    public default void method02(){};
    public static void method03(){};
//    private void method04(){};---------JDK9
//    private static void method04(){};---------JDK9
}

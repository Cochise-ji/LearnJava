package org.cochise.Points06_InnerClass;

public class Main {
    public static void main(String[] args) {

        // 直接创建内部类的方法
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();

    }
}

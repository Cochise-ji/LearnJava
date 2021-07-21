package org.cochise.Point04_Interface;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method01() {
    }

    @Override
    public void method02() {
        MyInterface.super.method02();
    }

    public static void main(String[] args) {
        MyInterface.method03();
    }

}

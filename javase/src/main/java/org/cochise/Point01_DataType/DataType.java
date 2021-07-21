package org.cochise.Point01_DataType;




/**
 * 自动类型转换（隐式）：从小到大
 * 强制类型转换（显示）：从大到小
 * byte->short->int->long->float->double
 *
 */
public class DataType {
    public static void main(String[] args) {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);

        // bool
        System.out.println("基本类型：bool 二进制位数：1");


    }
}

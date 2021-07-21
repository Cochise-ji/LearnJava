package com.cochise;

/**
 * 增强for循环
 */
public class Foreach {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        //遍历数组的元素
        for (int x : numbers){
            System.out.println(x);
        }
    }
}

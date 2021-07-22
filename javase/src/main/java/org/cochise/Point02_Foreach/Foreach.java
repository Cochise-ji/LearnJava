package org.cochise.Point02_Foreach;


import java.util.Arrays;
import java.util.List;

/**
 * 增强for循环
 */
public class Foreach {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        //遍历数组的元素
        for (int x : numbers) {
            System.out.println(x);
        }

        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        intList.forEach(x -> System.out.println(x*2));
    }
}

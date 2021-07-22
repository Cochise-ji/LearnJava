package org.cochise.Points06_InnerClass;

public class OuterClass {

    private int outerVar = 100;
    private String str = "AAAAAAAA";
    public class InnerClass{

        private int innerVar = 200;
        private String str = "BBBBBBBBB";

        // 内用外，直接使用
        public void InnerMethod(){
            System.out.println(outerVar);

            // 内部类成员变量直接用this
            System.out.println(this.str);

            // 外部类成员变量需加上外部类名（类名）
            System.out.println(OuterClass.this.str);
        }


    }

    // 外用内，先创建内部类对象
    public void OuterMethod(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerVar);

        // 内部类成员变量直接用this
        System.out.println(this.str);

        // 外部类成员变量需加上外部类名（对象名）
        System.out.println(innerClass.str);
    }
}

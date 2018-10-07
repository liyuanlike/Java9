package com.atguigu.java9;

interface MyInterface {

    //JDK7：只能声明全局常量（public static final）和抽象方法（public abstract）
    void method1();

    //JDK8：声明静态方法和默认方法
    static void method2() {
        System.out.println("method2");
    }

    default void method3() {
        System.out.println("method3");
        method4();
    }

    //JDK9：声明私有方法
    private void method4() {
        System.out.println("私有方法");
    }

}

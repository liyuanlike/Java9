package com.atguigu.java9;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DiamondOperatorTest {

    @Test
    public void test() {
        diamondOperator();
    }

    private void diamondOperator() {
        //创建一个继承于HashSet的匿名子类的对象
        Set<String> set = new HashSet<>() {};

        set.add("MM");
        set.add("JJ");
        set.add("GG");
        set.add("DD");

        set.forEach(System.out::println);
    }

}

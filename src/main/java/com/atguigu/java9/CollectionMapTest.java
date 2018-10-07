package com.atguigu.java9;

import org.junit.Test;

import java.util.*;

public class CollectionMapTest {

    //JDK9之前：创建一个只读集合
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lilei");
        list.add("HanMeimei");

        //调用Collections的方法，将list变为只读的
        List<String> newList = Collections.unmodifiableList(list);

//        newList.add("Tim");//不能执行，否则报异常

        newList.forEach(System.out::println);
    }

    @Test
    public void test2() {
        //List
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3));

//        list.add(4);

        list.forEach(System.out::println);

        //Set
        Set<Integer> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3)));

//        set.add(4);

        set.forEach(System.out::println);

        //Map
        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("Tom", 78);
                put("Jerry", 88);
                put("Tim", 68);
            }
        });

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    //JDK9：创建一个只读集合
    @Test
    public void test3() {
        //List
        List<Integer> list = List.of(1, 2, 3);

//        list.add(4);

        list.forEach(System.out::println);

        //Set
        Set<Integer> set = Set.of(2, 3, 4);

//        set.add(6);

        set.forEach(System.out::println);

        //Map
        //创建只读集合的方式一：
        Map<String, Integer> map = Map.of("Tom", 23, "Jerry", 22, "Lilei", 12, "HanMeimei", 18);

//        map.put("Tim",33);

        //创建只读集合的方式二：
        Map<String, Integer> map1 = Map.ofEntries(Map.entry("Tom", 23), Map.entry("Jerry", 21));

//        map1.put("Tim",33);

        System.out.println(map1);
    }

}

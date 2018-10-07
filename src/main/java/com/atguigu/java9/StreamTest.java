package com.atguigu.java9;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    //JDK9针对Stream新添加了4个方法

    //1.takeWhile(Predicate<? super T> predicate)
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(45, 56, 33, 77, 44, 98, 76, 78, 33);

        Stream<Integer> stream = list.stream();

        stream.takeWhile(x -> x < 70).forEach(System.out::println);

        System.out.println();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list1.stream().takeWhile(x -> x < 5).forEach(System.out::println);
    }

    //2.dropWhile(Predicate<? super T> predicate)：与takeWhile(Predicate<? super T> predicate)正好相反
    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(45, 56, 33, 77, 44, 98, 76, 78, 33);

        Stream<Integer> stream = list.stream();

        stream.dropWhile(x -> x < 70).forEach(System.out::println);

        System.out.println();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list1.stream().dropWhile(x -> x < 5).forEach(System.out::println);
    }

    //3.ofNullable(T t)：t可以为null
    @Test
    public void test3() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);
        stream1.forEach(System.out::println);

        System.out.println();

        //如果只有单个元素，此元素不能为null，否则报NullPointerException
//        Stream<Object> stream2 = Stream.of(null);

        Stream<String> stream3 = Stream.ofNullable("Tom");
        System.out.println(stream3.count());//1

        Stream<String> stream4 = Stream.ofNullable(null);
        System.out.println(stream4.count());//0
    }

    //4.iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
    @Test
    public void test4() {
        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);

        System.out.println();

        Stream.iterate(0, x -> x < 10, x -> x + 1).forEach(System.out::println);
    }

}

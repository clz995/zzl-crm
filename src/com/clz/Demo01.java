package com.clz;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {

    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

    @Test
    public void test01(){
        Optional<Integer> collect = list.stream().collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(collect.get());

    }

}

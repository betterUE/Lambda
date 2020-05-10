package com.shizq;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author UE
 * @date 2020/5/5 21:46
 * @Description TODO
 * @Version 1.0
 */
public class CreateStream {
    /**
     * 创建流
     */

    @Test
    public void test1(){
        /*
            一、 通过Collection 提供的两个方法 stream() 和 parallelStream()
         */
        List<String> list = new ArrayList<>();
        // 获取一个顺序流
        Stream<String> stream = list.stream();
        // 获取一个并行流
        Stream<String> parallelStream = list.parallelStream();

        /*
            二、通过Arrays 中的stream() 获取一个数组流
         */
        Integer[] nums = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(nums);

        /*
            三、通过Stream 中的静态方法 of()
         */
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        // 或者
        Integer[] nums2 = {1,2,3,4,5,6,7,8,9,0};
        Stream<Integer> stream3 = Stream.of(nums2);

        /*
            四、创建无限流
         */
        // 迭代
        Stream<Integer> stream4 = Stream.iterate(0,(x) -> x+2).limit(10);
        stream4.forEach(System.out::println);
        
        // 生成
        Stream<Double> stream5 = Stream.generate(Math::random).limit(2);
        stream5.forEach(System.out::println);
    }
}

package com.shizq;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author UE
 * @date 2020/5/5 16:09
 * @Description 统计单词的个数（使用lambda 和 Stream 方式）
 * @Version 1.0
 */
public class WordCountNew {
    public static void main(String[] args) {
        //读取文件
        InputStream inputStream = WordCountNew.class.getClassLoader().getResourceAsStream("word.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        bufferedReader.lines().flatMap(x -> Stream.of(x.split(" "))).
                collect(Collectors.groupingBy(x -> x)).forEach((a, b) -> System.out.println(a + ":" + b.size()));
    }
}

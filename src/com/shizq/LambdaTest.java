package com.shizq;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author UE
 * @date 2020/5/4 21:41
 * @Description TODO
 * @Version 1.0
 */
public class LambdaTest {
    @Test
    public void test1() {
        /*lambda是一个匿名函数，即没有函数名的函数，（简化了匿名委托的使用，让你的代码更加简洁）
         *
         */
        // 匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("ue");
            }
        };

        // 使用lambda,第一个() 对应上面匿名内部类中的 run() 的括号
        Runnable r1 = ()->System.out.println("ue");
    }

    public void test2(){
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Long.compare(o1.length(),o2.length());
            }
        });
        // 将上面的方法替换为 lambda
        TreeSet<String> ts2 = new TreeSet<>((o1,o2) -> Long.compare(o1.length(),o2.length()));

        TreeSet<String> ts3 = new TreeSet<>((String o1,String o2) -> Long.compare(o1.length(),o2.length()));
    }

    /**
     * 6种格式
     */
    //第一种格式
    public void lambdaTest1(){
        Runnable r1 = ()->System.out.println("ue");
    }

    public void lambdaTest2(){
        Consumer consumer1 = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        Consumer consumer2 = (o) ->  System.out.println(o);
    }
    // 格式三
    public void lambdaTest3(){
        Consumer consumer2 = o ->  System.out.println(o);
    }
    // 格式四
    public void lambdaTest4(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                System.out.println("函数式接口");
                return Integer.compare(a,b);
            }
        };

        Comparator<Integer> com2 = (a,b) -> {
            System.out.println("函数式接口");
            return Integer.compare(a,b);
        };
    }

    // 格式五
    public void lambdaTest5(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a,b);
            }
        };

        Comparator<Integer> com2 = (Integer a,Integer b) ->
            Integer.compare(a,b);
    }

}

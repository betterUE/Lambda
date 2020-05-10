package com.shizq;

import com.shizq.entity.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author UE
 * @date 2020/5/5 20:36
 * @Description TODO
 * @Version 1.0
 */
public class Stream01 {

    List<Person> persons = Arrays.asList(
            new Person("clk",19,90),
            new Person("bd",18,85),
            new Person("jz",20,92),
            new Person("de",17,95),
            new Person("hz",18,91)
    );

    @Test
    public void test1(){
        //取出年龄大于18岁的姓名，按字典排序，并输出控制台
        persons.stream().filter(p -> p.getAge()>18).map(Person::getName).sorted().forEach(System.out::println);
    }
}

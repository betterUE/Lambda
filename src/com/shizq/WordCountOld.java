package com.shizq;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author UE
 * @date 2020/5/5 16:09
 * @Description 统计单词的个数（传统的方法）
 * @Version 1.0
 */
public class WordCountOld {
    public static void main(String[] args) throws Exception {
        //读取文件
        InputStream inputStream = WordCountOld.class.getClassLoader().getResourceAsStream("word.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        Map<String, Integer> map = new HashMap<>(16);

        while ((line=bufferedReader.readLine()) != null){
            String[] strArray = line.split(" ");
            initResult(map,strArray[0]);
            initResult(map,strArray[1]);
        }
        System.out.println(map);
    }

    private static void initResult(Map<String, Integer> map, String key) {
        Integer value = 1;
        if(map.containsKey(key)){
            value = map.get(key)+1;
        }
        map.put(key,value);
    }
}

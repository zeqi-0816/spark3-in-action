package com.mao.spark.rdd;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;

/**
 * Mao: Mzq
 * 2024/5/7
 */
public class FromCollection {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("Spark");
        JavaSparkContext sc = new JavaSparkContext(conf);

        sc.parallelize(Arrays.asList("张三", "李四", "王五"))
                .collect()
                .forEach(System.out::println);

        sc.close();
    }
}

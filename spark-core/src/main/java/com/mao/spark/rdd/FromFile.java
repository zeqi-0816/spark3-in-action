package com.mao.spark.rdd;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Mao: Mzq
 * 2024/5/7
 */
public class FromFile {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("spark-rdd");
        JavaSparkContext sc = new JavaSparkContext(conf);

        sc.textFile("input/data.txt")
                .collect()
                .forEach(System.out::println);

        sc.close();
    }
}

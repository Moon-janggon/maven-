package com.nhnacademy;
import java.util.Objects;
import java.util.Random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class App
{
    public static void main( String[] args )
    {
        //실습 1
        Random random =new Random();
        System.out.println(random.nextInt(100));

        RandomDataGenerator randomDataGenerator=new RandomDataGenerator();
        System.out.println(randomDataGenerator.nextInt(1,100));

        //실습 2
        String temp="temp";
        System.out.println(Objects.isNull(temp)?"Null":"Not Null");
        System.out.println(temp.isEmpty()?"Null":"Not Empty");

        //실습 3


    }
}

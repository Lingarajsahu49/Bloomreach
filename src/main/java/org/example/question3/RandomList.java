package org.example.question3;

import java.util.*;

public class RandomList {

    public static List<Integer> getRandomList(){
        int max = 100;
        int min = 1;
        List <Integer> list = new ArrayList<>();
        for(int i =0;i<1000;i++){
            int randomNum = new Random().nextInt((max - min) + 1) + min;
            list.add(randomNum);
        }
        return list;
    }

    public static List<Integer> sortList(List<Integer> list){

         Collections.sort(list);
         return list;
    }
}

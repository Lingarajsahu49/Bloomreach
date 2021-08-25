package org.example;

import org.example.question3.RandomList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Question3test {

    @Test
    public void test1(){
        for(int i =0;i<1000;i++){
            List<Integer> list = RandomList.getRandomList();
            assertNotNull(list);
           new SortThread(list){
               @Override
               public void run() {
                   super.run();
                   System.out.println("Random List "+list);
                   RandomList.sortList(list);

                   System.out.println("Sorted List "+list);

               }
           }.start();
        }



    }

    class SortThread extends Thread{
        List<Integer> list;
        public SortThread(List<Integer> list){
            this.list = list;
        }
    }
}

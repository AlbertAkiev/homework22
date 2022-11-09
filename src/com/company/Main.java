package com.company;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> taksan = new ArrayList<>();
        ArrayList<Integer> jupsan = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            arrayList.add(random.nextInt(0, 100));
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 ==0){
                jupsan.add(i);
            }else {
                taksan.add(i);
            }
        }
        System.out.println("tak san"+taksan);
        System.out.println("jup san"+jupsan);
    }

}


package com.company;

import static java.util.Arrays.sort;
public class Main {
    public static int fact(int numb) {
        int f=1;
        for (int i=2; i<=numb; i++) {
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        int[] array;
        int size;
        do {
            array = new int[(int) ((Math.random()) * 10)];
        } while (array.length==0);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("\n");
        sort(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

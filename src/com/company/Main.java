package com.company;
import static java.util.Arrays.sort;
import java.util.Random;
public class Main {
    public static int fact(int numb) {
        int f=1;
        for (int i=2; i<=numb; i++) {
            f*=i;
        }
        return f;
    } //task7
    public static void task6_1() {
        int[] array1;
        int size;
        do {
            array1 = new int[(int) ((Math.random()) * 10)];
        } while (array1.length==0);
        for (int i=0; i<array1.length; i++) {
            array1[i] = (int)(Math.random()*100);
            System.out.println(array1[i]);
        }
        System.out.println("\n");
        sort(array1, 0, array1.length);
        int sum=0;
        for (int var : array1) {
            sum+=var;
            System.out.println(var);
        }
        System.out.println("\n");
        System.out.println(sum);
    }//+task3
    public static void task6_2() {
        int[] array2;
        int size;
        Random rnd = new Random();
        array2 = new int[(rnd.nextInt(20))];
        for (int i=0; i<array2.length; i++) {
            array2[i] = rnd.nextInt(100);
            System.out.println(array2[i]);
        }
        System.out.println("\n");
        sort(array2, 0, array2.length);
        int sum=0;
        for (int var : array2) {
            sum+=var;
            System.out.println(var);
        }
        System.out.println("\n");
        System.out.println(sum);
    }//+task3
    public static void main(String[] args) {
       task6_1();
       System.out.println("\n");
       task6_2();
       System.out.println("\n"+fact(10));
    }
}
